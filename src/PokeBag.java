import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class PokeBag {

        String name;
        String language;
        int HealthPoints;

        Random rand = new Random ( );
        int StrenghtPoints = rand.nextInt (10) + 1;

         public void PokeBag(String name, String language, int HealthPoints, int StrenghtPoints) {
         }

        public static void main(String[] args) {

            List pokeBag = new ArrayList ( );

            pokeBag.add (new Pikachu ( ));
            pokeBag.add (new Pikachu ( ));
            pokeBag.add (new Pikachu ( ));
            pokeBag.add (new BulbaSaur ( ));
            pokeBag.add (new Charmander ( ));

        speak();

        strongestPokemon();

    }


    public void speak() {
        if (name = Pikachu) {
            System.out.println ("Pika-pika");
        } else if (name = BulbaSaur) {
            System.out.println ("Bulba-saur");
        } else if (name = Charmander) {
            System.out.println ("Char-char");
        }
    }


    public void strongestPokemon() {
        return strongestPokemon ( );
    }
}
