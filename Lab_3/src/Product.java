import java.util.Scanner;

public class Product {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter at least 3 numbers in a space separated list: ");
        int product=1;
        String input = scanner.nextLine();
        String [] inputArray = input.split("\\s");
        //System.out.println(inputArray.length);

        for (int i =0; i<inputArray.length;i++){

            product = product *Integer.valueOf(inputArray[i]);


        }

        System.out.println("The product of the numbers in your list is: "+product);

    }




}
