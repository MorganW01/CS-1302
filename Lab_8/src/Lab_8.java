public class Lab_8 {
    public static void main (String[]args){
        System.out.println("Question 3 output: ");
        System.out.println(factorial(5));
        //System.out.println();
        System.out.println("Question 4 output: ");
        writeNums(5);
        writeNums(12);
        System.out.println();
        System.out.print("(n is less than 1): ");
        writeNums(-1);
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
        //base case
        if (n==1){
            System.out.print("1");
        }
        else if (n<1){
            System.out.print("IllegalArgumentException");
        }
        else{
            writeNums(n-1);
            System.out.print(","+n);
        }
    }
}
