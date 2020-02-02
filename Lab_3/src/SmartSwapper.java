import java.util.Arrays;

public class SmartSwapper {

    public static void main (String []args){

        int []test= {10,20,30,40,50,60,70};
        swapPairs(test);
    }

    public static void swapPairs (int [] numbers){
        for (int i = 0; i < numbers.length-1; i=i+2) {
            int t = numbers[i];
            numbers[i]= numbers[i+1];
            numbers[i+1] = t;
        }

        System.out.println(Arrays.toString(numbers));

    }

}
