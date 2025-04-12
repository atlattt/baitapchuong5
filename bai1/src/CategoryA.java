public class CategoryA implements SalaryCalculator{
    @Override
    public int getSalary(int overtimeHours) {
        return 2000 + 15 * overtimeHours;
    }
}
