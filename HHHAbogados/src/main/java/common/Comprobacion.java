package common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprobacion {

    public static void EmailOk(String email) throws EmailException {
        String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new EmailException();
        }
    }

}
