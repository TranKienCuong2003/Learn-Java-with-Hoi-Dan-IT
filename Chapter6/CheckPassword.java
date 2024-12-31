package Chapter6;

public class CheckPassword {
    public static void main(String[] args) {
        System.out.println(isValidPassword("123456"));
        System.out.println(isValidPassword("12345"));
    }

    public static String isValidPassword(String password) {
        if (password.length() >= 6) {
            return password + " la mat khau hop le";
        }
        return password + " la mat khau khong hop le";
    }
}
