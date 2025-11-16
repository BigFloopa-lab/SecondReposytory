
public class Main {
    public static void main(String[] args) {
        Employee first = new Employee("ivan", "ivanov", "ivanovich", 1, 1, 500);
        System.out.println(first);
        Employee second = new Employee("Larisa", "ivanova", "Shtern", 2, 1, 422);
        System.out.println(second);
        Employee third = new Employee("George", "kirilovich", "floyd", 3, 1, 212);
        System.out.println(third);
        Employee forth = new Employee("Lana", "Jacobson", "Rose", 2, 1, 312);
        System.out.println(forth.printShortInfo());
        EmployeeBook book = new EmployeeBook();
        book.addEmployee(0, new Employee("Ivan", "Ivanov", "Ivanovich", 1, 1, 50000));
        EmployeeBook books = new EmployeeBook();

        for (int i = 1; i <= 11; i++) {
            Employee emp = new Employee("Name" + i, "Surname" + i, "Patronymic" + i, i % 5 + 1, i, 1000 * i);
            boolean added = books.addEmployeeFirstFree(emp);
            System.out.println("Добавление сотрудника " + i + ": " + (added ? "успешно" : "не удалось (массив полный)"));
        }
    }
}



