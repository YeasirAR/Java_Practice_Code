package exam.oop212;

abstract class Students {
    String name;
    int id;
    int credits_taken;
    double per_credit_fee = 3400;
    double waiver_percentage;
    double total_fee;
    abstract void semester_fee();
    Students(String name, int id, int credits_taken, double waiver_percentage){
        this.name = name;
        this.id = id;
        this.credits_taken = credits_taken;
        this.waiver_percentage = waiver_percentage/100;
    }
}

class Calculate extends Students {

    Calculate(String name, int id, int credits_taken,double waiver_percentage){
        super(name,id,credits_taken,waiver_percentage);
    }

    public void semester_fee() {
        total_fee = (credits_taken*per_credit_fee);
        double waiver_amt = total_fee*waiver_percentage;
        total_fee = total_fee - waiver_amt;
    }
}

public class CalculateTuition {
    public static void main(String[] args) {
        Students s1 = new Calculate("Miraz",001,12,50);
        Students s2 = new Calculate("Yeasir",002,14,100);
        Students s3 = new Calculate("Ashiq",003,10,0);
        s1.semester_fee();
        s2.semester_fee();
        s3.semester_fee();
        System.out.println("Semester Fees of "+s1.name+" is : "+s1.total_fee+" BDT");
        System.out.println("Semester Fees of "+s2.name+" is : "+s2.total_fee+" BDT");
        System.out.println("Semester Fees of "+s3.name+" is : "+s3.total_fee+" BDT");
    }

}
