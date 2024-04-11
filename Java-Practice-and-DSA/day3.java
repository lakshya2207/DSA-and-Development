import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter username");
        String name= sc.next();
        System.out.println("ENter Number");

        int n= sc.nextInt();
        if ((name.equals("lala"))&&(n==5)) {
            System.out.println("Right username");
            System.out.println(name);
        }
        else{
            System.out.println(name);
            System.out.println("Wrong username");

        }

        // ternary
        String ans = (n==5)?"true":"FALSE";;
        System.out.println(ans);
        sc.close();
    }
}
