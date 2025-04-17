package factory.model;

public class Magazine extends Book{
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: \"" + title + "\" by " + author);
    }
}
