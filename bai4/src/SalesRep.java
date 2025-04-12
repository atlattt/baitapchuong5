public class SalesRep extends Employee{
    private double baseSalary;
    private double commission;

    public SalesRep(String name, String id, double baseSalary, double commission) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.commission = commission;
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
    public double calculateMonthlyIncome() {
        return baseSalary + commission;
    }
}
