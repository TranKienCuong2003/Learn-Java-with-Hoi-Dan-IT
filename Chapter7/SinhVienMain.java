package Chapter7;

class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    public double getPriceTax() {
        return price * tax;
    }
}

class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT() {
        this.id = "IT01";
        this.name = "Nguyen Van A";
        this.price = 1000;
        this.tax = 0.1;
        this.language = "Java";
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

class SinhVienCoKhi extends SinhVien {
    private String skill;

    public SinhVienCoKhi() {
        this.id = "CK01";
        this.name = "Nguyen Van B";
        this.price = 1200;
        this.tax = 0.12;
        this.skill = "Ky nang co khi";
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

public class SinhVienMain {
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT();
        System.out.println("Sinh vien IT:");
        System.out.println("ID: " + svIT.id);
        System.out.println("Ten: " + svIT.name);
        System.out.println("Ngon ngu: " + svIT.getLanguage());
        System.out.println("Hoc phi: " + svIT.price);
        System.out.println("Thue: " + svIT.tax);
        System.out.println("Hoc phi sau thue: " + svIT.getPriceTax());
        System.out.println();

        SinhVienCoKhi svCK = new SinhVienCoKhi();
        System.out.println("Sinh vien Co Khi:");
        System.out.println("ID: " + svCK.id);
        System.out.println("Ten: " + svCK.name);
        System.out.println("Ky nang: " + svCK.getSkill());
        System.out.println("Hoc phi: " + svCK.price);
        System.out.println("Thue: " + svCK.tax);
        System.out.println("Hoc phi sau thue: " + svCK.getPriceTax());
    }
}
