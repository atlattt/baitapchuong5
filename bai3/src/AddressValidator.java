public interface AddressValidator {
    boolean validateStreet(String street);
    boolean validateCity(String city);
    boolean validateState(String state);
    boolean validateZipCode(String zipCode);
    boolean validateCountry(String country);
}
