import static org.junit.Assert.*;
import org.junit.*;
import Shop.*;

public class CheckoutTest{

  ShoppingBasket basket;
  Customer customer;
  Checkout checkout;

  Item pasta;
  Item sauce;
  Item sausage;
  Item magazine;

  @Before 
  public void before(){
    basket = new ShoppingBasket();
    pasta = new Item("pasta", 1.99, true);
    sauce = new Item("sauce", 2.00, false);
    sausage = new Item("sausage", 4.00, false);
    magazine = new Item("magazine", 3.00, true);

    basket.add(pasta);
    basket.add(sauce);
    basket.add(sausage);
    basket.add(magazine);

    customer = new Customer(basket);
    checkout = new Checkout(customer);
  }

  @Test 
  public void canGetTotal(){
    assertEquals((Double)9.00, checkout.getTotal()); 
  }

  @Test 
  public void appliesTotalSpendDiscount(){
    assertEquals((Double)18.00, checkout.applyTotalSpendDiscount(20.00));
  }

  @Test 
  public void noLoyaltyCard(){
    assertEquals((Double)100.00, checkout.applyLoyaltyDiscount(100.00));
  }

  @Test
  public void hasLoyaltyCard(){
    customer.setLoyaltyCard();
    assertEquals((Double)98.00, checkout.applyLoyaltyDiscount(100.00));
  }
}