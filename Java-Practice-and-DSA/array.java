import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner sc =  new Scanner(System.in);
        //syntax : 
        // datatype[] varname = new datatype[size]
        // datatype[] varname = {1,2,3}
        int[] roll1 = new int[5]; // object creation and assigning dynamically
        int[] roll2 = {1,2,3,4,5};

        String[] str1= new String[3];
        String[] str2={"i","me","myself"};




        for (int i : roll2) {
            System.out.println(i);
        }
        // for (int i : roll1) {
        //     System.out.println(i);
        // }
        System.out.println(Arrays.toString(str2));
        //input for list :
        // for (int i = 0; i < str1.length;i++) {
        //     System.out.println("Enetr string "+i);
        //     str1[i]= sc.nextLine();
        // }
        for (String i : str1) {
            System.out.println(i);
        }
        for (String i : str2) {
            System.out.println(i);
        }


    }
}


// memory locations may be not contious as it depends on jvm 