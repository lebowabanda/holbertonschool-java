public class Order {

    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateProductsTotal() {
        double total = 0;

        for (ItemOrder item : items) {
            total += item.getProduct().getNetPrice() * item.getQuantity();
        }

        return total;
    }

    public double calculateDiscount() {
        return calculateProductsTotal() * discountPercentage / 100.0;
    }

    public double calculateTotal() {
        return calculateProductsTotal() - calculateDiscount();
    }

    public void presentOrderSummary() {

        System.out.println("------- ORDER SUMMARY -------");

        for (ItemOrder item : items) {
            Products p = item.getProduct();
            double price = p.getNetPrice();
            double total = price * item.getQuantity();

            String type = p.getClass().getSimpleName();

            System.out.printf(
                "Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f%n",
                type,
                p.getTitle(),
                price,
                item.getQuantity(),
                total
            );
        }

        System.out.println("----------------------------");

        System.out.printf("DISCOUNT: %.2f%n", calculateDiscount());
        System.out.printf("TOTAL PRODUCTS: %.2f%n", calculateProductsTotal());

        System.out.println("----------------------------");

        System.out.printf("TOTAL ORDER: %.2f%n", calculateTotal());

        System.out.println("----------------------------");
    }
}