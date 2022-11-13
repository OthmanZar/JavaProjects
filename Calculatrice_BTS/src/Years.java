import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Years extends JFrame {
	static JLabel titre;
	private JPanel contentPane;
	int xx , xy;
	static JLabel img;
	static JButton exit;
	static Years frame;
	static JButton ere;
	static JButton Eme;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Years();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Years() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 576);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();

			        xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

		        int y = e.getYOnScreen();

		        Years.this.setLocation(x - xx, y - xy);  
			}
		});
		
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(0, 0, 278, 583);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/Images/Picture1.png")));
		lblNewLabel.setBounds(23, 129, 234, 134);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Calculatrice Des Notes");
		lblNewLabel_1.setForeground(SystemColor.textInactiveText);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 27));
		lblNewLabel_1.setBounds(10, 263, 268, 104);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Voir Votre Note Maintenant");
		lblNewLabel_2.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(37, 328, 209, 58);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MainPage.class.getResource("/Images/calculator.png")));
		lblNewLabel_3.setBounds(174, 227, 104, 70);
		panel.add(lblNewLabel_3);
		
		titre = new JLabel("");
		titre.setForeground(new Color(70, 130, 180));
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		titre.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 27));
		titre.setBounds(286, 81, 367, 67);
		contentPane.add(titre);
		
		 ere = new JButton("1er Ann\u00E9e");
		ere.setToolTipText("   ");
		ere.setIcon(new ImageIcon(Years.class.getResource("/Images/number-one.png")));
		ere.setSelectedIcon(new ImageIcon(MainPage.class.getResource("/Images/computer.png")));
		ere.setBackground(new Color(224, 255, 255));
		ere.setForeground(new Color(112, 128, 144));
		ere.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
		ere.setBounds(288, 312, 170, 58);
		contentPane.add(ere);
		
		 Eme = new JButton("2\u00E9me Ann\u00E9e");
		Eme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Eme.setIcon(new ImageIcon(Years.class.getResource("/Images/number-2.png")));
		Eme.setToolTipText("   ");
		Eme.setForeground(new Color(112, 128, 144));
		Eme.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
		Eme.setBackground(new Color(224, 255, 255));
		Eme.setBounds(469, 312, 197, 58);
		contentPane.add(Eme);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(MainPage.class.getResource("/Images/button.png")));
		lblNewLabel_5.setBounds(644, 0, 32, 51);
		contentPane.add(lblNewLabel_5);
		
		img = new JLabel("");
		img.setBounds(418, 131, 170, 106);
		contentPane.add(img);
		
		exit = new JButton("Retourner");
		exit.setBackground(new Color(224, 255, 255));
		exit.setForeground(new Color(178, 34, 34));
		exit.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		exit.setIcon(new ImageIcon(Years.class.getResource("/Images/return (1).png")));
		exit.setBounds(526, 517, 162, 56);
		contentPane.add(exit);
		
		
		
		
	}
}
