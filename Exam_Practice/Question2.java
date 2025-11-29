import java.util.ArrayList;

class MenuItem{
    String name;
    int price;
    boolean available;

    MenuItem(String name, int price, boolean available){
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public void order(){
        System.out.println("Ordering.....");
    }
}

class Drink extends MenuItem{
    String size;

    Drink(String name, int price, boolean available, String size){
        super(name, price, available);
        this.size = size;
    }

    @Override
    public void order(){
        System.out.println("Order details\nName: " + this.name + "\nPrice: " + this.price + "\nAvailability: " + this.available + "\nSize: " + this.size);
    }
}

class Food extends MenuItem{
    boolean is_vegeterian;

    Food(String name, int price, boolean available, boolean is_vegeterian){
        super(name, price, available);
        this.is_vegeterian = is_vegeterian;
    }

    @Override
    public void order(){
        System.out.println("Order details\nName: " + this.name + "\nPrice: " + this.price + "\nAvailability: " + this.available + "\nVegeterian status: " + this.is_vegeterian);
    }
}

class Order extends MenuItem {

    ArrayList<MenuItem> orders = new ArrayList<>();

    public void additems(MenuItem item){
        orders.add(item);
    }

    public void removeitems(MenuItem item){
        int index = orders.indexOf(item);
        orders.remove(index);
    }
}

public class Question2 {
    public static void main(String[] args){

    }
}
