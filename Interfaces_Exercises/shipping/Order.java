import providers.Shipping;

public class Order {
  private int code;
  private double weight;
  private double total;
  private Shipping shipping;

  public Order(int order, double weight, double total) {
    this.code = order;
    this.weight = weight;
    this.total = total;
  }

  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public int getCode() {
    return this.code;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getTotal() {
    return this.total;
  }

  public Shipping getShipping() {
    return this.shipping;
  }
}