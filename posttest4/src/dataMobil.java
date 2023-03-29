class dataMobil {
    private String merkMobil;
    private String namaMobil;
    private int thnDibuat;
    private String jenis;
    public void display() {
        System.out.println("Merk Mobil:"+this.merkMobil);
        System.out.println("Nama Mobil:"+this.namaMobil);
        System.out.println("Tahun Dibuat:"+this.thnDibuat);
    }
    public void display(String type) {
        System.out.println("Jenis Mobil:"+type);}

    //getter
    public String getMerkMobil() {
        return this.merkMobil;
    }
    public String getNamaMobil() {
        return this.namaMobil;
    }
    public int getThnDibuat() {
        return this.thnDibuat;
    }
    public String getJenis() {
        return jenis;
    }

    //setter
    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }
    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }
    public void setThnDibuat(int thnDibuat) {
        this.thnDibuat = thnDibuat;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public dataMobil(String merkMobil, String namaMobil, int thnDibuat, String jenis1) {
        this.merkMobil = merkMobil;
        this.namaMobil = namaMobil;
        this.thnDibuat = thnDibuat;
        this.jenis=jenis1;
    }
}
