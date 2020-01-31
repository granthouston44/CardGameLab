import org.junit.Before;
import org.junit.Test;

public class GameLogicTest {

    private Deck deck;
    private Player player1;
    private Player player2;


    @Before
    public void before(){
        deck = new Deck();
        deck.populate();
        deck.shuffle();
        player1 = new Player("Grant");
        player2 = new Player("Ailsa");
    }

    @Test
    public void canDealCardToPlayer1(){
        Card dealtCard = deck.dealCard();
        player1.receiveCard(card);
        assertEquals(1, player.hand.size());
    }

}
