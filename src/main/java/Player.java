import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(){
        this.name = "" ;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void removeHand() {
        this.hand.clear();
    }

    public Card getHand() {
        return hand.get(0);
    }

    public int getHandSize(){
        return hand.size();
    }

    public void receiveCard(Card dealtCard) {
        this.hand.add(dealtCard);
    }

    public void setName(String name) {
        this.name = name;
    }
}
