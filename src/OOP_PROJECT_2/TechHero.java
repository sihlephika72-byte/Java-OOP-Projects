package OOP_PROJECT_2;

public class TechHero extends Superhero {
    private int gadgetCount;

    TechHero(String name, int powerLevel, int gadgetCount){
        super(name, powerLevel);
        this.gadgetCount = gadgetCount;
    }
    @Override
    public void useSpecialAbility(){
        System.out.println(getName()+ " deploys " +gadgetCount+" high-tech gadgets in battle!");
    }
}
