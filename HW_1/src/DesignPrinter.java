public class DesignPrinter {
    public static void main (String []args){
        printDesign(5);
    }
    //n is any value between 1-5
    public static void printDesign(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) { //left side
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("-");
            }

            for (int k = 1; k <= num; k++) { //middle
                System.out.print(num);
            }

            num += 2;

            for (int j = 1; j <= 6 - i; j++) {//right side
                System.out.print("-");
            }

            System.out.println();
        }
    }
}//done
