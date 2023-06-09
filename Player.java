import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int handValue;
    private String name;

    public Player(){
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public int calcHandValue(){
        // dummy
        for (int i = 0; i < getHand().size(); i++){
            handValue = getHand().get(i).getRank().value;
        }

        return handValue;
    }

    public String getName() {
        return name;
    }

    public void setHand(Card card) {
        hand.add(card);
    }

    public void add(Card card){

    }

    public String toString(){
        return "First Card : " + hand.get(0) + " Second Card: " + hand.get(1);
    }
}