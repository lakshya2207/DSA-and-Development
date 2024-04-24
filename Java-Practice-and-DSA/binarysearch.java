public class binarysearch {
    public static void main(String[] args) {
        System.out.println(" ");
        // int[] arr = {-10,-5,-1,0,2,4,6,7,9,11};
        int[] arr={12,11,9,4,3,0,-5,-555};
        int ele=9   ;
        if (arr[0]>arr[arr.length-1]){

            System.out.println(findDescend(arr, ele));
        }else{

            System.out.println(findAscend(arr, ele));
        }
    }
    static int findAscend(int[] arr,int ele){
        int sm=0,lg=arr.length-1,mid;
        while(sm<=lg){
            // mid=(sm+lg)/2;
            // mid=(sm+( lg-sm))/2;
            mid = sm + (lg - sm) / 2;

            if (ele<arr[mid]) {
                lg=mid-1;
            }else if (ele>arr[mid]) {
                sm=mid+1;
            }else{
                return mid;
            }
            System.out.println("hi");
        }
        return -1;
    }

    static int findDescend(int[] arr,int ele){
        int lg=0,sm=arr.length-1,mid;
        while(sm>=lg){
            // mid=(sm+lg)/2;
            // mid=(sm+( lg-sm))/2;
            mid = sm + (lg - sm) / 2;

            if (ele<arr[mid]) {
                lg=mid+1;
            }else if (ele>arr[mid]) {
                sm=mid-1;
            }else{
                return mid;
            }
            System.out.println("hi");
        }
        return -1;
    }

}
    