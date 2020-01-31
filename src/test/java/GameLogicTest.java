import org.junit.Before;

public class GameLogicTest {

    private Deck deck;
    private Player player1;
    private Player player2;


    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player("Grant");
        player2 = new Player("Ailsa");
    }



}
