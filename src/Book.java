// Класс Book с изменениями
public class Book {
    String title;
    int age;
    Author author;

    public Book(String title, int age, Author author) {
        this.title = title;
        this.age = age;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getAge() {
        return this.age;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
