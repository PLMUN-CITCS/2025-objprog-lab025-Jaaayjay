class Item {
    static int objectCount= 0;
    String itemName;

    public Item(String itemName){
        this.itemName = itemName;
        objectCount++;
    }
    public static void displayObjectCount(){
        System.out.println("Totatl object created: "+ objectCount);  
    }
    public void displayItem(){
        System.out.println("Item: " + itemName);
    }
}
    
public class ItemDemo{
        public static void main(String[] args){
            Item item1 = new Item("laptop");
            Item item2 = new Item("smartphone");
            Item item3 = new Item("tablet");
            item1.displayItem();
            item2.displayItem();
            item3.displayItem();
            Item.displayObjectCount();
        }
    }
