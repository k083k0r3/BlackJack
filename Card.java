public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    @Override
    public String toString(){
        return "Card [" + "Rank: " +
                getRank() + " | Suit: " +
                getSuit() + "]";
    }

}
