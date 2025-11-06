public class Main {
    public static void liner() {
        System.out.println("====================");
    }

    public static void main(String[] args) {
        liner();
        Author first = new Author("Dmitriy", "Gluhovskiy");
        System.out.println("first.name = " + first.name);
        System.out.println("first.surname = " + first.surname);
        Book firstB = new Book("Metro", 2014, first);
        System.out.println("test.title = " + firstB.title);
        firstB.setAge(2104);
        System.out.println("test.getAge() = " + firstB.getAge());
        liner();
        Author second = new Author("Fabian", "Lewingston");
        Book secondB = new Book("Tails", 2012, second);
        secondB.setAge(1928);
        System.out.println("secondB.title = " + secondB.title);
        System.out.println("secondB.age = " + secondB.age);
        System.out.println("secondB.author.name = " + secondB.getAuthor().getName());
        System.out.println("secondB.author.surname = " + secondB.getAuthor().getSurname());
        liner();
        Author third = new Author("George", "Floid");
        Book thirdB = new Book("Fow to breth", 2020, third);
        thirdB.setAge(2021);
        System.out.println("thirdB.title  = " + thirdB.title);
        System.out.println("thirdB.age = " + thirdB.getAge());
        System.out.println("thirdB.name = " + thirdB.getAuthor().name);
        System.out.println("thirdB.surname = " + thirdB.getAuthor().surname);


    }
}