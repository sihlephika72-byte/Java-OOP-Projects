package OOP_PROJECT_4;

public class Book extends InventoryItem{
    private String author;

    Book(String itemID, double price, String description,String author){
        super(itemID, price, description);
        this.author = author;
    }

    @Override
    public double calculateTax(double taxRate) {
        return price*taxRate;
    }

    @Override
    public String toString() {
        return super.toString() + " | Author: " + author;
    }
}
