package deneme_windowB;

import javax.swing.*;
import java.awt.*;

public class OyunSonucu {

    JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OyunSonucu window = new OyunSonucu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OyunSonucu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 4, 0, 0));
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_3);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_2);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setBackground(Color.WHITE);
		frame.getContentPane().add(horizontalGlue_1);
		
		JLabel sonuc = new JLabel("Oyun Sonucu:");
		sonuc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sonuc.setForeground(Color.BLUE);
		sonuc.setBackground(Color.WHITE);
		frame.getContentPane().add(sonuc);
		
		String kazanan = "";
		if(Main.bilgisayar.getSkor() > Main.kullanici.getSkor() ) {
			kazanan = "Bilgisayar kazandý :(";
		}else if( Main.bilgisayar.getSkor() < Main.kullanici.getSkor() ) {
			kazanan = "Kullanýcý kazandý :)";
		}else {
			kazanan = " Berabere :/";
		}
		JLabel oyuncu = new JLabel(kazanan);
		oyuncu.setBackground(Color.WHITE);
		oyuncu.setForeground(Color.RED);
		oyuncu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(oyuncu);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		frame.getContentPane().add(horizontalGlue);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		frame.getContentPane().add(horizontalGlue_2);
		
		JTextArea bilgisayar = new JTextArea();
		bilgisayar.setBackground(Color.PINK);
		bilgisayar.setForeground(Color.MAGENTA);
		bilgisayar.setFont(new Font("Tahoma", Font.BOLD, 12));
		bilgisayar.setEditable(false);
		bilgisayar.setText("Bilgisayar Skor: " + "\n" + Main.bilgisayar.getSkor() );
		frame.getContentPane().add(bilgisayar);
		
		JTextArea kullanýcý = new JTextArea();
		kullanýcý.setBackground(Color.PINK);
		kullanýcý.setForeground(Color.MAGENTA);
		kullanýcý.setEditable(false);
		kullanýcý.setFont(new Font("Tahoma", Font.BOLD, 12));
		kullanýcý.setText("Kullanýcý Skor: " +"\n" + Main.kullanici.getSkor());
		frame.getContentPane().add(kullanýcý);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		frame.getContentPane().add(horizontalGlue_4);
		
		Component verticalGlue_4 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_4);
		
		Component verticalGlue_5 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_5);
		
		Component verticalGlue_6 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_6);
		
		Component verticalGlue_7 = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue_7);
	}

}
