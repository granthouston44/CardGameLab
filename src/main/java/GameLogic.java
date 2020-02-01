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

}
