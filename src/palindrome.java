public class palindrome {
    public static void main(String[] args) {
        int pal2=0,n=575,rem;
        int pal1=n;
        while(n>0){
            rem=n%10;
            pal2=(pal2*10)+rem;
            n=n/10;
        }
        if(pal1==pal2){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}

