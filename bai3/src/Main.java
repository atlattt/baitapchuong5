public class Main {
    public static void main(String[] args) {
        AddressValidator usValidator = new USAAddress();
        System.out.println(usValidator.validateZipCode("90210")); // true
        System.out.println(usValidator.validateState("CA")); // true

        AddressValidator vnValidator = new VNAddress();
        System.out.println(vnValidator.validateCity("Hà Nội")); // true
        System.out.println(vnValidator.validateZipCode("700000")); // true
    }
    }