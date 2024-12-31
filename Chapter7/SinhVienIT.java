package Chapter7;

class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String id, String name, double price, double tax, String language) {
        super(id, name, price, tax);
        this.language = language;
    }

    @Override
    public double getPriceTax() {
        return getPrice() * getTax();
    }

    public String getLanguage() {
        return language;
    }
}

