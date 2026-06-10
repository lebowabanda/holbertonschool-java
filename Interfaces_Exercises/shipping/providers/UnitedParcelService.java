package providers;

public class UnitedParcelService implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {

        double cost = (weight > 2000) ? value * 0.07 : value * 0.045;

        return new Shipping(cost, ShippingProviderType.UPS);
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}