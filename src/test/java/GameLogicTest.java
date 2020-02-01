import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameLogicTest {

    private Deck deck;
    private Player player1;
    private Player player2;
    private GameLogic gameLogic;



    @Before
    public void before(){
        deck = new Deck();
        deck.populate();
        deck.shuffle();
        player1 = new Player();
        player2 = new Player();
        gameLogic = new GameLogic(deck, player1, player2);
    }

    @Test
    public void canDealCardToPlayer1(){
        gameLogic.dealCard(player1);
        assertEquals(1, player1.getHand().size());
    }

    @Test
    public void canDealCardToPlayer2(){
        gameLogic.dealCard(player2);
        assertEquals(1, player2.getHand().size());
    }

    @Test
    public void canPlayHand(){
    gameLogic.dealCard(player1);
    gameLogic.dealCard(player2);
assertEquals(player1, gameLogic.playHand());
    }



}
