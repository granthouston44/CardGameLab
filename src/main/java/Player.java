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

    public Card getHand() {
        return hand.get(0);
    }

    public void receiveCard(Card dealtCard) {
        this.hand.add(dealtCard);
    }

    public void setName(String name) {
        this.name = name;
    }
}
