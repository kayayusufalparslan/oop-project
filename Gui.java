package deneme_windowB;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;

public class Gui {
	

	private JFrame baslangic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.baslangic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		baslangic = new JFrame();
		baslangic.getContentPane().setBackground(Color.YELLOW);
		baslangic.setBounds(100, 100, 808, 490);
		baslangic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		baslangic.getContentPane().setLayout(null);
		
		JLabel karsilama = new JLabel("Oyuna Ba\u015Flamak \u0130\u00E7in T\u0131klay\u0131n\u0131z...\r\n");
		karsilama.setFont(new Font("Tahoma", Font.PLAIN, 22));
		karsilama.setBounds(218, 11, 504, 116);
		baslangic.getContentPane().add(karsilama);
		
		JButton baslaButton = new JButton("Ba\u015Fla");
		baslaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame anaEkran = new deneme_windowB.OyunEkrani().anaEkran;   //ana ekranýmýza geçiþ yapan bir mouseclick olayý           
				anaEkran.setVisible(true);
				baslangic.dispose(); //þu an ki ekraný kapatýyoruz.
				
			}
		});
		baslaButton.setForeground(Color.BLACK);
		baslaButton.setBackground(Color.GREEN);
		baslaButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		baslaButton.setBounds(138, 339, 493, 73);
		baslangic.getContentPane().add(baslaButton);
		
		JTextPane txtpnOynanBilgisayara = new JTextPane();
		txtpnOynanBilgisayara.setEditable(false);
		txtpnOynanBilgisayara.setBackground(Color.CYAN);
		txtpnOynanBilgisayara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnOynanBilgisayara.setText("OYNANI\u015E:\r\n1-) Bilgisayara ve size toplam da 8 tane olmak \u00FCzere rastgele 4 futbolcu ve 4 basketbolcu kart\u0131 verir.\r\n2-) Oyunun i\u015Fleyi\u015F s\u0131ras\u0131 bir futbolcu ve bir basketbolcu se\u00E7ilmesi olarak ilerleyecektir.\r\n3-) Oynamak istedi\u011Finiz kart\u0131n \u00FCzerine t\u0131klay\u0131n\u0131z. Daha sonra bilgisayar rastgele olarak bir se\u00E7im yapacakt\u0131r. Se\u00E7ilen kartlardan rastgele bir \u00F6zellik se\u00E7ilip kar\u015F\u0131la\u015Ft\u0131rma yap\u0131lacakt\u0131r. Puan\u0131 b\u00FCy\u00FCk olan kullan\u0131c\u0131 \"+10\" puan kazanacakt\u0131r.\r\n4-) Oynanan bir kart bir daha oynanamaz ve oynanan kart\u0131n sa\u011F taraf\u0131nda \"+\" i\u015Fareti bulunur.\r\n5-) B\u00FCt\u00FCn kartlar oynand\u0131\u011F\u0131nda y\u00FCksek puana sahip kullan\u0131c\u0131, kazanan olacakt\u0131r.\r\n\r\n\r\n");
		txtpnOynanBilgisayara.setBounds(94, 92, 600, 236);
		baslangic.getContentPane().add(txtpnOynanBilgisayara);
	}
}
