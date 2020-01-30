import java.util.ArrayList;

public class Deck {
    private Card card;
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void populate(){
        // For every suit
        for(SuitType suit : SuitType.values()){
            for(RankType value : RankType.values()){
                card = new Card(suit, value);
                this.cards.add(card);
            }
        }
        // For every rank
        // Create new card with that suit and rank
        // Add to this cards
    }
}
