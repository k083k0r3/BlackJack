import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        Deck newDeck = new Deck();
        players = new ArrayList<>();
        while(players.size() == 0){
            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();
            players.add(player1);
            players.add(player2);
            players.add(player3);
        }
    }

    public void giveOutCards(){
        dishOut();
        dishOut();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void dishOut(){
        
        for (int i = 0; i < players.size(); i++){
            for (int j = 0; j < deck.getDeck().size(); j++) {
                players.get(i).setHand(deck.getDeck().remove(j));
            }
        }


    }


    public void addPlayer(Player player){
        players.add(player);

    }

    public Deck getDeck() {
        return deck;
    }
}
