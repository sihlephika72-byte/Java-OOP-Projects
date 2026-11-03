package OOP_PROJECT_2;

public class FlyingHero extends Superhero{
    private double flightSpeed;

    FlyingHero(String name,int powerLevel,double flightSpeed){
        super(name, powerLevel);
        this.flightSpeed = flightSpeed;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " takes to the skies at speed " + this.flightSpeed + " km/h!");
    }
    @Override
    public String toString(){
        return super.toString() + flightSpeed;
    }

}
