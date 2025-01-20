import java.util.ArrayList;
import java.util.List;

public class GameWord {


    private List<Character> secretWorl = new ArrayList<>();
    private int lifePoint;
    private List<Character> guessWorl = new ArrayList<>();

    public GuessGame(String secretWorl, int lifePoint){
        for(char c : secretWorl.toCharArray()){
            this.secretWorl.add(c);//ajout du caracter à chaque entréee utilisateur
        }
        this.lifePoint = lifePoint;
        for(int index; index< secretWorl.length(); index++){
            this.guessWorl.add('_');
        }
    }

    @Override
    public String toString(){
        return "mot à deviner"+guessWorl+
                "| point de vie"+lifePoint;
    }

}
