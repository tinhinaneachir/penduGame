import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final var random = new Random();
        final var words = "bonjour maison acheter informatique sport cuisine".split(" ");
        final var worldToGuss = words[random.nextInt(words.length)];
        final var game = new GuessGame(worldToGuss, 10);

        System.out.println("Debut du jeu");

        while (true){
            System.out.println(game);
            System.out.println("Entrer une lettre");
            final var lettre = scanner.nextLine().charAt(0);
        }

    }
}