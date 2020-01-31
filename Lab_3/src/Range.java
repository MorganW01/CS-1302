public class Range {
    public static void main (String [] args){

        printRange(19,11);


    }


    public static String printRange(int a, int b){
        String rangeOfInput="";

        if (a<b){

            for (int i = a; i<=b; i++){
                System.out.print(i+" ");
                rangeOfInput= String.valueOf(i)+" ";
            }

        }

        else if (a>b){
            for (int i = a; i>=b; i--){
                System.out.print(i+" ");
                rangeOfInput= String.valueOf(i)+" ";

            }
        }

        else if (a==b){
            System.out.println(a);
            rangeOfInput=String.valueOf(a);

        }

        else {

            System.out.println("Your input may be invalid, please try again.");
        }


        return rangeOfInput;
    }



}
