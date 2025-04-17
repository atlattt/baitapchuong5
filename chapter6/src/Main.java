import factory.BookFactory;
import factory.enums.BookTypeEnum;
import factory.model.Book;
import singleton.CartManager;

public class Main {
    public static void main(String[] args) {
        Book magazine = BookFactory.createBook(BookTypeEnum.MAGAZINE, "National Geographic", "Various");
        Book ebook = BookFactory.createBook(BookTypeEnum.EBOOK, "1984", "George Orwell");
        Book audio = BookFactory.createBook(BookTypeEnum.AUDIOBOOK, "Becoming", "Michelle Obama");

        magazine.displayInfo();
        ebook.displayInfo();
        audio.displayInfo();

        CartManager cart = CartManager.getInstance();

        cart.addBook(magazine);
        cart.addBook(ebook);
        cart.addBook(audio);

        cart.showCart();

        System.out.println("========================================================");

        cart.clearCart();

        cart.showCart();
    }
}