class Book{
    String title;
    String author;
    int price;
    
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Book details.\nBook title: " + this.title + "\nBook author: " + this.author + "\nBook price: shs " + this.price);
    }
}

class Magazine extends Book{
    String issueNumber;

    Magazine(String title, String author, int price, String issueNumber){
        super(title, author, price);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails(){
        System.out.println("Magazine details.\nMagazine title: " + this.title + "\nMagazine author: " + this.author + "\nMagazine price: shs " + this.price + "\nMagazine Issue number: " + this.issueNumber);
    }
}

public class LibraryManagement {
    public static void main(String[] agrs){
        Book book = new Book("Good to Great", "Jim Collins", 95000);
        Magazine magazine = new Magazine("Time Magazine", "Time Corp", 50000, "ISBN 3759297474638");

        book.displayDetails();
        magazine.displayDetails();

   } 
}
