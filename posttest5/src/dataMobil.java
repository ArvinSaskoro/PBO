public abstract class dataMobil {
    protected String merkMobil;
    protected String namaMobil;
    protected int thnDibuat;
    protected String jenis;

    public dataMobil() {
    }

    public void display() {
        System.out.println("Merk Mobil : "+this.merkMobil);
        System.out.println("Nama Mobil : "+this.namaMobil);
        System.out.println("Tahun Dibuat : "+this.thnDibuat);
    }
    public void display(String type) {
        System.out.println("Jenis Mobil : "+type);}

    //getter
    public abstract String getMerkMobil();
    public abstract String getNamaMobil();
    public abstract int getThnDibuat();
    public abstract String getJenis();

    //setter
    public abstract void setMerkMobil(String merkMobil);
    public abstract void setNamaMobil(String namaMobil);
    public abstract void setThnDibuat(int thnDibuat);
    public abstract void setJenis(String jenis);
    protected abstract void dataMobil();
,
    public dataMobil(String merkMobil, String namaMobil, int thnDibuat, String jenis) {
        this.merkMobil = merkMobil;
        this.namaMobil = namaMobil;
        this.thnDibuat = thnDibuat;
        this.jenis=jenis;
    }
}
