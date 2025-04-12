public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Basics", "Alice", "001"),
                new Book("C++ Programming", "Bob", "002"),
                new Book("Data Structures", "Carol", "003")
        };

        Book target = new Book("C++ Programming", "", "");

        Search linear = new LinearSearch();
        int linearIndex = linear.search(books, target);
        System.out.println("Linear Search found at index: " + linearIndex);

        Search binary = new BinarySearch();
        int binaryIndex = binary.search(books, target);
        System.out.println("Binary Search found at index: " + binaryIndex);

    }
}