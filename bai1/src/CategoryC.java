public class CategoryC implements SalaryCalculator{
    @Override
    public int getSalary(int overtimeHours) {
        return 800 + 5 * overtimeHours;
    }
}
