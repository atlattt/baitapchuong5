public class LinearSearch implements Search {
    @Override
    public int search(Book[] books, Book target) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(target.getTitle())) {
                return i;
            }
        }
        return -1; // Not found
    }
}
