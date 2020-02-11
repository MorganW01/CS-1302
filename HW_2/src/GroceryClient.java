public class GroceryClient {
    public static void main (String []args){
        GroceryItemOrder item1 = new GroceryItemOrder("apples",5,.75);
        GroceryItemOrder item2 = new GroceryItemOrder("fish",2,6.5);
        GroceryItemOrder item3 = new GroceryItemOrder("cookies",4,2.5);
        GroceryItemOrder item4 = new GroceryItemOrder("bread",1,1.0);
        GroceryItemOrder item5 = new GroceryItemOrder("chicken",3,5.5);
        GroceryItemOrder item6 = new GroceryItemOrder("bananas",5,.5);
        GroceryItemOrder item7 = new GroceryItemOrder("carrots",5,.75);

        GroceryList groceryList = new GroceryList();

        groceryList.add(item1);
        groceryList.add(item2);
        groceryList.add(item3);
        groceryList.add(item4);
        groceryList.add(item5);
        groceryList.add(item6);
        groceryList.add(item7);


        //bug is here. figure out how to print the lists correctly.
        System.out.println(groceryList.toString());

        System.out.println("Your total is: $"+groceryList.getTotalCost());






    }


}
