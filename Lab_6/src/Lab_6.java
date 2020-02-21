import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lab_6 {

    public static void main (String []args){

        int [] numbers = {};
        ArrayList <Integer> list =  new ArrayList<>();
        for (int i = 0; i < numbers.length; i++ ){}



    }

    /*public ArrayList clump (ArrayList <String> a1){



    }*/


    public ArrayList filterRange (ArrayList list, int min, int max){
        for (int i =0; i < list.size(); i++){

            if ((Integer) list.get(i)>=min && (Integer)list.get(i)<= max){
                list.remove(i);
            }
        }
        //placeholder
        return list;
    }




}
