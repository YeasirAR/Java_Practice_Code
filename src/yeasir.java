public class yeasir {
    public static void main(String[] args) {
        Tirith tris = new Tris();
        Tirith caleb = new Caleb();
        tris.update("Tris",0.0,0.0,0);
        caleb.update("Caleb",0.0,0.0,0);
        tris.advisor="Yeasir Arafat";
        tris.updateCredits(12);
        caleb.updateCredits(12);
        caleb.updateCredits(2);
        tris.updateCGPA(3.5);
        caleb.updateCGPA(3.4);
        System.out.println("Name: "+tris.name+"\n"+"CGPA: "+tris.cgpa+"\n"+"Score: "+tris.score+"\n"+"Credit Completed: "+ tris.credits_completed+"\n"+"Adivsor Name: "+tris.advisor+"\n\n");
        System.out.println("Name: "+caleb.name+"\n"+"CGPA: "+caleb.cgpa+"\n"+"Score: "+caleb.score+"\n"+"Credit Completed: "+ caleb.credits_completed);
    }
}

class Tirith{
    String name;
    String advisor;
    int age;
    double cgpa;
    double score;
    int credits_completed;
    public void update(String name, double cgpa, double score, int credit_completed){

    }
    public void updateCredits(int credits_completed){

    }
    public void updateCGPA(double cgpa){

    }

}
class Caleb extends Tirith {
    public void update(String name, double cgpa, double score, int credit_completed){
        this.name=name;
        this.cgpa=cgpa;
        this.score=score;
        this.credits_completed=credit_completed;

    }
    public void updateCredits(int credits_completed){
        this.credits_completed+=credits_completed;

    }
    public void updateCGPA(double cgpa){
        this.cgpa+=cgpa;
        score= (5-this.cgpa)/cgpa;
    }

}
class Tris extends Tirith{
    String advisor;
    public void update(String name, double cgpa, double score, int credits_completed){
        this.name=name;
        this.cgpa=cgpa;
        this.score=score;
        this.credits_completed=credits_completed;
    }
    public void updateCredits(int credit_completed){
        this.credits_completed+=credit_completed;

    }
    public void updateCGPA(double cgpa){
        this.cgpa+=cgpa;
        score= 400-(this.cgpa*100);

    }

}