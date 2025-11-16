public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void printAllEmployee() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.toString());
            }
        }
    }

    public double averageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSallary();
                count++;
            } else {
                break;
            }
        }
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0;
        }
    }

    // Вынесенный метод addEmployee
    public void addEmployee(int index, Employee employee) {
        if (index >= 0 && index < employees.length) {
            employees[index] = employee;
        } else {
            System.out.println("Индекс вне диапозона");
        }
    }
    public double calculateTax(double salary, String taxType) {
        switch (taxType) {
            case "PROPORTIONAL":
                return salary * 0.13;
            case "PROGRESSIVE":
                if (salary <= 150) return salary * 0.13;
                if (salary <= 350) return salary * 0.17;
                return salary * 0.21;
            default:
                return 0.0;
        }
    }


    // Изменение зарплаты сотрудников отдела на заданный процент
    public void increaseSalaryByDepartment(int departmentNumber, double percent) {
        for (Employee emp : employees) {
            if (emp == null) continue; // пропускаем пустые записи
            if (emp.getWorkGroup() != departmentNumber) continue; // пропускаем сотрудников не из нужного отдела

            int oldSalary = emp.getSallary();
            int newSalary = (int) (oldSalary * (1 + percent / 100.0));
            if (newSalary == oldSalary) continue; // если зарплата не изменится, пропускаем
            emp.setSallary(newSalary); // обновляем зарплату
        }
    }

    // Найти первого сотрудника отдела с зарплатой больше указанной и вывести его + индекс
    public void printFirstEmployeeAboveSalary(int departmentNumber, int salaryThreshold) {
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            if (emp == null) continue;
            if (emp.getWorkGroup() == departmentNumber && emp.getSallary() > salaryThreshold) {
                System.out.println("№" + (i + 1) + ": " + emp.printShortInfo());
                break;
            }
        }
    }

    // Вывести первые employeeNumber сотрудников с зарплатой меньше wage
    public void printEmployeesBelowSalary(int wage, int employeeNumber) {
        int count = 0;
        int i = 0;
        while (i < employees.length && count < employeeNumber) {
            Employee emp = employees[i];
            if (emp != null && emp.getSallary() < wage) {
                System.out.println(emp.printShortInfo());
                count++;
            }
            i++;
        }
    }

    // Проверить, есть ли сотрудник с таким же учетом зарплаты (используется equals)
    public boolean contains(Employee employee) {
        for (Employee emp : employees) {
            if (emp != null && emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public boolean addEmployeeFirstFree(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {          // нашлась свободная ячейка
                employees[i] = employee;          // кладём туда сотрудника
                return true;                      // успешное добавление
            }
        }
        return false;                            // свободных ячеек не нашлось
    }

    // Метод для поиска сотрудника по id
    // Возвращает объект сотрудника или null, если не найден
    public Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                return emp;// нашли сотрудника с нужным id
            }
        }
        return null;                           // не нашли такого сотрудника
    }
}