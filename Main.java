/*
 * Yusuf Alparslan Kaya
 * 190202102
 */
package deneme_windowB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

import deneme_windowB.Oyuncular.Bilgisayar;
import deneme_windowB.Oyuncular.Kullanici;
import deneme_windowB.Sporcular.basketbolcu;
import deneme_windowB.Sporcular.futbolcu;

public class Main {
    
	
	static Kullanici kullanici = new Kullanici();
    static Bilgisayar bilgisayar = new Bilgisayar();

    private static ArrayList<futbolcu> futbolcuList = new ArrayList<futbolcu>(); //Futbolcu Listesi TanÄ±mlÄ±yoruz.
    private static ArrayList<basketbolcu> basketbolcuList = new ArrayList<>(); //Basketbolcu Listesi TanÄ±mlÄ±yoruz.
    static ArrayList<futbolcu> futbolcuListK = new ArrayList<>(); //KullanÄ±cÄ± futbolcu kartlarÄ±
    static ArrayList<basketbolcu> basketbolcuListK = new ArrayList<>(); //KullanÄ±cÄ± basketbolcu kartlarÄ±
    static ArrayList<futbolcu> futbolcuListB = new ArrayList<>(); //Bilgisayar futbolcu kartlarÄ±
    static ArrayList<basketbolcu> basketbolcuListB = new ArrayList<>(); //Bilgisayar basketbolcu kartlarÄ±

    public static void oyuncular() {

    }

