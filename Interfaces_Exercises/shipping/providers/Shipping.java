package providers;

public class Shipping {

    private double value;
    private ShippingProviderType shippingProviderType;

    public Shipping(double value, ShippingProviderType shippingProviderType) {
        this.value = value;
        this.shippingProviderType = shippingProviderType;
    }

    public double getValue() {
        return value;
    }

    public ShippingProviderType getShippingProviderType() {
        return shippingProviderType;
    }
}