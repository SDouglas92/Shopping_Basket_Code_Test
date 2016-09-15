package Shop;
import java.util.*;

public class Checkout{

  private Customer customer;

  public Checkout(Customer customer){
    this.customer = customer;
  }

  public Double getTotal(){
    ShoppingBasket basket = customer.getCustomerBasket();
    ArrayList<Item> allItems = basket.getAllItems();
    ArrayList<Double> onOfferPrices = new ArrayList<Double>();

      Double totalSpent = 0.00;

      for (Item item : allItems){
        totalSpent += item.getPrice();
          if(item.getOnOffer() == true){
            onOfferPrices.add(item.getPrice());
          }
      }

    Double discountTotal = bogof(onOfferPrices);

    Double runningTotal = totalSpent - discountTotal;

    runningTotal = applyTotalSpendDiscount(runningTotal);
    runningTotal = applyLoyaltyDiscount(runningTotal);

    return runningTotal;

  }

  public Double applyTotalSpendDiscount(Double total){
    if(total >= 20.00){
      return total * 0.9;
    }
    return total; 
  }

  public Double applyLoyaltyDiscount(Double total){
    if(customer.getLoyaltyCard() == true){
      return total * 0.98;
    }
    return total;
  }

  public Double bogof(ArrayList<Double> onOfferPrices){
    Collections.sort(onOfferPrices);

    Double discountTotal = 0.00;

      if(onOfferPrices.size() != 1){

        List<Double> freeItemsToBeDeducted = onOfferPrices.subList(0, (onOfferPrices.size()/2));

          for(Double price : freeItemsToBeDeducted){
            discountTotal += price;
          }

      } 
    
    return discountTotal;


  }
}