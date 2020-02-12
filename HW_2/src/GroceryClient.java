public class GroceryClient {
    public static void main (String []args){
        GroceryItemOrder item1 = new GroceryItemOrder("apples",1,1);
        GroceryItemOrder item2 = new GroceryItemOrder("fish",2,2);
        GroceryItemOrder item3 = new GroceryItemOrder("cookies",3,3);
        GroceryItemOrder item4 = new GroceryItemOrder("bread",4,4);
        GroceryItemOrder item5 = new GroceryItemOrder("chicken",5,5);
        GroceryItemOrder item6 = new GroceryItemOrder("bananas",6,6);
        GroceryItemOrder item7 = new GroceryItemOrder("carrots",7,7);

        GroceryList groceryList = new GroceryList();

        groceryList.add(item1);
        groceryList.add(item2);
        groceryList.add(item3);
        groceryList.add(item4);
        groceryList.add(item5);
        groceryList.add(item6);
        groceryList.add(item7);


        System.out.println("The total cost of your groceries is: $"+ groceryList.getTotalCost());



    }


}
