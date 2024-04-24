import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(" ");
        // Searching can be done by 2 types : 
        // traversing through indexes, for each loop.
        int[] arr= {12,34,23,3,55,65,4,34,3,4,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Array " + Arrays.toString(arr));
        System.out.print("Enter element to find : ");
        int ele = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ele){
                System.out.print("Element "+ele+" found at "+ (i+1) +" position");            
                break;
            }
        }
        
        sc.close();
    }
}

