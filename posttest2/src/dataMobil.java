class dataMobil {
    private String merkMobil;
    private String namaMobil;
    private int thnDibuat;

    void display(){
        System.out.println(this.merkMobil);
        System.out.println(this.namaMobil);
        System.out.println(this.thnDibuat);
    }

    //getter
    public String getmerkMobil() {
        return this.merkMobil;
    }
    public String getnamaMobil() {
        return this.namaMobil;
    }
    public int getThnDibuat() {
        return this.thnDibuat;
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

    public dataMobil(String merkMobil, String namaMobil, int thnDibuat){
        this.merkMobil = merkMobil;
        this.namaMobil = namaMobil;
        this.thnDibuat = thnDibuat;
    }
}
