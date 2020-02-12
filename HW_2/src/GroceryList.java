import java.util.ArrayList;
import java.util.List;

public class GroceryList {

    //initialize as a list, then make it an array list.
    List<GroceryItemOrder> list = null;

    //represents a list of items to buy
    public GroceryList(){
        list = new ArrayList<>();

    }

    public void add(GroceryItemOrder item){

        list.add(item);
    }

    public double getTotalCost(){
        int total=0;
        for (int i =0; i<list.size(); i++){
            total+= list.get(i).getCost();
        }

        return total;
    }


}
