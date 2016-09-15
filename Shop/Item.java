package Shop;

public class Item {

  private String name;
  private Double price;
  private Boolean onOffer;

  public Item(String name, Double price, Boolean onOffer){
    this.name = name;
    this.price = price;
    this.onOffer = onOffer;
  }

  public String getName(){
    return this.name;
  }

  public Double getPrice(){
    return this.price;
  }

  public Boolean getOnOffer(){
    return this.onOffer;
  }
}