package Shop;

public class Customer{

  private Boolean loyaltyCard;
  private ShoppingBasket customerBasket;

  public Customer(ShoppingBasket basket){
    this.loyaltyCard = false;
    this.customerBasket = basket;
  }

  public Boolean getLoyaltyCard(){
    return this.loyaltyCard;
  }

  public void setLoyaltyCard(){
    this.loyaltyCard = true;
  }

  public ShoppingBasket getCustomerBasket(){
    return this.customerBasket;
  }

}