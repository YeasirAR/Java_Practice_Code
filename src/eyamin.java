public class eyamin {
    public static void main(String[] args) {
        University tris = new UnderGraduate();
        University caleb = new Graduate();
        tris.AddCGPA(3.5);
        caleb.AddCGPA(3.4);
        caleb.AddCredits(12);
        tris.AddCredits(12);
        caleb.AddCredits(2);
        String Advisor= "Eyamin Bin Aman";
        System.out.println("Name: Tris");
        System.out.println("CGPA: "+tris.cgpa);
        System.out.println("Score: "+tris.score);
        System.out.println("Credit Completed: "+ tris.credits);
        System.out.println("Adivsor Name: "+Advisor);
        System.out.println();
        System.out.println("Name: Caleb");
        System.out.println("CGPA: "+caleb.cgpa);
        System.out.println("Score: "+caleb.score);
        System.out.println("Credit Completed: "+ caleb.credits);

    }
}

class University{
    String name;
    int age;
    double cgpa=0;
    double score=0;
    int credits=0;

    void AddCredits(int credits1){

    }
    void AddCGPA(double cgpa1){

    }

}
class Graduate extends University {

    void AddCredits(int credits1){
        credits+=credits1;

    }
    void AddCGPA(double cgpa1){
        cgpa+=cgpa1;
        score= (5-this.cgpa)/cgpa;
    }

}
class UnderGraduate extends University{
    void AddCredits(int credits1){
        credits+=credits1;

    }
    void AddCGPA(double cgpa1){
        cgpa+=cgpa1;
        score=400-(this.cgpa*100);

    }

}