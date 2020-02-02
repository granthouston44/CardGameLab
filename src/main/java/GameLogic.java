public class GameLogic {

    private Deck deck;
    private Player player1;
    private Player player2;

    public GameLogic(Deck deck, Player player1, Player player2){
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
    }


    public void dealCard(Player player){
        Card dealtCard = deck.dealCard();
        player.receiveCard(dealtCard);
    }

    public Player playHand() {
        if (player1.getHand().getRankValue() > player2.getHand().getRankValue()){
            return player1;
        } else{
            return player2;
        }

    }

    public void removeHands() {
        player1.removeHand();
    }
}
