import java.util.Arrays;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
            int[][] mat= new int[5][5];
            System.out.println(" ");
            Scanner sc= new Scanner(System.in);


            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.println("Enter element at "+i+" , "+j +" position");
                    mat[i][j] = sc.nextInt();
                }
            }
            
            for (int[] is : mat) {
                System.out.println(Arrays.toString(is));
            }
    }
    
}
