import java.util.*;

public class MapIntersectClient {
    public static void main (String [] args){
        Map <String,Integer> map1= new HashMap<>();
        Map <String,Integer> map2= new HashMap<>();

        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker",46);
        map1.put("Alyssa",100);
        map1.put("Stefanie",80);
        map1.put("Jeff",88);
        map1.put("Kim",52);
        map1.put("Sylvia",95);


        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker",52);
        map2.put("Jeff",88);
        map2.put("Stefanie",80);
        map2.put("Brian",60);
        map2.put("Lisa",83);
        map2.put("Sylvia",87);


        System.out.println(mapIntersect(map1,map2));


    }

    //Question 1
    public static Map <String, Integer> mapIntersect (Map <String,Integer> map1, Map <String,Integer> map2){
        // new empty Map that will contain the final answer map.
        Map <String, Integer> intersect= new HashMap<>();

        // creates a set that will store the keys from map 1.
        Set<String> map1Keys = new HashSet<>();

        // for loop used to add the keys from map1 into the map1Keys
        for (String keys: map1.keySet()){
            map1Keys.add(keys);
        }

        //String iterator that is used to transverse the keys in map1
        Iterator <String> map1Iterator = map1.keySet().iterator();

        // while loop that picks the key to compare.
        while (map1Iterator.hasNext()){

            String keyTest = map1Iterator.next();

            //checks to see if the key from map 1 is the same as a key from map 2.
            if (map1.get(keyTest).equals(map2.get(keyTest))){
                // adds the map value to the intersect map.
                intersect.put(keyTest, map1.get(keyTest));
            }
        }
        return intersect;


    }

    //question 2



}

