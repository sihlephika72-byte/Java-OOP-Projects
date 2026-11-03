package OOP_PROJECT_4;

public abstract class InventoryItem {
    private String itemID;
    protected double price;
    protected String description;
    private static int totalItemsCreated = 0;

    InventoryItem(String itemID, String description){
        this.itemID = "ITEM-000";
        this.price = 0.0;
        this.description = "Unknown";
        totalItemsCreated ++;
    }

    InventoryItem(String itemID,
    double price,
    String description){
        this.itemID = itemID;
        this.price = price;
        this.description = description;
        totalItemsCreated ++;
    }


    public String getItemID() {
        return itemID;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public static int getTotalItemsCreated() {
        return totalItemsCreated;
    }

    public abstract double calculateTax(double taxRate);

    @Override
    public String toString(){
        return "[ID: " + itemID + " | Item: " + description + " | Price: R"+price+"]";
    }

}
