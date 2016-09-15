import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import Shop.*;

public class ShoppingBasketTest{

  ShoppingBasket shoppingBasket;
  Item pasta;

  @Before
  public void before(){
    shoppingBasket = new ShoppingBasket();
    pasta = new Item("pasta", 4.99, false);
  }

  @Test 
  public void canAddItem(){
    shoppingBasket.add(pasta);
    assertEquals(1, shoppingBasket.size());
  }

  @Test
  public void canRemoveItem(){
    shoppingBasket.add(pasta);
    assertEquals(1, shoppingBasket.size());
    shoppingBasket.remove(0);
    assertEquals(0, shoppingBasket.size());
  }

  @Test
  public void basketCanBeEmptied(){
    shoppingBasket.add(pasta);
    shoppingBasket.add(pasta);
    shoppingBasket.add(pasta);
    assertEquals(3, shoppingBasket.size());
    shoppingBasket.empty();
    assertEquals(0, shoppingBasket.size());
  }

}