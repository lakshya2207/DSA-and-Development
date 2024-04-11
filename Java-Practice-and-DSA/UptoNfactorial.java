import java.util.Scanner;

public class UptoNfactorial {
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt(),fact=1;

        for (int i =1; i < n+1; i++) {
            fact=fact*i;
            System.out.println("Factorial of "+i+" is "+fact);
        }
    }
}
