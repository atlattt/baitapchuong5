public class CategoryB implements SalaryCalculator{
    @Override
    public int getSalary(int overtimeHours) {
        return 1500 + 10 * overtimeHours;
    }
}
