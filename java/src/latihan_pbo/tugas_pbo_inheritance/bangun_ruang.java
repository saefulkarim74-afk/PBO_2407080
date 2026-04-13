package latihan_pbo.tugas_pbo_inheritance;

class BangunRuang extends bangun_datar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // tetap pakai perhitungan parent
        return super.hitungLuas();
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}