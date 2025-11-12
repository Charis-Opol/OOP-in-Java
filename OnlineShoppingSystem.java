class Item{
    protected String itemId;
    protected String itemName;
    protected double price;

    Item(String itemId, String itemName, double price){
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails(){
        System.out.println("Item ID: " + this.itemId + "\nItem Name: " + this.itemName + "\nItem Price: $" + this.price);
    }
}

class ElectronicItem extends Item{
    private String warrantyPeriod;

    ElectronicItem(String itemId, String itemName, double price, String warrantyPeriod){
        super(itemId, itemName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayItemDetails(){
        System.out.println("Electronic Item Details:\nItem ID: " + this.itemId + "\nItem Name: " + this.itemName + "\nItem Price: $" + this.price + "\nWarranty Period: " + this.warrantyPeriod);
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args){
        Item item = new Item("I001", "Book", 15.99);
        ElectronicItem eItem = new ElectronicItem("E001", "Smartphone", 699.99, "2 years");

        System.out.println("Regular Item:");
        item.displayItemDetails();
        System.out.println("\n---------------------------\n");
        System.out.println("Electronic Item:");
        eItem.displayItemDetails();
    }
}
