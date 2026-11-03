package OOP_PROJECT_2;

public abstract class Superhero {

    private String name;
    private int powerLevel;

    private static int totalSuperheroes = 0;

    public Superhero() {
        this.name = "Unknown Hero";
        this.powerLevel = 10;
        totalSuperheroes++; // Increment static counter
    }

    public Superhero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        totalSuperheroes++; // Increment static counter
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public static int getTotalSuperheroes() {
        return totalSuperheroes;
    }

    public abstract void useSpecialAbility();

    @Override
    public String toString() {
        return "[Hero: " + name + " | Power Level: " + powerLevel + "]";
    }
}