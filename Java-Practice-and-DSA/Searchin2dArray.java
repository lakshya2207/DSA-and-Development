public class Searchin2dArray {
    public static void main(String[] args) {
        System.out.println(" ");
        int[][] arr = {
            {1,2,3,4,5,6},
            {7,8,9,0},
            {10,11,12,13,14}
        };
        int ele=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==ele){
                    System.out.println("index : "+i+","+j);
                }
            }
        }
    }
}