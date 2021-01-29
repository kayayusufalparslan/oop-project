package deneme_windowB.Oyuncular;

import java.util.ArrayList;

import deneme_windowB.Sporcular.basketbolcu;
import deneme_windowB.Sporcular.futbolcu;

public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
    private ArrayList<futbolcu> cardListF = new ArrayList<>();
    private ArrayList<basketbolcu> cardListB = new ArrayList<>();

    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }
    
    

    public Oyuncu() {
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor += skor;
    }

    public void  listeyeKartEkleF(futbolcu a ) {
        cardListF.add(a);
    }

    public void listedenCikartF(futbolcu a) {
        cardListF.remove(a);
    }

    public ArrayList<futbolcu> getCardListF() {
        return cardListF;
    }

    public void  listeyeKartEkleB(basketbolcu a ) {
        cardListB.add(a);
    }

    public void listedenCikartB(basketbolcu a) {
        cardListB.remove(a);
    }

    public ArrayList<basketbolcu> getCardListB() {
        return cardListB;
    }


    public ArrayList<futbolcu> kartListesiF() {
        return cardListF;
    }

    public ArrayList<basketbolcu> kartListesiB() {
        return cardListB;
    }


    public int skorGoster() {
        return getSkor();
    }

    public abstract basketbolcu kartSecB();

    public abstract futbolcu kartSecF();

}
