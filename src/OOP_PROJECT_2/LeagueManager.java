package OOP_PROJECT_2;

public class LeagueManager{
    public static void comparePower(Superhero hero1, Superhero hero2){
        if (hero1.getPowerLevel() > hero2.getPowerLevel()) {
            System.out.println(hero1 + "is more powerful");
        }
        else if (hero1.getPowerLevel() < hero2.getPowerLevel()) {
            System.out.println(hero2 + "is more powerful");
        }
        else {
            System.out.println(hero2 + " and " + hero2 + "are equally powerful");
        }
    }
}
