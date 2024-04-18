import utilities.*;
import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        //Methods are like functions but 
        //functions are called by thier name only
        //while methods are called using an object ex class.method()  str.lenght()

        // types :
        //  user defined , standard library 

        // method signature : method name + parameters
        // access specifier : public, private,protected,default 
        // return type : void,int,float etc

        // how to call a method :
        // name + ()
        Greet();

        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a =sc.nextInt();
        System.out.println("Enter number 2 :");
        int b =sc.nextInt();
        int sum =obj.add(a, b);
        System.out.println("Sum : "+ sum);
        app obj2 = new app();
        // int diff =app.sub(a,b);
        System.out.println("Sum : "+ sum);


        //standard: print,sqrt,floor,ceil
        System.out.println(Math.floor(5.5));
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.sqrt(5));
        sc.close();



    }
    static void Greet(){ //static is non access modifier
        System.out.println("Hello Everyone");
    }
}
