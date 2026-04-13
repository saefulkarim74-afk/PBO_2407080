package latihan_pbo.latihan1;

public class PersegiPanjang extends BangunDatar {
    
    public double hitungLuas() {
        return getPanjang() * getLebar();
    }

    public double hitungKeliling() {
        return 2 * (getPanjang() + getLebar());
    }
    
}