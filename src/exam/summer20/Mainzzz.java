package exam.summer20;
class TextBook extends Book{
    String edition;
    TextBook(){
        super();
        System.out.println("This is a textbook");
    }
    TextBook(String n, String a) {
        super(n,a);
    }
    public void setGenre(String e){
        edition=e;
    }
}

class Book {
    String name;
    String author;
    Book(){

    }
    Book(String n, String a){
        name=n;
        author=a;
        System.out.println("This is a book");
    }
}
class Novel extends Book{
    Novel(String a, String b){
        super(a,b);
        System.out.println(name+" is a novel");
    }
}
class Test {
    public static void main(String[] args){
        Novel N = new Novel("Himu Mama",
                "Humayun Ahmed");
    }
}


