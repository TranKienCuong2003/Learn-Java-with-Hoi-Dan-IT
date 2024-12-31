package Chapter10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
    public static void main(String[] args) {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            System.out.println("Current directory: " + System.getProperty("user.dir"));

            inputStream = new FileReader("C:/Workplace/Java/Learn-Java-with-Hoi-Dan IT/TaiLieuKhoaHoc.txt");
            outputStream = new FileWriter("C:/Workplace/Java/Learn-Java-with-Hoi-Dan IT/characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                System.out.print((char) c);
            }
            System.out.println("\nFile da duoc ghi thanh cong!");

        } catch (IOException e) {
            System.out.println("Loi xay ra khi doc/ghi file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Loi khi dong file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
