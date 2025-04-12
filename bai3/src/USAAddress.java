public class USAAddress implements AddressValidator{
    @Override
    public boolean validateStreet(String street) {
        return street != null && !street.trim().isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        return city != null && city.matches("[a-zA-Z ]+");
    }

    @Override
    public boolean validateState(String state) {
        return state != null && state.matches("[A-Z]{2}"); // Ví dụ: CA, NY, TX
    }

    @Override
    public boolean validateZipCode(String zipCode) {
        return zipCode != null && zipCode.matches("\\d{5}(-\\d{4})?"); // 12345 hoặc 12345-6789
    }

    @Override
    public boolean validateCountry(String country) {
        return "USA".equalsIgnoreCase(country) || "United States".equalsIgnoreCase(country);
    }
}
