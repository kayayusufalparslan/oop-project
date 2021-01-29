package deneme_windowB.Oyuncular;


import deneme_windowB.Sporcular.basketbolcu;
import deneme_windowB.Sporcular.futbolcu;

public class Kullanici extends Oyuncu {

    public Kullanici() {
        super(0, "Kullanici", 0);
    }

    public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
    }

    @Override
    public basketbolcu kartSecB() {
        return super.kartListesiB().get(0);
    }

    public futbolcu kartSecF() {
        return super.kartListesiF().get(0);
    }


}
