package ntpc;

import java.util.ArrayList;
import java.util.Scanner;

abstract class President{
    final String SchoolName = "Danvil";
    abstract void exercisePower();
}

class SchoolPresident extends President{
    private ClassPresident BestClassPresident;

    public void exercisePower(){
        System.out.println("Exercise Power on School");
    }

    public int getbcs() {
        return BestClassPresident.id;
    }

    public void setbcs(ClassPresident bcs) {
        BestClassPresident = bcs;
    }
}

class ClassPresident extends President{
    int id;
    ClassPresident(int id){
        this.id = id;
    }
    void exercisePower(){
        System.out.println("Exercise Power on Class " + id);
    }
}

public class HomeAssignment2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n,i,b;
        System.out.print("Enter the number of Class President ");
        n = scan.nextInt();

        ArrayList<President> sp = new ArrayList<President>();

        ArrayList<President> CLassPresident = new ArrayList<President>();
        if(n==0){
            SchoolPresident schoolpr= new SchoolPresident();
            sp.add(schoolpr);
            for (President x : sp) {
                x.exercisePower();
            }
        }
        else {

            for (i = 0; i < n; i++) {
                System.out.print("Enter The Class President ID: ");
                ClassPresident cp = new ClassPresident(scan.nextInt());
                sp.add(cp);
            }
            scan.close();
            SchoolPresident schoolpr = new SchoolPresident();
            schoolpr.setbcs((ClassPresident) sp.get(0));
            sp.add(schoolpr);

            for (President x : sp) {
                x.exercisePower();
            }
            System.out.println("Best President Id: " + schoolpr.getbcs());
        }

    }

}
