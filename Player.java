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
        int value = 0; // dummy

        return value;
    }

    public void add(Card card){

    }
}