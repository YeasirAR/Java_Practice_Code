package exam.OOP193;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Player{
    int jerseyNo;
    double rating;
    public Player(int number, double rating){
        jerseyNo=number;
        this.rating=rating;
    }
}
public class SortList {
    public static void main(String args[]){
        Player p1=new Player(7, 9.2);
        Player p2=new Player(9, 8.5);
        Player p3=new Player(10, 9.0);
        ArrayList<Player> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1,p3);
        list.add(2,new Player(5, 6.7));
        list.set(3, p3);
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return ((int)o1.rating)- ((int)o2.rating);
            }
        });
        //Create HashSet here for question (b)
    }
}