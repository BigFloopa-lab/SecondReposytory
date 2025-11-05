public class Main {
    public static void main(String[] args) {
      Author first = new Author("Dmitriy", "Gluhovskiy" );
        System.out.println("first.name = " + first.name);
        System.out.println("first.surname = " + first.surname);

        Book test = new Book("Metro",2014, "D.G" );
        System.out.println("test.title = " + test.title);
        test.setAge(2104);
        System.out.println("test.getAge() = " + test.getAge());
        System.out.println("test.Author = " + test.Author);

        Book second = new Book("Carols",2013,"L.Swonson");
        second.setAge(1928);
        Book third = new Book ("Naming",2133,"SuperAuthor" );
        System.out.println("second.title = " + second.title);
        System.out.println("second.age = " + second.age);
        System.out.println("third.title = " + third.title);
    }
}