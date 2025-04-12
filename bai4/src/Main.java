public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng SalesRep
        Employee salesRep = new SalesRep("Nguyễn Văn A", "SR01", 5000000, 2000000);

        // Tạo đối tượng Consultant
        Employee consultant = new Consultant("Trần Thị B", "CT02", 200000, 100);

        // Hiển thị thông tin và tính thu nhập
        System.out.println("== Nhân viên bán hàng ==");
        salesRep.displayInfo();
        System.out.println("Thu nhập hàng tháng: " + salesRep.calculateMonthlyIncome() + " VND");

        System.out.println("\n== Nhân viên tư vấn ==");
        consultant.displayInfo();
        System.out.println("Thu nhập hàng tháng: " + consultant.calculateMonthlyIncome() + " VND");

    }
}