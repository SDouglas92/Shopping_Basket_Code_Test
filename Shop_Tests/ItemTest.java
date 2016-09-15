import static org.junit.Assert.*;
import org.junit.*;
import Shop.*;

public class ItemTest{

  Item pasta;

  @Before 
  public void before(){
    pasta = new Item("pasta", 2.99, true);
  }

  @Test 
  public void hasName(){
    assertEquals("pasta", pasta.getName());
  }

  @Test 
  public void hasPrice(){
    assertEquals((Double)2.99, pasta.getPrice());
  }
}