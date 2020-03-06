import java.util.*;
public class Lab_7 {
    public static void main(String []args){
        //question 1 test
        Set<Integer> set1 = new HashSet<Integer>();
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

        System.out.println("QUESTION 1 OUTPUT:");
        System.out.println(symmetricSetDifference(set1,set2));
        System.out.println();

        //question 3 test
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

        System.out.println("QUESTION 3 OUTPUT:");
        System.out.println(isUnique(names));
        System.out.println(isUnique(names1));
        System.out.println();

        // extra credit problem.
        Map<String,String> map = new HashMap<>();
        map.put("Marty","206-9024");
        map.put("Hawking","123-4567");
        map.put("Smith","949-0504");
        map.put("Newton","123-4567");
        System.out.println("EXTRA CREDIT QUESTION OUTPUT:");
        System.out.println("No two keys in:"+map+" have the same value?  "+is1to1(map));

        Map<String,String> map2 = new HashMap<>();
        map2.put("Marty","206-9024");
        map2.put("Hawking","555-1234");
        map2.put("Smith","949-0504");
        map2.put("Newton","123-4567");
        System.out.println("No two keys in:"+map2+" have the same value?  "+is1to1(map2));


    }

    //question 1

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

    //question 3

    public static boolean isUnique(Map < String, String > names) {
        int count = 0;
        Set set = names.entrySet();
        Iterator iterator2 = set.iterator();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry firstMap = (Map.Entry) iterator1.next();
            count = 0;
            while (iterator2.hasNext()) {
                Map.Entry secondMap = (Map.Entry) iterator2.next();
                if (firstMap.getValue().equals(secondMap.getValue())) {
                    count++;
                }
                if (count > 1)
                    return false;
            }
        }
        return true;
    }

    //extra credit problem

    public static boolean is1to1(Map<String,String> map){
        //set that is used to store the values
        Set<String> set = new HashSet<>();
        //goes through all of keys in the map
        for(String string : map.keySet()){
            //returns false if the value is in the map
            if(set.contains(map.get(string))){
                return false;
            }
            set.add(map.get(string));
        }
        return true;
    }









}
