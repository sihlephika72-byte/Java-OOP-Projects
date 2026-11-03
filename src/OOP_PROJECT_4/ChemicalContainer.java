package OOP_PROJECT_4;

public class ChemicalContainer extends InventoryItem implements Transportable{
    private double weight;
    private boolean hazardous;

    ChemicalContainer(String itemID, double v, String description, double weight, boolean hazardous){
        super(itemID, description);
        this.weight = weight;
        this.hazardous = hazardous;
    }

    @Override
    public double calculateTax(double taxRate) {
        if (isHazardous()){
            return (price*taxRate)*1.5;
        }
        else {
            return price*taxRate;
        }
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isHazardous() {
        return hazardous;
    }
    public void displayHazardousWarning(){
        if (isHazardous()){
            System.out.println("DANGER: Store in a secure vault!");
        }
        else {
            System.out.println("SAFE: Standard storage.");
        }
    }
}
