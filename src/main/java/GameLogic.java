public class GameLogic {

    private Deck deck;
    public Player player1;
    public Player player2;
    private int player1Score;
    private int player2Score;

    public GameLogic(Deck deck, Player player1, Player player2){
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
        this.player1Score = 0;
        this.player2Score = 0;
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

    public void resetScores() {
        this.player1Score = 0;
        this.player2Score = 0;
    }



    public Player playHand() {
        if (player1.getHand().getRankValue() > player2.getHand().getRankValue()){
            player1Score += 1;
            return player1;
        } else{
            player2Score += 1;
            return player2;
        }

    }

    public void removeHands() {
        player1.removeHand();
        player2.removeHand();
    }


}
