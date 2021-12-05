package exam;

public class Book {
    String title;
    String author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return "Book Title: "+title+"\n"+"Author Name: "+author+"\n"+"Book Price: $"+price+"\n";
    }

    public static void main(String[] args) {
        Book b= new Book("Algorithms","Thomas Cormen",12);
        System.out.println(b);

        b.setTitle("Electronics");
        b.setAuthor("Robert Boylsted");
        b.setPrice(15);
        System.out.println(b);

        Book b2= new Book("Java Fundamentals","James Gosling",20);
        System.out.println("Book Title: "+b2.getTitle());
        System.out.println("Book Author: "+b2.getAuthor());
    }
}
