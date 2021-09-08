package AOOP.Lab4;

class Student{
    public String name;
    public String id;
    public double CGPA;

    public Student(String name,String id,double CGPA ){
        this.name=name;
        this.id=id;
        this.CGPA = CGPA;
    }
    private double scholarship = 0.0;
    public double calScholarship(){
        return scholarship;
    }
}

class CollegeStudent extends Student {
    public int classPosition;

    public CollegeStudent(String name, String id, double CGPA) {
        super(name, id, CGPA);
    }

    @Override
    public double calScholarship() {
        return (CGPA * 10000) + (10000 / classPosition);
    }
}
class GradeStudent extends Student{
    public int noOfPublications;

    public GradeStudent(String name,String id,double CGPA){
        super(name, id, CGPA);
    }

    @Override
    public double calScholarship() {
        return (CGPA*1000)+(10000*noOfPublications);
    }
}

public class University {

    public static void main(String[] args) {
        CollegeStudent s1= new CollegeStudent("Rafi","011201036",3.78);
        CollegeStudent s2= new CollegeStudent("Raju","011201037",3.11);
        CollegeStudent s3= new CollegeStudent("Ratul","011201038",3.18);

        GradeStudent g1 = new GradeStudent("Safi","0112086",4);
        GradeStudent g2 = new GradeStudent("Nafi","0112601",2.89);
        GradeStudent g3 = new GradeStudent("RIfa","0112888",3.11);
        s1.classPosition = 5;
        s2.classPosition = 20;
        s3.classPosition = 9;
        g1.noOfPublications =2;
        g2.noOfPublications = 3;
        g3.noOfPublications = 4;
        System.out.println(s1.name+" "+s1.id+" "+s1.CGPA+" "+s1.calScholarship());
        System.out.println(s2.name+" "+s2.id+" "+s2.CGPA+" "+s2.calScholarship());
        System.out.println(s3.name+" "+s3.id+" "+s3.CGPA+" "+s3.calScholarship());
        System.out.println(g1.name+" "+g1.id+" "+g1.CGPA+" "+g1.calScholarship());
        System.out.println(g2.name+" "+g2.id+" "+g2.CGPA+" "+g2.calScholarship());
        System.out.println(g3.name+" "+g3.id+" "+g3.CGPA+" "+g3.calScholarship());

    }
}
