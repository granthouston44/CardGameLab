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
        player2.setName(player2name);

        deck.populate();
        deck.shuffle();

        game.dealCard(player1);
        game.dealCard(player2);
        ui.cardsDealt();
        Player winner = game.playHand();
        ui.whoWins(winner);

        if(game.playAgain() == true){
            deck.shuffle();
            game.dealCard(player1);
            game.dealCard(player2);
            ui.cardsDealt();
            Player winner = game.playHand();
            ui.whoWins(winner);
        }






    }

}
