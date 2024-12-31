package Chapter6;

public class CheckEmail {
    public static void main(String[] args) {
        System.out.println(isValidEmail("eric@hoidanit.com.vn"));
        System.out.println(isValidEmail("abc#blabla"));
    }

    public static String isValidEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return email + " la email hop le";
        }
        return email + " la email khong hop le";
    }
}
