import java.util.Arrays;

public class day11 {
    public static void main(String[] args) {
        int a=10,b=20;
        int n = new int[1];
        int[] arr = {1,2,3,4,5};
        System.out.println("normal swapping :");
        System.out.println("Before swapping :");
        System.out.println("a = "+a+" b = "+b);
        swap(a, b);
        System.out.println("After swapping :");
        System.out.println("a = "+a+" b = "+b);
        
        System.out.println("Refrence swapping :");
        System.out.println("Before swapping :");
        System.out.println("a = " + a + " b = " + b);
        doswap(new int[]{a}, new int[]{b});
        System.out.println("After swapping :");
        System.out.println("a = " + a + " b = " + b);

        System.out.println("Before mod :");
        System.out.println("arr = "+Arrays.toString(arr));
        modarr(arr);
        System.out.println("After mod :");
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("arr = "+arr[5]);// Index 5 out of bounds for length 5

        
    }
    static void swap(int a,int b){
        // swap will not work because we are passing value not refrence
        int temp=a;
        a=b;
        b=temp;
    }
    static void doswap(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
    static void modarr(int[] nums){
        nums[0]=99;
    }
}


// In Java, primitive types like int are passed by value, which means the actual values of a and b are copied and passed to the swap function. Inside swap, you're modifying the copies (a and b), not the original variables in the main function. That's why the swap function does not change the values of a and b outside of it.

// However, in the modarr function, you're passing an array reference. Even though the reference is passed by value (meaning a copy of the reference is passed), the reference still points to the original array object. So, any changes made to the array elements inside the modarr function will be reflected in the original array outside of the function.