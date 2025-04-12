public class Employee {
    private String name;
    private int overtimeHours;
    private SalaryCalculator category;

    public Employee(String name, int overtimeHours, SalaryCalculator category) {
        this.name = name;
        this.overtimeHours = overtimeHours;
        this.category = category;
    }
    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public SalaryCalculator getCategory() {
        return category;
    }

    public void setCategory(SalaryCalculator category) {
        this.category = category;
    }

    public void display() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Số giờ tăng ca: " + overtimeHours);
        System.out.println("Lương: " + category.getSalary(overtimeHours));
        System.out.println("---------------------------");
    }
}
