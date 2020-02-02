import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Card card1;
    private Card card2;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();



    }

    @Test
    public void canGivePlayerName(){
        player1.setName("Shrek");
        assertEquals("Shrek", player1.getName());
    }

    @Test
    public void canCountHandValue(){

        card1 = new Card (SuitType.HEARTS, RankType.FIVE);
        card2 = new Card (SuitType.DIAMONDS, RankType.THREE);
        player1.receiveCard(card1);
        player1.receiveCard(card2);
        assertEquals(8, player1.getHandValue());
    }

    @Test
    public void canCallBlackJack(){
        card1 = new Card (SuitType.HEARTS, RankType.ACE);
        card2 = new Card (SuitType.DIAMONDS, RankType.TEN);
        player1.receiveCard(card1);
        player1.receiveCard(card2);
        assertEquals(true, player1.gotBlackJack());
    }
    @Test
    public void canCallBlackJackFalse(){
        card1 = new Card (SuitType.HEARTS, RankType.TWO);
        card2 = new Card (SuitType.DIAMONDS, RankType.TEN);
        player1.receiveCard(card1);
        player1.receiveCard(card2);
        assertEquals(false, player1.gotBlackJack());
    }

}
