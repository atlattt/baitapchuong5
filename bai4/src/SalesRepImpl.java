public class SalesRepImpl implements EmployeeInterface{
    private String name;
    private String id;
    private double baseSalary;
    private double commission;

    public SalesRepImpl(String name, String id, double baseSalary, double commission) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    public SalesRepImpl() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("ID: " + id);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double calculateMonthlyIncome() {
        return baseSalary + commission;
    }
}
