package exam.oop_lab;

import java.util.Scanner;
class Time{
    void check(String time,String date){
        String[] time1 = time.split("-");
        String[] date1 = date.split("-");
        int hour = Integer.parseInt(time1[0]);
        int sec = Integer.parseInt(time1[2]);
        int min = Integer.parseInt(time1[1]);
        int day = Integer.parseInt(date1[0]);
        int mon = Integer.parseInt(date1[1]);
        int year = Integer.parseInt(date1[2]);
        String s1=null,s2 = null;
        if(hour>=6 && hour<=11)
        {
            s1= "Morning ";
        }
        if(hour>=12 && hour<=17)
        {
            s1= "Afternoon ";
        }
        if(hour>=18 && hour<=23)
        {
            s1= "Evening ";
        }
        if(hour>=0 && hour<=5)
        {
            s1= "Night ";
        }

        if((day>=14 && mon == 2) || (mon>2 && mon<5) || ( mon==5 && day<=13))
        {
            s2= "Spring ";
        }
        if((day>=14 && mon == 5) || (mon>5 && mon<8) || ( mon==8 && day<=13))
        {
            s2= "Summer ";
        }
        if((day>=14 && mon == 8) || (mon>8 && mon<11) || ( mon==11  && day<=13))
        {
            s2= "Autumn ";
        }
        if((day>13 && mon == 11) || (mon==12 || mon==1) || ( mon==2 && day<=13))
        {
            s2= "Winter ";
        }
        System.out.println("It’s a "+s2+s1+"of "+year+"!");
    }

}

class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String date = sc.nextLine();

        Time t = new Time();
        t.check(time, date);
    }
}