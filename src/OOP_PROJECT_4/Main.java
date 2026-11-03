package OOP_PROJECT_4;

public class Main {
    public static void main(String[] args){
        InventoryItem[] inventory = new InventoryItem[3];
        inventory[0] = new Book("B101", 150.0, "Java Programming", "Goodrich");
        inventory[1] = new ChemicalContainer("C202", 500.0, "Acid Bath", 25.0, true);
        inventory[2] = new ChemicalContainer("C203", 200.0, "Distilled Water", 10.0, false);

        for(InventoryItem item: inventory ){
            System.out.println(item);
            System.out.println(item.calculateTax(0.15));
            if (item instanceof ChemicalContainer) {
                ChemicalContainer chemicalItem = (ChemicalContainer) item;
                chemicalItem.displayHazardousWarning();
            }
        }
        System.out.println(InventoryItem.getTotalItemsCreated());
    }
}
