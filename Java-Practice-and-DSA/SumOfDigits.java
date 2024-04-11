import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int org=sc.nextInt();
        int sum=0;
        while(org>0){
            sum=sum+org%10;
            org=org/10;
        }

        System.out.println("Sum of Digits : "+sum);
    }
}
