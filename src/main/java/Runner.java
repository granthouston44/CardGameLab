public class Runner {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player();
        Player player2 = new Player();
        GameLogic game = new GameLogic(deck, player1, player2);
        UI ui = new UI();

        ui.welcome();
        String player1name = ui.getPlayer1Name();
        player1.setName(player1name);
        String player2name = ui.getPlayer2Name();
        player1.setName(player2name);

        game.dealCard(player1);
        game.dealCard(player2);
        ui.cardsDealt();
        game.playHand();








    }

}
