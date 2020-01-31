import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.CLUBS,RankType.ACE);
    }
    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canPopulateFullDeck(){
        deck.populate();
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canShuffleCards(){
        deck.populate();
        deck.shuffle();
            System.out.println(deck);
        }






}





