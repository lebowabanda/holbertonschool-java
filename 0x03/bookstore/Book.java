import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price)
            throws InvalidAuthorException, InvalidBookException {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) throws InvalidBookException {
        if (title == null || title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        }
        this.title = title;
    }

    public void setAuthor(String author) throws InvalidAuthorException {
        if (author == null || author.trim().split(" ").length < 2) {
            throw new InvalidAuthorException("Invalid author name");
        }
        this.author = author;
    }

    public void setPrice(double price) throws InvalidBookException {
        if (price <= 0) {
            throw new InvalidBookException("Invalid book price");
        }
        this.price = price;
    }
}