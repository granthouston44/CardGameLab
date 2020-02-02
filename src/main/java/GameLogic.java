import java.util.ArrayList;

public class GameLogic {

    private Deck deck;
    public Player player1;
    public Player player2;
    public Player dealer;
    private int player1Score;
    private int player2Score;
    private int dealerScore;

    public GameLogic(Deck deck, Player player1, Player player2, Player dealer){
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
        this.dealer = dealer;
        dealer.setName("Dealer");
        this.player1Score = 0;
        this.player2Score = 0;
        this.dealerScore = 0;
    }


    public void dealCard(Player player){
        Card dealtCard = deck.dealCard();
        player.receiveCard(dealtCard);
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public int getDealerScore(){
        return dealerScore;
    }

    public void resetScores() {
        this.player1Score = 0;
        this.player2Score = 0;
        this.dealerScore = 0;
    }



    public Player playHand() {
        if (player1.getHandValue() > getDealerHandValue()){
            player1Score += 1;
            return player1;
        } else{
            dealerScore += 1;
            return dealer;
        }

    }

    public void removeHands() {
        player1.removeHand();
        player2.removeHand();
        dealer.removeHand();
    }


    public int getDealerHandValue() {
        return dealer.getHandValue();
    }

    public int getDealerHandSize(){
        return dealer.getHandSize();
    }

    public void dealToDealer() {
        Card dealtCard = deck.dealCard();
        dealer.receiveCard(dealtCard);
    }

    public Card getDealerFirstCard(){
        return dealer.getHand();
    }
}
