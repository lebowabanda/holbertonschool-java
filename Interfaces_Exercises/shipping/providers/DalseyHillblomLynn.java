package providers;

public class DalseyHillblomLynn implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {

        double cost = (weight > 5000) ? value * 0.12 : value * 0.04;

        return new Shipping(cost, ShippingProviderType.DHL);
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}