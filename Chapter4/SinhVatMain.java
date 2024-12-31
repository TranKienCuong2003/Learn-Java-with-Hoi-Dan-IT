package Chapter4;

class SinhVat {
    String ten;
    
    public void hienThi() {
        System.out.println("Ten sinh vat: " + ten);
    }
}

class SuTu extends SinhVat {
    String dacDiem;
    
    public SuTu(String ten, String dacDiem) {
        this.ten = ten;
        this.dacDiem = dacDiem;
    }
    
    public void diSanMoi() {
        System.out.println(ten + " di san moi.");
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Dac diem: " + dacDiem);
    }
}

class SinhVien extends SinhVat {
    String maSoSinhVien;
    String diaChi;
    String tenLopHoc;
    
    public SinhVien(String ten, String maSoSinhVien, String diaChi, String tenLopHoc) {
        this.ten = ten;
        this.maSoSinhVien = maSoSinhVien;
        this.diaChi = diaChi;
        this.tenLopHoc = tenLopHoc;
    }
    
    public void onTuChoQuaMon() {
        System.out.println(ten + " on tu cho qua mon.");
    }
    
    public void nguNuongQuaNgay() {
        System.out.println(ten + " ngu nuong qua ngay.");
    }
    
    public void xemYoutubeLayKienThuc() {
        System.out.println(ten + " xem youtube lay kien thuc qua mon.");
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Ma so sinh vien: " + maSoSinhVien);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Lop hoc: " + tenLopHoc);
    }
}

public class SinhVatMain {
    public static void main(String[] args) {
        SuTu suTu = new SuTu("Su Tu", "Co long, thuoc ho meo");
        suTu.hienThi();
        suTu.diSanMoi();
        
        System.out.println();
        
        SinhVien sinhVien = new SinhVien("Nguyen Van A", "SV12345", "Ha Noi", "Lop 10A");
        sinhVien.hienThi();
        sinhVien.onTuChoQuaMon();
        sinhVien.nguNuongQuaNgay();
        sinhVien.xemYoutubeLayKienThuc();
    }
}
