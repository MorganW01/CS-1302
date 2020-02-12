public class GroceryClient {
    public static void main (String []args){
        GroceryItemOrder apples = new GroceryItemOrder("apples",1,1);
        GroceryItemOrder fish = new GroceryItemOrder("fish",2,2);
        GroceryItemOrder cookies = new GroceryItemOrder("cookies",3,3);
        GroceryItemOrder bread = new GroceryItemOrder("bread",4,4);
        GroceryItemOrder chicken = new GroceryItemOrder("chicken",5,5);
        GroceryItemOrder bananas = new GroceryItemOrder("bananas",6,6);
        GroceryItemOrder carrots = new GroceryItemOrder("carrots",7,7);

        GroceryList groceryList = new GroceryList();

        groceryList.add(apples);
        groceryList.add(fish);
        groceryList.add(cookies);
        groceryList.add(bread);
        groceryList.add(chicken);
        groceryList.add(bananas);
        groceryList.add(carrots);


        System.out.println("The total cost of your groceries is: $"+ groceryList.getTotalCost());



    }


}
