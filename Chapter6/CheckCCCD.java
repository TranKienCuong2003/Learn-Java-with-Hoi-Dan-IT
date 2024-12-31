package Chapter6;

public class CheckCCCD {
    public static void main(String[] args) {
        System.out.println(isValidCCCD("099145697413"));
        System.out.println(isValidCCCD("09914569741a"));
    }

    public static String isValidCCCD(String cccd) {
        if (cccd.length() != 12 || !cccd.matches("\\d{12}")) {
            return cccd + " la so CCCD khong hop le";
        }
        return cccd + " la so CCCD hop le";
    }
}
