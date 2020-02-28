import java.util.*;

public class Lab_7 {

    public static void main(String []args){
        /*Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(symmetricSetDifference(set1,set2));*/


        Map <String, String> names = new HashMap <String, String>();
        //test 1; should return true.
        names.put("Marty","Stepp");
        names.put("Stuart","Reges");
        names.put("Jessica","Miller");
        names.put("Amanda","Camp");
        names.put("Hal","Perkins");

        Map <String, String> names1 = new HashMap <String, String>();
        //test 2; should return false
        names1.put("Kendrick","Perkins");
        names1.put("Stuart","Reges");
        names1.put("Jessica","Miller");
        names1.put("Bruce","Reges");
        names1.put("Hal","Perkins");


        System.out.println(isUnique(names1));


    }

    public static Set <Integer> symmetricSetDifference (Set <Integer> set1, Set <Integer> set2){

        Set <Integer> set3 = new HashSet<Integer> (set1);
        set3.addAll(set2);
        //combines sets 1 and 2.

        Set <Integer> set4 = new HashSet<Integer> (set1);
        //creates a new set 1.

        set4.retainAll(set2);
        // keeps similar elements between the original set 1 and set 2 (4 and 7)
        //set 4 = [4,7]

        set3.removeAll(set4);
        // removes the [4,7] from set 3 leaving the non similar elements from the initial sets 1 and 2.

        return set3;

    }


    // returns true if no two keys map to the same value

    /*
    * https://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html
    *
    * */

    //false if any *two or more* keys do map to the same value. May need to set up a count variable
    public static boolean isUnique (Map<String,String> names){
        Collection <String> values = names.values();
        System.out.println(values);
        int count =0;








        return false; //placeholder
    }









}
