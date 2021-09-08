

interface Movie {
    String movie1 = "The Ring";
    String movie2 = "Pride and Prejudice";
    abstract void displayMovie () ;
}

class Horror implements Movie {

    @Override
    public void displayMovie() {
        System.out.println(movie1+": "+"This is a horror movie");
    }
}

class Drama implements Movie {

    @Override
    public void displayMovie() {
        System.out.println(movie2+": "+"This is a drama movie" );
        System.out.println("The movie is a book adaptation");
    }
}

// scenario 2:
class Book {
    String name, author ;
    int publishedYear, copies ;

    Book (String name, String author, int copies, int publishedYear) {
        this.author = author ;
        this.name = name ;
        this.copies = copies ;
        this.publishedYear = publishedYear ;
    }

    void saleIncrease (int value) {
        copies += value ;
    }
    void printBookDetails () {
        System.out.println("Name: " + name + "\n" + "Published Year: " + publishedYear + "\n" + "Author: " + author + "\n" + "Initial Copies: " + copies);

    }

}

class Thriller extends Book {
    String name, author ;
    int publishedYear, copies ;

    Thriller (String name, String author, int copies, int publishedYear) {
        super(name, author, copies, publishedYear);
    }
}

class ScienceFiction extends Book {
    String name, author ;
    int publishedYear, copies ;

    ScienceFiction (String name, String author, int copies, int publishedYear) {
        super(name, author, copies, publishedYear);
    }
}
// scenario 3:

abstract class Music {
    String name, artist ;
    int numOfConcerts, releaseYear ;

    Music (String name, String artist, int numOfConcerts, int releaseYear) {
        this.name = name ;
        this.artist = artist ;
        this.numOfConcerts = numOfConcerts ;
        this.releaseYear = releaseYear ;
    }

    void printMusicDetails () {
        System.out.println("Music name: " + name + "\n" + "Artist: " + artist + "\n" + "Total number of concerts: " + numOfConcerts + "\n" + "Release Year: " + releaseYear);
    }

    abstract void announceConcerts () ;
}

class Rock extends Music {
    String name, artist ;
    int numOfConcerts, releaseYear ;

    Rock (String name, String artist, int numOfConcerts, int releaseYear) {
        super(name, artist, numOfConcerts, releaseYear);
    }

    @Override
    void announceConcerts() {
        numOfConcerts++ ;
    }
}

class Country extends Music {
    String name, artist ;
    int numOfConcerts, releaseYear ;

    Country (String name, String artist, int numOfConcerts, int releaseYear) {
        super(name, artist, numOfConcerts, releaseYear);
    }

    @Override
    void announceConcerts() {
        numOfConcerts++ ;
        System.out.println("A country concert has been announced.");
    }
}

public class InClass3 {
    public static void main(String[] args) {
        Horror hor = new Horror() ;
        hor.displayMovie();

        Drama dra = new Drama() ;
        dra.displayMovie();
        System.out.println();

        Thriller thriller = new Thriller("Rage of Angels", "Sydney Sheldon", 400, 1980) ;
        thriller.printBookDetails();
        thriller.saleIncrease(200);

        ScienceFiction sf = new ScienceFiction("Dune", " Frank Herbert", 500, 1965) ;
        sf.printBookDetails();
        System.out.println();

        Rock r = new Rock("BlackBird", "Alterbridge", 10, 2007) ;
        r.announceConcerts();
        r.printMusicDetails();

        Country c = new Country("The house that built me", "Miranda Lambert", 8, 2009) ;
        c.announceConcerts();
        c.printMusicDetails();
    }
}