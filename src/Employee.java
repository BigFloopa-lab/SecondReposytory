public class Employee {
    private String firstName;
    private String secondName;
    private String lastName;
    private int workGroup;
    private int sallary;
    private static int counter = 1;
    private int id;

    public Employee(String firstName, String secondName, String lastName, int workGroup, int id, int sallary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.workGroup = workGroup;
        this.sallary = sallary;
        this.id = counter;
        counter++;
    }
    //нельзя менять
    public String getFirstname() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWorkGroup() {
        return workGroup;
    }

    public int getSallary() {
        return sallary;
    }

    public int getId() {
        return id;
    }

    //можно менять
    public int setWorkGroup(int workGroup) {
        this.workGroup = workGroup;
        return this.sallary;
    }

    public int setSallary(int sallary) {
        this.sallary = sallary;
        return this.sallary;
    }


    @Override
    public String toString() {
        return "Имя - " + firstName + ", Фамилия - " + secondName + ", Отчество - " + lastName + ", Номер отдела - " + workGroup + ", зарплата - " + sallary;
    }

    public String printShortInfo() {
        return "Имя - " + firstName + ", Зарплата - " + sallary;
    }

    @Override
    public boolean equals(Object o) {
        //проверка на тот же самое место ( тоже ли это самое)
        if (this == o) {
            return true;
        }
        //проверка на тот же класс
        if (this == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;            // приведение к типу Employee
        return sallary == employee.sallary;          // сравнение только зарплаты
    }

}





