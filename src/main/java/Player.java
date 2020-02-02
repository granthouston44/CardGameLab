import java.util.ArrayList;

public class Player {

    private String name;
//    private Card card;
    private ArrayList<Card> hand;
    private int total;

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

    public int getHandValue() {
        int totalHandValue = 0;
        for (int i = 0; i < this.getHandSize(); i++){
            totalHandValue += hand.get(i).getRankValue();
        }
        return totalHandValue;
    }

    public boolean gotBlackJack(){
        boolean gotAce = false;
        boolean gotTen = false;

        for (int i = 0; i < this.getHandSize(); i++){
            Card tempCard = hand.get(i);
            if (tempCard.getRankValue() == 1){
            gotAce = true;
            }

            if (tempCard.getRankValue() == 10){
                gotTen = true;
            }
        }
        if (gotAce && gotTen == true) {
            return true;
        }
        return false;
    }
}
