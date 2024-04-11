import java.util.Scanner;

public class noofdigitinanumber {
    public static void main(String[] args) {
       System.out.println(" ");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number :");
       long org=sc.nextLong();
       int n=0;
       while (org>0) {
           org=org/10;
           n++;
       }
       System.out.println(n + " Digits");
       sc.close();
    }
}
