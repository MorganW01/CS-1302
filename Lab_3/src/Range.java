public class Range {
    public static void main (String [] args){
        printRange(2,7);
        printRange(19,11);
        printRange(5,5);
    }
    public static String printRange(int a, int b){
        String rangeOfInput="";

        if (a<b){

            for (int i = a; i<=b; i++){
                System.out.print(i+" ");
            }

            System.out.println();

        }
        else if (a>b){
            for (int i = a; i>=b; i--){
                System.out.print(i+" ");

            }
            System.out.println();
        }

        else if (a==b){
            System.out.print(a);
            System.out.println();

        }
        else {

            System.out.println("Your input may be invalid, please try again.");
        }


        return rangeOfInput;
    }

}
