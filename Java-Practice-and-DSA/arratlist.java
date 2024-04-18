import java.util.*;

public class arratlist {

    public static void main(String[] args) {
        System.out.println(" ");
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // System.out.println(list.size()); //size
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.contains(80)); // Contains
        list.add(70);
        list.add(80);
        System.out.println(list.size());

        System.out.println(list);
        // System.out.println(list);
        System.out.println("Channging");
        list.set(0, 100);
        System.out.println(list);
        System.out.println("Removing");
        list.remove(list.lastIndexOf(80));
        System.out.println(list);
        list.clear();
        //input
        Scanner in =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element at postion "+i+" = ");
            list.add(in.nextInt());
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        // System.out.println(list);
    }
}
