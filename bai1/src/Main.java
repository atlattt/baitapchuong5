public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("An", 10, new CategoryA());
        Employee emp2 = new Employee("Bình", 5, new CategoryB());
        Employee emp3 = new Employee("Chi", 8, new CategoryC());

        emp1.display();
        emp2.display();
        emp3.display();

    }
}