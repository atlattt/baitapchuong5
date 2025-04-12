public class VNAddress implements AddressValidator {
    @Override
    public boolean validateStreet(String street) {
        return street != null && !street.trim().isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        return city != null && city.matches("[\\p{L} ]+"); // Chấp nhận tiếng Việt có dấu
    }

    @Override
    public boolean validateState(String state) {
        return state != null && state.matches("[\\p{L} ]+"); // Ví dụ: "Hồ Chí Minh", "Hà Nội"
    }

    @Override
    public boolean validateZipCode(String zipCode) {
        return zipCode != null && zipCode.matches("\\d{6}"); // VN thường dùng mã bưu chính 6 chữ số
    }

    @Override
    public boolean validateCountry(String country) {
        return "Vietnam".equalsIgnoreCase(country) || "Việt Nam".equalsIgnoreCase(country);
    }
}
