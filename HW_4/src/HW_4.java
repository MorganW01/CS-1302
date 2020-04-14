import java.util.ArrayList;
import java.util.Collections;


public class HW_4 {

    public static void main (String [] args){
        //question 5
        System.out.println("OUTPUT FOR QUESTION 5: ");

        ArrayList<String> list = new ArrayList<>();
        list.add("123456, Seattle, WA");
        list.add("9847, New York, NY");
        list.add("276453, Helena, MT");
        StringComparator myComparator = new StringComparator();
        System.out.println("before sort: "+list);
        Collections.sort(list,myComparator );
        System.out.println("after sort: "+list);

        System.out.println();

        System.out.println("OUTPUT FOR QUESTION 6: ");
        System.out.println(repeat("ok",1));
        System.out.println(repeat("hello",3));

        System.out.println();

        System.out.println("OUTPUT FOR QUESTION 7: ");
        writeSquares(1);
        System.out.println();
        writeSquares(8);

        System.out.println();
        System.out.println();

        System.out.println("OUTPUT FOR QUESTION 2: ");
        System.out.println("Test array = {10,40,60,20,30,50,80,70}");
        System.out.println();
        System.out.println("Sorted array: ");
        int[] array = {10,40,60,20,30,50,80,70};
        selectionSort(array);
        System.out.print(array[0]);
        for (int i=1; i<= array.length-1; i++){
            System.out.print(","+ array[i]);
        }


    }

    // question 6
    public static String repeat (String s, int n){
        if (n==0){
            return "";

        }
        else {
            return s + repeat(s,n-1);
        }
    }

    //question 7
    public static void writeSquares(int n) {
        if (n <= 1){
            System.out.print(1);
        }
        else {
            if (n % 2 != 0) {
                System.out.print(n * n + ", ");
            }

            writeSquares(n - 1);

            if (n % 2 == 0) {
                System.out.print(", ");
                System.out.print(n * n);
            }
        }
    }

    //question 8

    public static int[] selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < array.length; j++)

                if (array[j] > array[index])

                    index = j;

            int number = array[index];

            array[index] = array[i];

            array[i] = number;

        }

        return array;

    }

}
