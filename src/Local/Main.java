package Local;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("ru", "RU");
        printInfo("en", "EN");

    }

    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("topic", current);
        for (String key : rb.keySet()) {
            String value = rb.getString((key));
            //value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
    }
}
