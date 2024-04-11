import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int org=sc.nextInt(),dup=0;

        while (org>0) {
            dup=dup*10+org%10;
            // System.out.println(dup);
            org=org/10;

        }
        System.out.println("reversed nUMBER = "+dup);

    }
}
