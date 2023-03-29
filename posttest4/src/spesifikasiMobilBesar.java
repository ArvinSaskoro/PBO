public class spesifikasiMobilBesar extends dataMobil {
    private String posisiDriver; // kanan atau kiri
    private String tipeBBM; // jenis bahan bakar
    public spesifikasiMobilBesar(String merkMobil, String namaMobil, int thnDibuat, String posisiDriver, String tipeBBM) {
        super(merkMobil, namaMobil, thnDibuat,"Besar");
        this.posisiDriver = posisiDriver;
        this.tipeBBM = tipeBBM;
    }
    public void display() {
        super.display();
        System.out.println("Posisi Driver:"+this.posisiDriver);
        System.out.println("Tipe BBM:"+this.tipeBBM);
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
