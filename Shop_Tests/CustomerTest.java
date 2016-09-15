import static org.junit.Assert.*;
import org.junit.*;
import Shop.*;

public class CustomerTest{

  Customer customer;
  ShoppingBasket basket;
  

  @Before
  public void before(){
    basket = new ShoppingBasket();
    customer = new Customer(basket);
  }

  @Test
  public void customerHasNoLoyaltyCard(){
    assertEquals(false, customer.getLoyaltyCard());
  }

  @Test
  public void customerCanHaveLoyaltyCard(){
    customer.setLoyaltyCard();
    assertEquals(true, customer.getLoyaltyCard());
  }

  @Test
  public void customerHasBasket(){
   assertNotNull(customer.getCustomerBasket());
  }
}