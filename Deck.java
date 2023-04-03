import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck(){
        for (Rank rank : Rank.values()){
            for (Suit suit : Suit.values()){
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeck(){

        return deck;
    }


}
