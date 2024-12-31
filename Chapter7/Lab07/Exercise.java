package Chapter7.Lab07;

abstract class SinhVien {
    public abstract double getDiem();
}

class SinhVienIT extends SinhVien {
    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    public double getDiem() {
        return (scoreJava * 2 + scoreHTML) / 3;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }
}

class SinhVienCoKhi extends SinhVien {
    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi(double scoreCNC, double scorePLC) {
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    public double getDiem() {
        return (scoreCNC + scorePLC) / 2;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }
}

public class Exercise {
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT(8.5, 7.0);
        System.out.println("Diem sinh vien IT: " + svIT.getDiem());

        SinhVienCoKhi svCK = new SinhVienCoKhi(8.0, 6.5);
        System.out.println("Diem sinh vien Co kho: " + svCK.getDiem());
    }
}
