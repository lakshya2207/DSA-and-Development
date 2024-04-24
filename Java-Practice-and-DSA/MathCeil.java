public class MathCeil {
    public static void main(String[] args) {
        System.out.println(" ");
        //Ceil of number = returning number >= number
        int[] arr= {10,20,25,30,40,50,60,70,80,90,100};
        // int mid= (arr.length-1) / 2;
        System.out.println(mathfloor(arr, 25));
        // System.out.println("Ceil : "+mathceil(arr, 100));
    }

    
    static int mathfloor(int[] arr,int ele){
        int start=0,end=arr.length-1,mid=start + (end-start) / 2;
        while(start<mid){
            mid=start + (end-start) / 2;
            if (ele<arr[mid]){
                end=mid;
            }else if(ele>arr[mid]){
                start=mid;
                mid=start + (end-start) / 2;

            }else if(ele == arr[mid]){
                return arr[mid];
            }
            System.out.println("start ="+start+" mid = "+mid+" end = "+end);
        }
        return arr[start];
    }
    


    static int mathceil(int[] arr,int ele){
        int start=0,end=arr.length-1,mid=start + (end-start) / 2;
        while(start<mid){
            mid=start + (end-start) / 2;
            if (ele<arr[mid]){
                end=mid;
            }else if(ele>arr[mid]){
                start=mid;
            }else if(ele == arr[mid]){
                return arr[mid];
            }
            System.out.println("start ="+start+" mid = "+mid+" end = "+end);
        }
        return arr[end];
    }
    
}
