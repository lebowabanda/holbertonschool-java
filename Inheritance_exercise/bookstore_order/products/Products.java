package products;

public abstract class Products {
  private String title;
  private int year;
  private String country;
  private double grossPrice;

  public Products(String title, int year, String country, double grossPrice) {
    this.title = title;
    this.year = year;
    this.country = country;
    this.grossPrice = grossPrice;
  }

  public int getYear() {
    return this.year;
  }

  public String getCountry() {
    return this.country;
  }

  public String getTitle() {
    return this.title;
  }

  public double getGrossPrice() {
    return this.grossPrice;
  }

  public abstract double getNetPrice();
}