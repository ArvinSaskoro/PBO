public class spesifikasiMobil extends dataMobil {
    private String posisiDriver; // kanan atau kiri
    private String tipeBBM; // jenis bahan bakar

    public spesifikasiMobil(String merkMobil, String namaMobil, int thnDibuat, String posisiDriver, String tipeBBM) {
        super(merkMobil, namaMobil, thnDibuat);
        this.posisiDriver = posisiDriver;
        this.tipeBBM = tipeBBM;
    }

    public void tambahMobil() {
        System.out.println("Posisi Driver : " + this.posisiDriver);
        System.out.println("Tipe BBM      : " + this.tipeBBM);
        System.out.println("\nSpesifikasi Mobil Berhasil Ditambahkan\n");
    }

    public void ubahMobil() {
        System.out.println("Posisi Driver : " + this.posisiDriver);
        System.out.println("Tipe BBM      : " + this.tipeBBM);
        System.out.println("\nSpesifikasi Mobil Berhasil Diubah\n");
    }

    public void hapusMobil() {
        System.out.println("Posisi Driver : " + this.posisiDriver);
        System.out.println("Tipe BBM      : " + this.tipeBBM);
        System.out.println("\nSpesifikasi Mobil Berhasil Dihapus\n");
    }

    // getter
    public String getPosisiDriver() {
        return posisiDriver;
    }
    public String getTipeBBM() {
        return tipeBBM;
    }

    // setter
    public void setPosisiDriver(String posisiDriver) {
        this.posisiDriver = posisiDriver;
    }
    public void setTipeBBM(String tipeBBM) {
        this.posisiDriver = tipeBBM;
    }

}
