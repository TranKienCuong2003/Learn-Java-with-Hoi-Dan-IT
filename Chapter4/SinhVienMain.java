package Chapter4;

class SinhVien {
    String ten;
    String maSoSinhVien;

    public void an() {
        System.out.println(ten + " dang an.");
    }
    
    public void ngu() {
        System.out.println(ten + " dang ngu.");
    }
    
    public void nghi() {
        System.out.println(ten + " dang nghi.");
    }
    
    public void onThi() {
        System.out.println(ten + " dang on thi.");
    }
    
    public void hienThi() {
        System.out.println("Ten: " + ten);
        System.out.println("Ma so sinh vien: " + maSoSinhVien);
    }
}

public class SinhVienMain {
    public static void main(String[] args) {
        SinhVien sinhVienA = new SinhVien();
        sinhVienA.ten = "A";
        sinhVienA.maSoSinhVien = "1234";
        
        SinhVien sinhVienB = new SinhVien();
        sinhVienB.ten = "B";
        sinhVienB.maSoSinhVien = "5678";
        
        System.out.println("Sinh vien A:");
        sinhVienA.hienThi();
        sinhVienA.an();
        sinhVienA.ngu();
        sinhVienA.nghi();
        sinhVienA.onThi();
        
        System.out.println();
        
        System.out.println("Sinh vien B:");
        sinhVienB.hienThi();
        sinhVienB.an();
        sinhVienB.ngu();
        sinhVienB.nghi();
        sinhVienB.onThi();
    }
}

