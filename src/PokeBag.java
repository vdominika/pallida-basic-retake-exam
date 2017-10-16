import java.util.Random;

public class PokeBag {

    String name;
    String language;
    int HealthPoints;

    Random rand = new Random();
    int StrenghtPoints  = rand.nextInt(10) + 1;

    public static void PokeBag (String name, String language, int HealthPoints, int StrenghtPoints){
        
    }

        // Pokemons can say their sound (see above) when their Speak method is called. The Speak method should return the pokemon’s sound.
        // Create a function that returns the pokemon with the highest strength. In case of equal strengths, it’s your choice which one to return.
        //
        // Example:
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Bulbasaur());
        // pokeBag.add(new Charmander());
        //
        // System.out.println(pokeBag.get(0).speak());
        // This should print Pika-pika
        //
        // Pokemon stongestPokemon = pokeBag.getStrongest();
        // Should return the pokemon with the highest strength value
    }
}