public class pattern {
    public static void main(String[] args) {
        int n =5;
        for (var i=0; i<n; i++) {
            for (var j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
