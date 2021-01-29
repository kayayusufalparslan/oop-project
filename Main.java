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

    private static ArrayList<futbolcu> futbolcuList = new ArrayList<futbolcu>(); //Futbolcu Listesi Tanımlıyoruz.
    private static ArrayList<basketbolcu> basketbolcuList = new ArrayList<>(); //Basketbolcu Listesi Tanımlıyoruz.
    static ArrayList<futbolcu> futbolcuListK = new ArrayList<>(); //Kullanıcı futbolcu kartları
    static ArrayList<basketbolcu> basketbolcuListK = new ArrayList<>(); //Kullanıcı basketbolcu kartları
    static ArrayList<futbolcu> futbolcuListB = new ArrayList<>(); //Bilgisayar futbolcu kartları
    static ArrayList<basketbolcu> basketbolcuListB = new ArrayList<>(); //Bilgisayar basketbolcu kartları

    public static void oyuncular() {

    }

    public static void cards() {
        //Futbolcuları tanımlıyoruz.
        futbolcu messi = new futbolcu("Messi", "Barcelona", 96, 97, 100, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\messi.jpg");
        futbolcu alex = new futbolcu("Alex", "Fenerbahçe", 90, 85, 78, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\alex.jpg");
        futbolcu ibrahimovic = new futbolcu("Ibrahimovic", "Barcelona", 95, 92, 92, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ibrahimovic.jpg");
        futbolcu ramos = new futbolcu("Ramos", "Real Madrid", 90, 85, 75, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ramos.jpg");
        futbolcu ronaldinho = new futbolcu("Ronaldinho", "Barcelona", 95, 90, 100, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ronaldinho.jpg");
        futbolcu ronaldo = new futbolcu("Ronaldo", "Juventus", 100, 97, 100, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\ronaldo.jpg");
        futbolcu tuncay = new futbolcu("Tuncay", "Fenerbahce", 90, 85, 77, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\tuncay.jpg");
        futbolcu volkan = new futbolcu("Volkan", "Fenerbahçe", 80, 80, 75, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\volkan.jpg");
        //Futbolcuları listeye ekliyoruz.
        futbolcuList.add(alex);
        futbolcuList.add(ibrahimovic);
        futbolcuList.add(messi);
        futbolcuList.add(ramos);
        futbolcuList.add(ronaldinho);
        futbolcuList.add(ronaldo);
        futbolcuList.add(tuncay);
        futbolcuList.add(volkan);
        //Kartları karıştırıyoruz.
        Collections.shuffle(futbolcuList);
        /*----------------------------------------------------------------------------------------------------------------------------------------------*/
        //Basketbolcuları tanımlıyoruz.
        basketbolcu bogdanovic = new basketbolcu("Bogdanovic", "Fenerbahçe", 90, 88, 79, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\bogdan.jpg");
        basketbolcu curry = new basketbolcu("Curry", "Golden State Warriors", 88, 90, 82, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\curry.jpg");
        basketbolcu hidayet = new basketbolcu("Hidayet", "Sacramento Kings", 92, 88, 93, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\hidayet.jpg");
        basketbolcu iverson = new basketbolcu("Iverson", "Beşiktaş", 84, 88, 83, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\iverson.jpeg");
        basketbolcu jordan = new basketbolcu("Jordan", "Bulls", 93, 92, 91, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\jordan.jpg");
        basketbolcu lebron = new basketbolcu("Lebron", "Lakers", 90, 92, 97, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\lebron.jpg");
        basketbolcu mehmet = new basketbolcu("Mehmet", "Jazz", 90, 88, 75, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\mehmet.png");
        basketbolcu parker = new basketbolcu("Parker", "San Antonio Spurs", 87, 90, 78, "C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\parker.jpg");
        //Basketbolcuları listeye ekliyoruz.
        basketbolcuList.add(bogdanovic);
        basketbolcuList.add(curry);
        basketbolcuList.add(hidayet);
        basketbolcuList.add(iverson);
        basketbolcuList.add(jordan);
        basketbolcuList.add(lebron);
        basketbolcuList.add(mehmet);
        basketbolcuList.add(parker);
        //Kartları karıştırıyoruz.
        Collections.shuffle(basketbolcuList);
    }

    public static void kartlariDagit(Kullanici a, Bilgisayar b) {
        for(int i = 0 ; i < 4 ; i++ ) {
            futbolcuListK.add(futbolcuList.get(i));
            System.out.println(futbolcuListK.get(i).getSporcuIsim());
            a.listeyeKartEkleF(futbolcuList.get(i));
            System.out.println(a.getCardListF().get(i).getSporcuIsim());
            
        }
        //Kullanıcı için basketbol kartları
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
        //Bilgisayar için basketbol kartları
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
        System.out.println( "Se�ilen �zellik: " + n);
        if(n==0){
            System.out.println("�kilik Puan�: ");
             kullaniciPuan = a.kartListesiB().get(secilenOyuncuKullanici).getIkilik();
             bilgisayarPuan = b.kartListesiB().get(secilenOyuncuBilgisayar).getIkilik();
             System.out.println("Kullanici �zellik Puani: "+ kullaniciPuan );
             System.out.println("Bilgisayar �zellik Puani: "+ bilgisayarPuan);
             
             if(kullaniciPuan > bilgisayarPuan) {
             	a.setSkor(10);
             	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " �kilik Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() + " �kilik Puan�: " + bilgisayarPuan );
             }else if(kullaniciPuan < bilgisayarPuan){        	
             	b.setSkor(10);        	
             	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " �kilik Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() + " �kilik Puan�: " + bilgisayarPuan);
             }else if(kullaniciPuan == bilgisayarPuan) {
             	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "�zellikler tekrar kar��la�t�r�l�yor...");
             	winnerBasketbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
             }    
             
        }else if(n==1){
            System.out.println("��l�k Puan�: ");
            kullaniciPuan = a.kartListesiB().get(secilenOyuncuKullanici).getUcluk();
            bilgisayarPuan = b.kartListesiB().get(secilenOyuncuBilgisayar).getUcluk();
            System.out.println("Kullanici �zellik Puani: "+ kullaniciPuan );
            System.out.println("Bilgisayar �zellik Puani: "+ bilgisayarPuan);
            
            if(kullaniciPuan > bilgisayarPuan) {
            	a.setSkor(10);
            	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " ��l�k Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" ��l�k Puan�: " + bilgisayarPuan );
            }else if(kullaniciPuan < bilgisayarPuan){        	
            	b.setSkor(10);        	
            	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " ��l�k Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" ��l�k Puan�: " + bilgisayarPuan );
            }else if(kullaniciPuan == bilgisayarPuan) {
            	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "�zellikler tekrar kar��la�t�r�l�yor...");
            	winnerBasketbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
            }  
            
        }else if(n==2){
            System.out.println("Serbest At�� Puan�: ");
            kullaniciPuan = a.kartListesiB().get(secilenOyuncuKullanici).getSerbestAtis();
            bilgisayarPuan = b.kartListesiB().get(secilenOyuncuBilgisayar).getSerbestAtis();
            
            if(kullaniciPuan > bilgisayarPuan) {
            	a.setSkor(10);    	
            	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest At�� Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest At�� Puan�: " + bilgisayarPuan );            	
            }else if(kullaniciPuan < bilgisayarPuan){        	
            	b.setSkor(10);        	
            	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest At�� Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest At�� Puan�: " + bilgisayarPuan );            }else if(kullaniciPuan == bilgisayarPuan) {
            }else if(kullaniciPuan == bilgisayarPuan) {
            	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "�zellikler tekrar kar��la�t�r�l�yor...");
                winnerBasketbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
           }   
        }
           
    }
    

    public static void winnerFutbolcu(Kullanici a, Bilgisayar b, int secilenOyuncuKullanici, int secilenOyuncuBilgisayar){
    	Random r = new Random();
        int n = r.nextInt(3);
        int kullaniciPuan = 0;
        int bilgisayarPuan= 0;
        System.out.println( "Se�ilen �zellik: " + n);
        if(n==0){
            System.out.println("Kaleci �le Kar�� KAr��ya Puan�: ");
             kullaniciPuan = a.kartListesiF().get(secilenOyuncuKullanici).getKaleciKarsiKarsiya();
             bilgisayarPuan = b.kartListesiF().get(secilenOyuncuBilgisayar).getKaleciKarsiKarsiya();
             System.out.println("Kullanici �zellik Puani: "+ kullaniciPuan );
             System.out.println("Bilgisayar �zellik Puani: "+ bilgisayarPuan);
             if(kullaniciPuan > bilgisayarPuan) {
             	a.setSkor(10);    	
             	 JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Kaleci ile Kar�� Kar��ya Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Kaleci ile Kar�� Kar��ya Puan�: " + bilgisayarPuan );
             	
             }else if(kullaniciPuan < bilgisayarPuan){        	
             	b.setSkor(10);        	
             	 JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Kaleci ile Kar�� Kar��ya Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Kaleci ile Kar�� Kar��ya Puan�: " + bilgisayarPuan );
             }else if(kullaniciPuan == bilgisayarPuan) {
             	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "�zellikler tekrar kar��la�t�r�l�yor...");
            	winnerFutbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
            } 
        }else if(n==1){
            System.out.println("Penalt� Puan�: ");
            kullaniciPuan = a.kartListesiF().get(secilenOyuncuKullanici).getPenalti();
            bilgisayarPuan = b.kartListesiF().get(secilenOyuncuBilgisayar).getPenalti();
            System.out.println("Kullanici �zellik Puani: "+ kullaniciPuan );
            System.out.println("Bilgisayar �zellik Puani: "+ bilgisayarPuan);
            if(kullaniciPuan > bilgisayarPuan) {
             	a.setSkor(10);    	
             	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Penalt� Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Penalt� Puan�: " + bilgisayarPuan );
             	
             }else if(kullaniciPuan < bilgisayarPuan){        	
             	b.setSkor(10);        	
             	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Penalt� Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Penalt� Puan�: " + bilgisayarPuan );
             }else if(kullaniciPuan == bilgisayarPuan) {
             	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "�zellikler tekrar kar��la�t�r�l�yor...");
            	winnerFutbolcu(a,b, secilenOyuncuKullanici, secilenOyuncuBilgisayar);
            } 
      
        }else if(n==2){
            System.out.println("Serbest At�� Puan�: ");
            kullaniciPuan = a.kartListesiF().get(secilenOyuncuKullanici).getSerbestAtis();
            bilgisayarPuan = b.kartListesiF().get(secilenOyuncuBilgisayar).getSerbestAtis();
            if(kullaniciPuan > bilgisayarPuan) {
            	a.setSkor(10);    	
            	JOptionPane.showMessageDialog(null, "Kazanan " + a.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest At�� Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest At�� Puan�: " + bilgisayarPuan );            	
            }else if(kullaniciPuan < bilgisayarPuan){        	
            	b.setSkor(10);        	
            	JOptionPane.showMessageDialog(null, "Kazanan " + b.getOyuncuAdi() +"\n" + a.getOyuncuAdi() + " Serbest At�� Puan�: " + kullaniciPuan +"\n" + b.getOyuncuAdi() +" Serbest At�� Puan�: " + bilgisayarPuan );            }else if(kullaniciPuan == bilgisayarPuan) {
            	}else if(kullaniciPuan == bilgisayarPuan) {
                 	JOptionPane.showMessageDialog(null, "Berabere. " + "\n" + "�zellikler tekrar kar��la�t�r�l�yor...");
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
