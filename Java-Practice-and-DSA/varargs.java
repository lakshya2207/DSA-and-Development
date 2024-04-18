import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        System.out.println(" ");
        fun(1,2,5,4,8,3,6,7);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}


//varargs used for unknow nuo. of same king of input