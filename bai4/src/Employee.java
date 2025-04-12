public abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Phương thức chung cho tất cả nhân viên
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("ID: " + id);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Phương thức trừu tượng để tính thu nhập hàng tháng
    public abstract double calculateMonthlyIncome();
}
