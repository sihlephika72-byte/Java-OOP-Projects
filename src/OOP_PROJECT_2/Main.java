package OOP_PROJECT_2;

public class Question1 {
    public static void main(String[] args){
        System.out.println(Superhero.getTotalSuperheroes());
        Superhero[] superheroes = new Superhero[3];
        superheroes[0] = new FlyingHero("Falcon", 85, 350.5);
        superheroes[1] = new TechHero("Ironclad", 85, 12);
        superheroes[2] = new FlyingHero("Skybolt", 90, 500.0);

        for (Superhero superhero : superheroes){
            superhero.toString();
            superhero.useSpecialAbility();
        }
        LeagueManager.comparePower(superheroes[0], superheroes[1]);
        System.out.println(Superhero.getTotalSuperheroes());
    }
}
