public class evendigitnoinarray {
    public static void main(String[] args) {
        System.out.println(" ");
        int[] arr = {45,4578,3564,-35,6,01001,273};
        int count=0;
        for (int i : arr) {
            if (digits2(i)%2==0){
                count++;
            }
        }
        
        System.out.println("Total even digits = "+count);
    }

    static int digits2(int n){    //faster
        // return Math.ceil(Math.log10(n));
        if (n<0){
            n=n*-1;
        }
        
        if (n==0) {
            return 1;
        }
        return (int)(Math.log10(n))+1;
    }

    static int digits(int n ){
        int dig=0;
        if (n<0){
            n=n*-1;
        }
        if (n==0) {
            return 1;
        }
        while(n>0){
            n=n/10;
            dig++;
        }
        return dig;
    }
}
