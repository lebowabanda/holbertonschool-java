package products;

public class Dvd extends Products {
  private String director;
  private String genre;
  private int duration;

  public Dvd(String title, int year, String country, double grossPrice, String director, String genre, int duration) {
    super(title, year, country, grossPrice);
    this.director = director;
    this.genre = genre;
    this.duration = duration;
  }

  @Override
  public double getNetPrice() {
    return getGrossPrice() * 1.20;
  }

  public String getDirector() {
    return this.director;
  }

  public String getGenre() {
    return this.genre;
  }

  public int getDuration() {
    return this.duration;
  }
}