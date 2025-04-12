public class BinarySearch implements Search {
    @Override
    public int search(Book[] books, Book target) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (books[mid].getTitle().equals(target.getTitle())) {
                return mid; // Found
            }

            if (books[mid].getTitle().compareTo(target.getTitle()) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Not found
    }
}
