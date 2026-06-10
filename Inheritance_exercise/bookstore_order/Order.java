public class Order {
  private double discountPercentage;
  private ItemOrder[] items;

  public Order(double discountPercentage, ItemOrder[] items) {
    this.discountPercentage = discountPercentage;
    this.items = items;
  }

  public double calculateTotal() {
    double total = 0.0;
    for (ItemOrder item : items) {
      total += item.getProduct().getNetPrice() * item.getQuantity();
    }
    total -= total * (discountPercentage / 100.0);
    return total;
  }
}