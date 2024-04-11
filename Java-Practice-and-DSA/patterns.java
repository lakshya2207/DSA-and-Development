public class patterns {
    public static void main(String[] args) {
        System.out.println(" ");
        int n=5,m=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i==0)||(i==n-1)||(j==0)||(j==m-1)){
                    System.out.print("*");
                    // System.out.print("("+ i + ", "+ j +")");
                }
                else{
                    System.out.print(" ");
                    
                }
                
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
}
