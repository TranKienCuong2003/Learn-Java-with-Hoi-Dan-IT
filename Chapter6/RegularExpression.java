package Chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        String[] emails = {"trankiencuong30072003@gmail.com", "kiencuong-email.com", "tkc@domain.org", "hello@world@domain.com"};

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " la email hop le.");
            } else {
                System.out.println(email + " khong phai la email hop le.");
            }
        }
    }
}
