public class Searches {

    //sequential search

    public static int sequentialSearch (int [] array1, int arrayElement){

        int index;
        for (index=0;index<= array1.length; index++){

            if (array1[index] ==arrayElement){

                return index+1;
            }
        }
        return -1;
    }
    //binary search

    public static int binarySearch(int[] array2, int array2Element){
        int min=0;
        int max = array2.length-1;

        while (min<=max){

            int mid = (min+max)/2;

            if (array2[mid] == array2Element){

                return mid+1;
            }

            if (array2[mid]<array2Element){
                min = mid+1;
            }
            else{

                max=mid-1;
            }


        }

        return -1;

    }

    // recursive binary search

    public static int recursiveBinary (int [] array3, int array3Element, int min, int max){
        if (min<=max){

            int mid = (min+max)/2;

            if (array3[mid]==array3Element){

                return mid+1;
            }
            if (array3[mid]>array3Element){

                return recursiveBinary(array3,array3Element,min,mid-1);

            }

            else {

                return recursiveBinary(array3,array3Element,mid+1,max);
            }
        }
        return -1;
    }

    public static void main (String []args){


        int [] testArray = {25,10,30,40,55,90};

        System.out.println("30 is at position: "+sequentialSearch(testArray,30));
        System.out.println("40 is at position: "+binarySearch(testArray,40));
        System.out.println("90 is at position: "+recursiveBinary(testArray,90,0,6));

    }






}
