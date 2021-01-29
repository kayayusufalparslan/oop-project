package deneme_windowB;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OyunEkrani {

	JFrame anaEkran;
	int sira = 0;
	
	void yeniEkran() {
		if(sira == 8 ) {
			JOptionPane.showMessageDialog(null, "Oyun sonucu gösteriliyor....");
			JFrame sonuc = new deneme_windowB.OyunSonucu().frame;   
			sonuc.setVisible(true);
			anaEkran.setVisible(false); //þu an ki ekraný kapatýyoruz.
		}
		
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OyunEkrani window = new OyunEkrani();
					window.anaEkran.setVisible(true);			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
			
	}

	/**
	 * Create the application.
	 */
	public OyunEkrani() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		anaEkran = new JFrame();
		anaEkran.getContentPane().setBackground(Color.ORANGE);
		anaEkran.setBounds(2, 2, 1500, 800);
		anaEkran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		anaEkran.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));

		
		JLabel kart1 = new JLabel("");
		kart1.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart1);
		
		JLabel kart2 = new JLabel("");
		kart2.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart2);
		
		JLabel kart3 = new JLabel("");
		kart3.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart3);
		
		JLabel kart4 = new JLabel("");
		kart4.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart4);
		
		JLabel kart5 = new JLabel("");
		kart5.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart5);
		
		JLabel kart6 = new JLabel("");
		kart6.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart6);
		
		JLabel kart7 = new JLabel("");
		kart7.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart7);
		
		JLabel kart8 = new JLabel("");
		kart8.setIcon(new ImageIcon("C:\\Users\\h\\try_Game\\src\\com\\kaya\\images\\joker.jpg"));
		anaEkran.getContentPane().add(kart8);
		
		JLabel kart9 = new JLabel("");
		kart9.setIcon(new ImageIcon(Main.futbolcuListK.get(0).getImage()));
		kart9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.futbolcuListK.get(0).isKartKullanildiMi()) {
					if(sira % 2 ==  0) {
						if(!Main.futbolcuListK.get(0).isKartKullanildiMi()) {
							kart1.setIcon(new ImageIcon(Main.bilgisayar.getCardListF().get(0).getImage()));
							//kart9.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerFutbolcu(Main.kullanici, Main.bilgisayar, 0, 0);
							Main.futbolcuListK.get(0).setKartKullanildiMi(true);
							kart9.setText("+");
							sira++;
							yeniEkran();
							
						}
					}else {
						JOptionPane.showMessageDialog(null, "Basketbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");
				}
				
				
			}
		});
		anaEkran.getContentPane().add(kart9);
		
		JLabel kart10 = new JLabel("");
		kart10.setIcon(new ImageIcon(Main.futbolcuListK.get(1).getImage()));
		kart10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.futbolcuListK.get(1).isKartKullanildiMi()) {
					if(sira % 2 == 0) {
						if(!Main.futbolcuListK.get(1).isKartKullanildiMi()) {
							kart2.setIcon(new ImageIcon(Main.bilgisayar.getCardListF().get(1).getImage()));
							//kart10.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerFutbolcu(Main.kullanici, Main.bilgisayar, 1,1);
							Main.futbolcuListK.get(1).setKartKullanildiMi(true);
							kart10.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Basketbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");
				}					
			}
		});
		anaEkran.getContentPane().add(kart10);
		
		JLabel kart11 = new JLabel("");
		kart11.setIcon(new ImageIcon(Main.futbolcuListK.get(2).getImage()));
		kart11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.futbolcuListK.get(2).isKartKullanildiMi()) {
					if(sira % 2 == 0) {
						if(!Main.futbolcuListK.get(2).isKartKullanildiMi()) {
							kart3.setIcon(new ImageIcon(Main.bilgisayar.getCardListF().get(2).getImage()));
							//kart11.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerFutbolcu(Main.kullanici, Main.bilgisayar, 2, 2);
							Main.futbolcuListK.get(2).setKartKullanildiMi(true);
							kart11.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Basketbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");
				}			
			}
		});
		anaEkran.getContentPane().add(kart11);
		
		JLabel kart12 = new JLabel("");
		kart12.setIcon(new ImageIcon(Main.futbolcuListK.get(3).getImage()));
		kart12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.futbolcuListK.get(3).isKartKullanildiMi()) {
					if(sira % 2 ==0) {
						if(!Main.futbolcuListK.get(3).isKartKullanildiMi()) {
							kart4.setIcon(new ImageIcon(Main.bilgisayar.getCardListF().get(3).getImage()));
							//kart12.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerFutbolcu(Main.kullanici, Main.bilgisayar, 3, 3);
							Main.futbolcuListK.get(3).setKartKullanildiMi(true);
							kart12.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Basketbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");
				}								
			}
		});
		anaEkran.getContentPane().add(kart12);
		
		JLabel kart13 = new JLabel("");
		kart13.setIcon(new ImageIcon(Main.basketbolcuListK.get(0).getImage()));
		kart13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.basketbolcuListK.get(0).isKartKullanildiMi()) {
					if(sira % 2 == 1) {
						if(!Main.basketbolcuListK.get(0).isKartKullanildiMi()) {
							kart5.setIcon(new ImageIcon(Main.bilgisayar.getCardListB().get(0).getImage()));
							//kart13.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerBasketbolcu(Main.kullanici, Main.bilgisayar, 0, 0);
							Main.basketbolcuListK.get(0).setKartKullanildiMi(true);	
							kart13.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Futbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");
				}	
				
			}
		});
		anaEkran.getContentPane().add(kart13);
		
		JLabel kart14 = new JLabel("");
		kart14.setIcon(new ImageIcon(Main.basketbolcuListK.get(1).getImage()));
		kart14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.basketbolcuListK.get(1).isKartKullanildiMi()) {
					if(sira % 2 == 1) {
						if(!Main.basketbolcuListK.get(1).isKartKullanildiMi()) {
							kart6.setIcon(new ImageIcon(Main.bilgisayar.getCardListB().get(1).getImage()));
							//kart14.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerBasketbolcu(Main.kullanici, Main.bilgisayar, 1, 1);
							Main.basketbolcuListK.get(1).setKartKullanildiMi(true);
							kart14.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Futbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");
				}	
					
				
			}
		});
		anaEkran.getContentPane().add(kart14);
		
		JLabel kart15 = new JLabel("");
		kart15.setIcon(new ImageIcon(Main.basketbolcuListK.get(2).getImage()));
		kart15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.basketbolcuListK.get(2).isKartKullanildiMi()) {
					if(sira % 2 == 1) {
						if(!Main.basketbolcuListK.get(2).isKartKullanildiMi()) {
							kart7.setIcon(new ImageIcon(Main.bilgisayar.getCardListB().get(2).getImage()));
							//kart15.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerBasketbolcu(Main.kullanici, Main.bilgisayar, 2, 2);
							Main.basketbolcuListK.get(2).setKartKullanildiMi(true);	
							kart15.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Futbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");	
				}
			}
		});
		anaEkran.getContentPane().add(kart15);
		
		JLabel kart16 = new JLabel("");
		kart16.setIcon(new ImageIcon(Main.basketbolcuListK.get(3).getImage()));
		kart16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!Main.basketbolcuListK.get(3).isKartKullanildiMi()) {
					if(sira % 2 == 1) {
						if(!Main.basketbolcuListK.get(3).isKartKullanildiMi()) {
							kart8.setIcon(new ImageIcon(Main.bilgisayar.getCardListB().get(3).getImage()));
							//kart16.setIcon(new ImageIcon("C:\\Users\\h\\eclipse-workspace\\deneme_windowB\\src\\deneme_windowB\\images\\used.png"));
							Main.winnerBasketbolcu(Main.kullanici, Main.bilgisayar, 3, 3);
							Main.basketbolcuListK.get(3).setKartKullanildiMi(true);	
							kart16.setText("+");
							sira++;
							yeniEkran();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Futbolcu Seçmelisiniz!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Bu kart daha önce kullanýlmýþtýr!");	
				}
			}
		});
		anaEkran.getContentPane().add(kart16);
		
		
		
	}

}
