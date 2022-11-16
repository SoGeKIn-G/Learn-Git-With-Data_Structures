public class Print_1_To_N {
    public static void main(String[] args) {
        int n=15;
        printNo_1ToN(n);
        System.out.println();
        printNo_NTo1(n);
    }

    private static void printNo_1ToN(int n) {
        if(n==0){
            return;
        }
        printNo_1ToN(n-1);
        System.out.print(n+" ");


    }

    private static void printNo_NTo1(int n) {
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printNo_NTo1(n-1);
    }

}
