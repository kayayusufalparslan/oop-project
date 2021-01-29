package deneme_windowB.Sporcular;

public class futbolcu extends sporcu {
    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    private boolean kartKullanildiMi;
    private String image;

    public futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya, String image) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
        this.image = image;
    }


    public futbolcu() {
    }

    @Override
    public String getSporcuIsim() {
        return super.getSporcuIsim();
    }

    @Override
    public String getSporcuTakim() {
        return super.getSporcuTakim();
    }

    @Override
    public void setSporcuIsim(String sporcuIsim) {
        super.setSporcuIsim(sporcuIsim);
    }

    @Override
    public void setSporcuTakim(String sporcuTakim) {
        super.setSporcuTakim(sporcuTakim);
    }


    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
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
        System.out.println( "Kaleci ile Karşı Karşıya Puanı: " + getKaleciKarsiKarsiya());
        System.out.println( "Penaltı Puanı: " + getPenalti());
        System.out.println( "Serbest Atış: " + getSerbestAtis());
    }
}
