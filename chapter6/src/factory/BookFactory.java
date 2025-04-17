package factory;

import factory.enums.BookTypeEnum;
import factory.model.AudioBook;
import factory.model.Book;
import factory.model.EBook;
import factory.model.Magazine;

public class BookFactory {
    public static Book createBook(BookTypeEnum type, String title, String author) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case MAGAZINE:
                return new Magazine(title, author);
            case EBOOK:
                return new EBook(title, author);
            case AUDIOBOOK:
                return new AudioBook(title, author);
            default:
                throw new IllegalArgumentException("Unsupported book type: " + type);
        }
    }
}
