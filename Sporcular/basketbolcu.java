package deneme_windowB.Sporcular;

public class basketbolcu extends sporcu{

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kartKullanildiMi;
    private String image;

    public basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ucluk, int serbestAtis, String image) {
        super(sporcuIsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
        this.image = image;
    }

    public basketbolcu() {
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public void sporcuPuaniGoster() {
        System.out.println( "Serbest Atış Puanı: " + getSerbestAtis() );
        System.out.println( "İkilik Puanı: " + getIkilik() );
        System.out.println( "Üçlük Atış: " + getUcluk() );
    }

}
