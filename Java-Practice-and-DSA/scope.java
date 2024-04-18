public class scope {
    static String naam = "Lakshya";
    static int num=100; // static object independent
    public static void main(String[] args) {
        System.out.println(" ");
        int a=10;
        int num=10;//Shadow Scoping the bigger block preinitialised element hi hidden.
        {   
            // int a=50; //this also will give error beacuse we can't re-initialize 
            int c=5;
            System.out.println("a = "+a);
            System.out.println("c = "+c);
        }
        System.out.println("a = "+a);
        System.out.println("naam = "+naam);
        System.out.println("num = "+num);//due to shadow scoping local int value is preffred
        // System.out.println("c = "+c);// this wil give error becouse in java intialised in only valid in itself or child block
    }
}
