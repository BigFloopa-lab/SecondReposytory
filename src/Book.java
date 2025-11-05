public class Book {
String title;
int age;
String Author;

public Book (String title,int age, String Author) {
    this.title = title;
    this.age = age;
    this.Author = Author;
}
    public String getTitle(){
    return this.title;
    }
    public int getAge(){
        return this.age;
    }
    public String getAuthor(){
        return this.Author;
    }
    public void setAge(int age){
    this.age = age;
    }
}