    public static void cards() {
        //FutbolcularÄ± tanÄ±mlÄ±yoruz.
        futbolcu messi = new futbolcu("Messi", "Barcelona", 96, 97, 100, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\messi.jpg");
        futbolcu alex = new futbolcu("Alex", "FenerbahÃ§e", 90, 85, 78, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\alex.jpg");
        futbolcu ibrahimovic = new futbolcu("Ibrahimovic", "Barcelona", 95, 92, 92, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ibrahimovic.jpg");
        futbolcu ramos = new futbolcu("Ramos", "Real Madrid", 90, 85, 75, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ramos.jpg");
        futbolcu ronaldinho = new futbolcu("Ronaldinho", "Barcelona", 95, 90, 100, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ronaldinho.jpg");
        futbolcu ronaldo = new futbolcu("Ronaldo", "Juventus", 100, 97, 100, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ronaldo.jpg");
        futbolcu tuncay = new futbolcu("Tuncay", "Fenerbahce", 90, 85, 77, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\tuncay.jpg");
        futbolcu volkan = new futbolcu("Volkan", "FenerbahÃ§e", 80, 80, 75, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\volkan.jpg");
        //FutbolcularÄ± listeye ekliyoruz.
        futbolcuList.add(alex);
        futbolcuList.add(ibrahimovic);
        futbolcuList.add(messi);
        futbolcuList.add(ramos);
        futbolcuList.add(ronaldinho);
        futbolcuList.add(ronaldo);
        futbolcuList.add(tuncay);
        futbolcuList.add(volkan);
        //KartlarÄ± karÄ±ÅŸtÄ±rÄ±yoruz.
        Collections.shuffle(futbolcuList);
        /*----------------------------------------------------------------------------------------------------------------------------------------------*/
        //BasketbolcularÄ± tanÄ±mlÄ±yoruz.
        basketbolcu bogdanovic = new basketbolcu("Bogdanovic", "FenerbahÃ§e", 90, 88, 79, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\bogdan.jpg");
        basketbolcu curry = new basketbolcu("Curry", "Golden State Warriors", 88, 90, 82, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\curry.jpg");
        basketbolcu hidayet = new basketbolcu("Hidayet", "Sacramento Kings", 92, 88, 93, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\hidayet.jpg");
        basketbolcu iverson = new basketbolcu("Iverson", "BeÅŸiktaÅŸ", 84, 88, 83, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\iverson.jpeg");
        basketbolcu jordan = new basketbolcu("Jordan", "Bulls", 93, 92, 91, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\jordan.jpg");
        basketbolcu lebron = new basketbolcu("Lebron", "Lakers", 90, 92, 97, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\lebron.jpg");
        basketbolcu mehmet = new basketbolcu("Mehmet", "Jazz", 90, 88, 75, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\mehmet.png");
        basketbolcu parker = new basketbolcu("Parker", "San Antonio Spurs", 87, 90, 78, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\parker.jpg");
        //BasketbolcularÄ± listeye ekliyoruz.
        basketbolcuList.add(bogdanovic);
        basketbolcuList.add(curry);
        basketbolcuList.add(hidayet);
        basketbolcuList.add(iverson);
        basketbolcuList.add(jordan);
        basketbolcuList.add(lebron);
        basketbolcuList.add(mehmet);
        basketbolcuList.add(parker);
        //KartlarÄ± karÄ±ÅŸtÄ±rÄ±yoruz.
        Collections.shuffle(basketbolcuList);
    }

    public static void kartlariDagit(Kullanici a, Bilgisayar b) {
        for(int i = 0 ; i < 4 ; i++ ) {
            futbolcuListK.add(futbolcuList.get(i));
            System.out.println(futbolcuListK.get(i).getSporcuIsim());
            a.listeyeKartEkleF(futbolcuList.get(i));
            System.out.println(a.getCardListF().get(i).getSporcuIsim());
            
        }
        //KullanÄ±cÄ± iÃ§in basketbol kartlarÄ±
        for(int i = 0 ; i < 4 ; i++ ) {
            basketbolcuListK.add(basketbolcuList.get(i));
            System.out.println(basketbolcuListK.get(i).getSporcuIsim());
            a.listeyeKartEkleB(basketbolcuList.get(i));
            System.out.println(a.getCardListB().get(i).getSporcuIsim());
        }

        for(int i=4 ; i < 8 ; i++ ) {
            futbolcuListB.add(futbolcuList.get(i));
            System.out.println(futbolcuListB.get(i-4).getSporcuIsim());
            b.listeyeKartEkleF(futbolcuList.get(i));
            System.out.println(b.getCardListF().get(i-4).getSporcuIsim());
        }
        //Bilgisayar iÃ§in basketbol kartlarÄ±
        for(int i= 4; i < 8 ; i++ ) {
            basketbolcuListB.add(basketbolcuList.get(i));
            System.out.println(basketbolcuListB.get(i-4).getSporcuIsim());
            b.listeyeKartEkleB(basketbolcuList.get(i));
            System.out.println(b.getCardListB().get(i-4).getSporcuIsim());
        }
    }
    

    
    
    
    public static void winnerBasketbolcu(Kullanici a, Bilgisayar b, int secilenOyuncuKullanici, int secilenOyuncuBilgisayar) {
    	Random r = new Random(3);
        int n = r.nextInt(3);
        int kullaniciPuan = 0;
        int bilgisayarPuan= 0;
        System.out.println( "Seçilen Özellik: " + n);
        if(n==0){
            System.out.println("Ýkilik Puaný: ");
             kullaniciPuan = a.kartListesiB().get(secilenOyuncuKullanici).getIkilik();
             bilgisayarPuan = b.kartListesiB().get(secilenOyuncuBilgisayar).getIkilik();
             System.out.println("Kullanici Özellik Puani: "+ kullaniciPuan );
             System.out.println("Bilgisayar Özellik Puani: "+ bilgisayarPuan);
             
             if(kullaniciPuan > bilgisayarPuan) {
             	a.setSkor(10);
             	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Ýkilik Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() + " Ýkilik Puaný: " + bilgisayarPuan );
             }else if(kullaniciPuan < bilgisayarPuan){        	
             	b.setSkor(10);        	
             	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Ýkilik Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() + " Ýkilik Puaný: " + bilgisayarPuan);
             }else if(kullaniciPuan == bilgisayarPuan) {
             	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "Özellikler tekrar karþýlaþtýrýlýyor...");
             	winnerBasketbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
             }    
             
        }else if(n==1){
            System.out.println("Üçlük Puaný: ");
            kullaniciPuan = a.kartListesiB().get(secilenOyuncuKullanici).getUcluk();
            bilgisayarPuan = b.kartListesiB().get(secilenOyuncuBilgisayar).getUcluk();
            System.out.println("Kullanici Özellik Puani: "+ kullaniciPuan );
            System.out.println("Bilgisayar Özellik Puani: "+ bilgisayarPuan);
            
            if(kullaniciPuan > bilgisayarPuan) {
            	a.setSkor(10);
            	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Üçlük Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Üçlük Puaný: " + bilgisayarPuan );
            }else if(kullaniciPuan < bilgisayarPuan){        	
            	b.setSkor(10);        	
            	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Üçlük Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Üçlük Puaný: " + bilgisayarPuan );
            }else if(kullaniciPuan == bilgisayarPuan) {
            	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "Özellikler tekrar karþýlaþtýrýlýyor...");
            	winnerBasketbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
            }  
            
        }else if(n==2){
            System.out.println("Serbest Atýþ Puaný: ");
            kullaniciPuan = a.kartListesiB().get(secilenOyuncuKullanici).getSerbestAtis();
            bilgisayarPuan = b.kartListesiB().get(secilenOyuncuBilgisayar).getSerbestAtis();
            
            if(kullaniciPuan > bilgisayarPuan) {
            	a.setSkor(10);    	
            	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest Atýþ Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest Atýþ Puaný: " + bilgisayarPuan );            	
            }else if(kullaniciPuan < bilgisayarPuan){        	
            	b.setSkor(10);        	
            	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest Atýþ Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest Atýþ Puaný: " + bilgisayarPuan );            }else if(kullaniciPuan == bilgisayarPuan) {
            }else if(kullaniciPuan == bilgisayarPuan) {
            	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "Özellikler tekrar karþýlaþtýrýlýyor...");
                winnerBasketbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
           }   
        }
           
    }
    

    public static void winnerFutbolcu(Kullanici a, Bilgisayar b, int secilenOyuncuKullanici, int secilenOyuncuBilgisayar){
    	Random r = new Random();
        int n = r.nextInt(3);
        int kullaniciPuan = 0;
        int bilgisayarPuan= 0;
        System.out.println( "Seçilen Özellik: " + n);
        if(n==0){
            System.out.println("Kaleci Ýle Karþý KArþýya Puaný: ");
             kullaniciPuan = a.kartListesiF().get(secilenOyuncuKullanici).getKaleciKarsiKarsiya();
             bilgisayarPuan = b.kartListesiF().get(secilenOyuncuBilgisayar).getKaleciKarsiKarsiya();
             System.out.println("Kullanici Özellik Puani: "+ kullaniciPuan );
             System.out.println("Bilgisayar Özellik Puani: "+ bilgisayarPuan);
             if(kullaniciPuan > bilgisayarPuan) {
             	a.setSkor(10);    	
             	 JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Kaleci ile Karþý Karþýya Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Kaleci ile Karþý Karþýya Puaný: " + bilgisayarPuan );
             	
             }else if(kullaniciPuan < bilgisayarPuan){        	
             	b.setSkor(10);        	
             	 JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Kaleci ile Karþý Karþýya Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Kaleci ile Karþý Karþýya Puaný: " + bilgisayarPuan );
             }else if(kullaniciPuan == bilgisayarPuan) {
             	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "Özellikler tekrar karþýlaþtýrýlýyor...");
            	winnerFutbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
            } 
        }else if(n==1){
            System.out.println("Penaltý Puaný: ");
            kullaniciPuan = a.kartListesiF().get(secilenOyuncuKullanici).getPenalti();
            bilgisayarPuan = b.kartListesiF().get(secilenOyuncuBilgisayar).getPenalti();
            System.out.println("Kullanici Özellik Puani: "+ kullaniciPuan );
            System.out.println("Bilgisayar Özellik Puani: "+ bilgisayarPuan);
            if(kullaniciPuan > bilgisayarPuan) {
             	a.setSkor(10);    	
             	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Penaltý Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Penaltý Puaný: " + bilgisayarPuan );
             	
             }else if(kullaniciPuan < bilgisayarPuan){        	
             	b.setSkor(10);        	
             	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Penaltý Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Penaltý Puaný: " + bilgisayarPuan );
             }else if(kullaniciPuan == bilgisayarPuan) {
             	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "Özellikler tekrar karþýlaþtýrýlýyor...");
            	winnerFutbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
            } 
      
        }else if(n==2){
            System.out.println("Serbest Atýþ Puaný: ");
            kullaniciPuan = a.kartListesiF().get(secilenOyuncuKullanici).getSerbestAtis();
            bilgisayarPuan = b.kartListesiF().get(secilenOyuncuBilgisayar).getSerbestAtis();
            if(kullaniciPuan > bilgisayarPuan) {
            	a.setSkor(10);    	
            	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest Atýþ Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest Atýþ Puaný: " + bilgisayarPuan );            	
            }else if(kullaniciPuan < bilgisayarPuan){        	
            	b.setSkor(10);        	
            	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest Atýþ Puaný: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest Atýþ Puaný: " + bilgisayarPuan );            }else if(kullaniciPuan == bilgisayarPuan) {
            	}else if(kullaniciPuan == bilgisayarPuan) {
                 	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "Özellikler tekrar karþýlaþtýrýlýyor...");
                   	winnerFutbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
                    }              
        }     
    }


    public static void main(String[] args) {
        cards();
        kartlariDagit(kullanici, bilgisayar);  
    	Gui.main(args);
    }
}
