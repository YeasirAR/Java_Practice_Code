
import java.util.ArrayList;
import java.util.Scanner;

public class OopAssignment2 {

    public static void main(String[] args) {
        int n, i=0;
        ArrayList<President> ar = new ArrayList<>();
        SchoolPresident spr = new SchoolPresident();
        ar.add(spr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of class presidents: ");
        n = sc.nextInt();

        while(i!=n) {
            System.out.print("Enter class president id: ");
            ClassPresident cpr = new ClassPresident(sc.nextInt());
            ar.add(i+1,cpr);
            i++;
        }
        if(ar.size()!=1){
            spr.setBestClassPresident((ClassPresident) ar.get(1));
        }
        sc.close();
        ar.add(ar.get(0));
        ar.remove(0);

        for(President print : ar){
            print.exercisePower();
        }
        if(ar.size()>1){
            System.out.println("Best president id: " + spr.getBestClassPresident() );
        }
    }
}

interface President{
    String school="Danville";
    void exercisePower();
}

class SchoolPresident implements President{

    public SchoolPresident() {

    }
    public void exercisePower() {
        System.out.println("Exercising power on school");
    }
    private ClassPresident bestClassPresident;
    public int getBestClassPresident() {
        return bestClassPresident.class_id;
    }

    public void setBestClassPresident(ClassPresident bestClassPresident) {
        this.bestClassPresident = bestClassPresident;
    }
}

class ClassPresident implements President{
    int class_id;
    public ClassPresident(int id) {
        class_id=id;
    }

    public void exercisePower() {
        System.out.println("Exercising power on class " + class_id);

    }
}
