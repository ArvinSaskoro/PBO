public class sparePart extends dataMobil {
    private String part;

    public sparePart(String merkMobil, String namaMobil, int thnDibuat, String part) {
        super(merkMobil, namaMobil, thnDibuat);
        this.part = part;
    }

    public String getPart(){
        return this.part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
