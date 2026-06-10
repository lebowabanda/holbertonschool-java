import providers.ShippingProvider;
import providers.Shipping;

public class OrderProcessor {
  private ShippingProvider shippingProvider;

  public OrderProcessor(ShippingProvider shippingProvider) {
    this.shippingProvider = shippingProvider;
  }

  public void process(Order order) {
    Shipping shipping = shippingProvider.calculateShipping(order.getWeight(), order.getTotal());
    order.setShipping(shipping);
  }
}