import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text){
        String num = "25[0-5]|2[0-4][0-9]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
        String valid = String.format("((%s)(\\.)){3}(%s)", num, num);
        String result = "";

        Pattern pattern = Pattern.compile(valid);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            result = matcher.group();
        }
        return result;
    }
}


