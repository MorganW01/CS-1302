import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lab_6 {

    public static void main (String []args){
        //test for question 1
        ArrayList <String> a1 = new ArrayList <String>();
        a1.add("four");
        a1.add("score");
        a1.add("and");
        a1.add("seven");
        a1.add("years");
        a1.add("ago");
        a1.add("our");
        System.out.println(clump(a1));


        //test for question 2
        ArrayList <Integer> list =  new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(7);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(7);

        System.out.println(filterRange(list,5,7));

        //test for question 3

        ArrayList <Integer> a3= new ArrayList<>();
        ArrayList <Integer> a4= new ArrayList<>();


        a3.add(10);
        a3.add(20);
        a3.add(30);
        a3.add(40);
        a3.add(50);

        a4.add(6);
        a4.add(7);
        a4.add(8);


        System.out.println(interleave(a3,a4));




    }

    //question 1
    public static ArrayList clump (ArrayList<String> a1){
         if (a1.size() % 2 != 0){
             for (int i = 0; i < a1.size()-1; i++){

                 a1.set(i,"("+a1.get(i)+" "+ a1.get(i+1)+")");
                 a1.remove(i+1);
             }

         }
         else  {

             for (int i = 0; i < a1.size(); i++){
                 a1.set(i,"("+a1.get(i)+" "+a1.get(i+1)+")");
                 a1.remove(i+1);
             }
         }

        return a1;
    }

    //question 2
    public static ArrayList filterRange (ArrayList<Integer> a1, int min, int max){ //bug that doesn't remove maximum
        for (int i = 0; i < a1.size(); i++){

            if ((a1.get(i)>=min &&a1.get(i)<= max)){
                a1.remove(i);
                i--; // remaining elements will shift positions after other ones are removed, that's why this is necessary.
            }
        }
        return a1;
    }

    //question 3


    public static ArrayList interleave(ArrayList<Integer> a1, ArrayList <Integer> a2) {
        //CONSIDER RENAMING THE VARIABLES

        //iterates through the values in a1 and adds the values of a2.
        int a1Elements = 1;

        //iterates through the values in a2 to add to a1.
        int a2Iterator = 0;

        while(a2Iterator < a2.size()) { //goes through the elements of a2.

            if(a1Elements < a1.size()) { //goes through the elements of a1.

                a1.add(a1Elements, a2.get(a2Iterator));
                a1Elements += 2;
            }
            else {
                a1.add(a2.get(a2Iterator));
                a1Elements++;
            }

            a2Iterator++;
        }

        return a1;
    }










}
