import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game {

    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck;

    public Game(){

    }

    public void shuffleCards(){
        Collections.shuffle(deck.getDeck());
    }
    public void startGame(){
        //shuffle cards
        shuffleCards();
        //dish out cards to players


    }

    public void addPlayer(Player player){

    }




}
