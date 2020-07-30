import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE_NUMBER_REGEX = "^[(]+[0-9]+[)]+[-]+[(]+[0-9]{10}+[)]$";

    public ValidatePhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}