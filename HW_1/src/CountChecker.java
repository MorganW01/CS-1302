public class CountChecker {

    public static void main (String []args){
        int []test = {14,1,22,17,36,7,-43,5};

        System.out.println(countInRange(test,4,17));


    }

    public static int countInRange(int [] numbers, int min, int max){
        int count=0;

        for (int i =0; i<=numbers.length-1; i++){
            if (numbers[i] >= min && numbers[i]<= max){
                count++;
            }
        }
        return count;
    }
}//done
