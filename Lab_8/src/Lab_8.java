public class Lab_8 {


    public static void main (String[]args){
        //System.out.println(factorial(5));
        writeNums(5);
        //System.out.println();
    }

    //question 3

    public static int factorial (int n){
        //base case
        if (n==1){

            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }

    //question 4

    public static void writeNums (int n){

        if (n==1){
            System.out.print("1");
        }

        else{

            //this is backwards, try to fix with what you have
            writeNums(n-1);
            System.out.print(","+n);

        }




    }
}
