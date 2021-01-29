package deneme_windowB.Oyuncular;
import java.util.Random;

import deneme_windowB.Sporcular.basketbolcu;
import deneme_windowB.Sporcular.futbolcu;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar() {
        super(1, "Bilgisayar", 0);
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
    }

    @Override
    public basketbolcu kartSecB() {
        Random r=new Random(); //random sınıfı
        int a=r.nextInt(super.kartListesiB().size());
        while(super.kartListesiB().get(a).isKartKullanildiMi() == true)
        {
            a=r.nextInt(super.kartListesiB().size());
        }

        return super.kartListesiB().get(a);
    }


    @Override
    public futbolcu kartSecF() {
        Random r=new Random(); //random sınıfı
        int a=r.nextInt(super.kartListesiF().size());
        while(super.kartListesiF().get(a).isKartKullanildiMi() == true)
        {
            a=r.nextInt(super.kartListesiF().size());
        }

        return super.kartListesiF().get(a);
    }
}
