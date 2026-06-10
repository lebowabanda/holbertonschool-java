package products;

public abstract class Products {

    protected String title;
    protected int year;
    protected String country;
    protected double grossPrice;

    public Products(String title, int year, String country, double grossPrice) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.grossPrice = grossPrice;
    }

    public abstract double getNetPrice();

    public double getGrossPrice() {
        return grossPrice;
    }
}