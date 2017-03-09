import static org.junit.Assert.*;
import org.junit.*;
import card.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(Suit.DIAMONDS, Value.TWO);
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.DIAMONDS,card.getSuit());
  }

  @Test
  public void canGetValue(){
    assertEquals(Value.TWO, card.getValue());
  }

}