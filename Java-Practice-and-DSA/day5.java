class day5{
    public static void main(String[] args){
        System.out.println("/n");
        int i=0;
        while (i<10) {
            System.out.println("while "+i);
            i++;
            i++;
        }
        // i=0;
        do {
            System.out.println("do while "+i);
            i++;
            i++;
        }while(i<20);
        for ( i =20; i<30; i+=2) {
            System.out.println("for "+i);
            
        }
    }
}