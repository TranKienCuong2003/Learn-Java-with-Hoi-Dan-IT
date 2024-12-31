package Chapter9.Lab09;

import java.util.Scanner;

class SinhVien {
    private String masv;
    private String hoten;
    private double diem;
    private int age;

    public SinhVien(String masv, String hoten, double diem, int age) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + masv + "\nHo ten: " + hoten + "\nDiem: " + diem + "\nTuoi: " + age;
    }

    public static SinhVien inputSinhVien() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap ma sinh vien: ");
            String masv = scanner.nextLine();

            System.out.print("Nhap ho ten sinh vien: ");
            String hoten = scanner.nextLine();
            
            
            double diem = -1;
            while (diem <= 0 || diem >= 10) {
                try {
                    System.out.print("Nhap diem (0 < diem < 10): ");
                    diem = scanner.nextDouble();
                    if (diem <= 0 || diem >= 10) {
                        System.out.println("Diem phai nam trong khoang tu 0 den 10!");
                    }
                } catch (Exception e) {
                    System.out.println("Loi: Diem phai la mot so thuc.");
                    scanner.nextLine();
                }
            }

            int age = -1;
            while (age <= 18 || age >= 100) {
                try {
                    System.out.print("Nhap tuoi (18 < tuoi < 100): ");
                    age = scanner.nextInt();
                    if (age <= 18 || age >= 100) {
                        System.out.println("Tuoi phai nam trong khoang tu 18 den 100!");
                    }
                } catch (Exception e) {
                    System.out.println("Loi: Tuoi phai la mot so nguyen.");
                    scanner.nextLine();
                }
            }

            return new SinhVien(masv, hoten, diem, age);
        }
    }
}

public class Exercise {
    public static void main(String[] args) {
        SinhVien sinhVien = SinhVien.inputSinhVien();
        System.out.println("\nThong tin sinh vien:");
        System.out.println(sinhVien.toString());
    }
}
