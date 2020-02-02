import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameLogicTest {

    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;

    private Player dealer;

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
        dealer = new Player();
        gameLogic = new GameLogic(deck, player1, player2, dealer);
    }

    @Test
    public void canDealCardToPlayer1(){
        gameLogic.dealCard(player1);
        assertNotNull(player1.getHand());
    }

    @Test
    public void canDealCardToPlayer2(){
        gameLogic.dealCard(player2);
        assertNotNull(player2.getHand());
    }

    @Test
    public void canPlayHandPlayer1Wins(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
    player1.receiveCard(card1);
    player2.receiveCard(card2);
assertEquals(player1, gameLogic.playHand());
    }

    @Test
    public void canPlayHandPlayer2Wins(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
    player1.receiveCard(card2);
    player2.receiveCard(card1);
assertEquals(player2, gameLogic.playHand());
    }

    @Test
    public void canDeletePlayerHand(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
        player1.receiveCard(card2);
        player2.receiveCard(card1);
        gameLogic.removeHands();
        assertEquals(0, player1.getHandSize());
    }

    @Test
    public void canKeepScore(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
        player1.receiveCard(card1);
        player2.receiveCard(card2);
        gameLogic.playHand();
        assertEquals(1, gameLogic.getPlayer1Score());
    }

    @Test
    public void canDealToDealer(){
        gameLogic.dealToDealer();
        assertEquals(1, gameLogic.getDealerHandSize());
    }

    @Test
    public void blackJackWins(){
        card1 = new Card (SuitType.HEARTS, RankType.KING);
        card2 = new Card (SuitType.DIAMONDS, RankType.ACE);
        card3 = new Card (SuitType.DIAMONDS, RankType.KING);
        card4 = new Card (SuitType.HEARTS, RankType.TEN);
        player1.receiveCard(card1);
        player1.receiveCard(card2);
        dealer.receiveCard(card3);
        dealer.receiveCard(card4);
        assertEquals(player1, gameLogic.playHand());
    }



}
