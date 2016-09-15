package Shop;
import java.util.*;

public class ShoppingBasket{

  private ArrayList<Item> basket;

  public ShoppingBasket(){
    this.basket = new ArrayList<Item>();
  }

  public void add(Item item){
    basket.add(item);
  }

  public int size(){
    return basket.size();
  }

  public void remove(int position){
    basket.remove(position);
  }

  public void empty(){
    basket.clear();
  }

  public ArrayList<Item> getAllItems(){
    return this.basket;
  }
}