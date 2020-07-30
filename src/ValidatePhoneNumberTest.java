public class ValidatePhoneNumberTest {
    private static ValidatePhone validatePhone;
    public static final String[] validAccount = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidAccount = new String[]{"(a8)-(22222222)", "P0323A", "1234_", "M0318G"};

    public static void main(String args[]) {
        validatePhone = new ValidatePhone();
        for (String account : validAccount) {
            boolean isvalid = validatePhone.validate(account);
            System.out.println("Class name is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = validatePhone.validate(account);
            System.out.println("Class name is " + account + " is valid: " + isvalid);
        }
    }
}