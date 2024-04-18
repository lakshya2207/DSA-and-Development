public class overloading {
    public static void main(String[] args) {
        System.out.println(" ");
        chapde(9);
        chapde("lakshya");
    }
    static void chapde(int var){
        System.out.println(var);
    }

    static void chapde(String var){
        System.out.println(var);
    }
}

// FUNCTION OVERLOADING
//funtions with same name can exist within same block but they have to have diffrent arguments{no,type}
//function can't be written emplty i.e without arguments otherwise it will create ambiguity