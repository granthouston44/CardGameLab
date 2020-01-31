import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Card card;

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

}
