package test1;

class SciFi extends Movie{
    public SciFi()
    {
        super();
    }
    public SciFi(String Name, String Director, int ReleasedYear)
    {
        super(Name,Director,ReleasedYear);
    }
}
public class Movie {
    public static void main(String[] args)
    {
        SciFi movie1 = new SciFi();
        SciFi movie2 = new SciFi("Tenet","Nolan",2020);
    }
    String Name;
    String Director;
    int ReleasedYear;
    public Movie()
    {
        System.out.println("This is a movie");
    }
    public Movie(String Name, String Director, int ReleasedYear)
    {
        this.Name = Name;
        this.Director = Director;
        this.ReleasedYear = ReleasedYear;
    }
}

