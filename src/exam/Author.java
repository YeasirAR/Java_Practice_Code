package exam;

public class Author {
    String firstName;
    String lastName;
    public Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;

    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        return "Author Name: "+firstName+" "+lastName;
    }

    public static void main(String[] args) {
        Author a = new Author("Mazedul","Zidan");
        System.out.println(a);
        a.setFirstName("Yeasir");
        a.setLastName("Arafat");
        System.out.println(a);
        System.out.println("First Name: "+a.getFirstName());
        System.out.println("Last Name: "+a.getLastName());

    }
}
