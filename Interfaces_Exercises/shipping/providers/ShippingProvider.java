package providers;

public interface ShippingProvider {
    Shipping calculateShipping(double weight, double value);
    ShippingProviderType getShippingProviderType();
}