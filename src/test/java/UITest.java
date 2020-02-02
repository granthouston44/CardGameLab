import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UITest {

    private UI ui;

    @Before
    public void before(){
        ui = new UI();
    }

    @Test
    public void playAgainReturnsTrue(){
        Boolean choice = ui.playAgain();
        assertEquals(true, choice);
    }

}
