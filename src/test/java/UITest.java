import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UITest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    private UI ui;
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;

    private Deck deck;
    private Player dealer;
    private Player player1;
    private Player player2;
    private GameLogic gameLogic;

    @Before
    public void before(){
        System.setOut(new PrintStream(outContent));

        ui = new UI();
        deck = new Deck();
        deck.populate();
        deck.shuffle();
        dealer = new Player();
        player1 = new Player();
        player2 = new Player();
        player1.setName("Grant");
        player2.setName("Ailsa");
        gameLogic = new GameLogic(deck, player1, player2, dealer);
    }

    @Test
    public void dealtCardStringShowsDealersCard(){

        gameLogic.dealToDealer();
        ui.cardsDealt(gameLogic);
        assertNotNull(outContent.toString());
    }

    @Test
    public void showScore(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
        player1.receiveCard(card1);
        player2.receiveCard(card2);
        gameLogic.playHand();
        ui.score(gameLogic);
        assertEquals("Current score: \n Grant: 1 Ailsa: 0\n", outContent.toString());
    }

    @Test
    public void winsWithBlackJack(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
        card3 = new Card (SuitType.DIAMONDS, RankType.KING);
        card4 = new Card (SuitType.HEARTS, RankType.TEN);
        player1.receiveCard(card1);
        player1.receiveCard(card2);
        dealer.receiveCard(card3);
        dealer.receiveCard(card4);
        Player winner = gameLogic.playHand();
        ui.whoWins(winner);
        assertEquals("Grant wins with BlackJack!\n", outContent.toString());
    }



}
