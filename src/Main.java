
public class Main {
    public static void main(String[] args) {
        System.out.println("---1 task---");
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("---2 task---");
        System.out.println(fullName.toUpperCase());

        System.out.println("---3 task---");
        String rightName = fullName.replace("ё", "е");
        System.out.println(rightName);


    }
}


