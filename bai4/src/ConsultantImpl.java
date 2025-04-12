public class ConsultantImpl implements EmployeeInterface{
    private String name;
    private String id;
    private double hourlyRate;
    private int hoursWorked;

    public ConsultantImpl(String name, String id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public ConsultantImpl() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
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
        return hourlyRate * hoursWorked;
    }
}
