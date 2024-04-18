// import java.util.ArrayList;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(" ");
        // Armstrong no. : sum of cube of individual digits of a number = number itself
        // eg: 153=1^2 + 5^2 + 3^2
        System.out.println("ARMSTRONG NUMBER CHECKER !! ");
        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the 3 digit no. number : ");
        
        for (int i = 1; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i+" is a Armstrong Number.");
            }
        }
        sc.close();
        
    }
    static boolean isArmstrong(int num){
        int sum=0,temp;
        temp=num;
        while (num>=1){
            sum=sum + (num%10)*(num%10)*(num%10);
            num=num/10;
            // System.out.println("Sum = "+sum);
            // System.out.println("num = "+num);
        }
        if(sum==temp){
            return true;
            // System.out.println("Armstrong");
        }else{
            return false;
            // System.out.println("Not Armstrong");

        }
    }
}
