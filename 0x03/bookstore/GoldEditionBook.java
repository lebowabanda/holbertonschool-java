import exceptions.InvalidAuthorException;
import exceptions.InvalidBookException;

public class GoldEditionBook extends Book {

    public GoldEditionBook(String title, String author, double price)
            throws InvalidAuthorException, InvalidBookException {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return price * 1.30;
    }
}