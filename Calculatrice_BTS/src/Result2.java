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
import javax.swing.JSeparator;

public class Result2 extends JFrame {
	private JPanel contentPane;
	int xx , xy;
	static JButton exit;
	static Result2 frame;
	 static JLabel NAME;
	 static JLabel ang; 
	 static JLabel fran ;
	 static JLabel arab ;
	 static JLabel tec;
	 static JLabel ttlcom;
	 static JLabel dev ;
	 static JLabel linux;
	 static JLabel math ;
	 static JLabel ttltech;
	 static JLabel wind;
	 static JLabel res;
	 static JLabel ttlpro;
	 static JLabel total;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Result2();
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
	public Result2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 649);
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

		        Result2.this.setLocation(x - xx, y - xy);  
			}
		});
		
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		exit = new JButton("Retourner");
		exit.setBackground(new Color(224, 255, 255));
		exit.setForeground(new Color(178, 34, 34));
		exit.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		exit.setIcon(new ImageIcon(Years.class.getResource("/Images/return (1).png")));
		exit.setBounds(534, 599, 162, 36);
		contentPane.add(exit);
		
		JLabel lblNewLabel = new JLabel("Resultat Finale");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 11, 544, 85);
		contentPane.add(lblNewLabel);
		
		 NAME = new JLabel("");
		NAME.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		NAME.setBounds(134, 130, 279, 23);
		contentPane.add(NAME);
		
		JLabel lblNewLabel_2 = new JLabel("Nom Complet :");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 119, 148, 42);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ann\u00E9e et Fili\u00E8re :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(10, 97, 148, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("2SRI");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(151, 97, 279, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.textInactiveText);
		separator.setBounds(10, 172, 656, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textInactiveText);
		separator_1.setBounds(10, 84, 656, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Modules De Langues Et Communication");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_3_1.setBounds(20, 185, 318, 25);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(10, 213, 334, 193);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAnglais = new JLabel("Langue Anglaise :");
		lblAnglais.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblAnglais.setBounds(10, 11, 120, 18);
		panel.add(lblAnglais);
		
		JLabel lblFranais = new JLabel("Langue Fran\u00E7aise :");
		lblFranais.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblFranais.setBounds(10, 43, 120, 18);
		panel.add(lblFranais);
		
		JLabel lblArabe = new JLabel("Langue Arabe :");
		lblArabe.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblArabe.setBounds(10, 72, 120, 18);
		panel.add(lblArabe);
		
		JLabel lblTec = new JLabel("Technique D'expression Et Communication : ");
		lblTec.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblTec.setBounds(10, 101, 248, 18);
		panel.add(lblTec);
		
		 ang = new JLabel("");
		ang.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		ang.setBounds(264, 13, 70, 15);
		panel.add(ang);
		
		 fran = new JLabel("");
		fran.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		fran.setBounds(264, 45, 70, 15);
		panel.add(fran);
		
		arab = new JLabel("");
		arab.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		arab.setBounds(264, 74, 70, 15);
		panel.add(arab);
		
		 tec = new JLabel("");
		tec.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		tec.setBounds(264, 103, 70, 15);
		panel.add(tec);
		
		JLabel lblNewLabel_6 = new JLabel("la Moyenne De Module :");
		lblNewLabel_6.setForeground(new Color(0, 100, 0));
		lblNewLabel_6.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_6.setBounds(29, 165, 164, 25);
		panel.add(lblNewLabel_6);
		
		 ttlcom = new JLabel("");
		ttlcom.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		ttlcom.setBounds(203, 170, 70, 15);
		panel.add(ttlcom);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Modules Technique");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setForeground(new Color(70, 130, 180));
		lblNewLabel_3_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_3_1_1.setBounds(370, 185, 318, 25);
		contentPane.add(lblNewLabel_3_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(362, 213, 334, 193);
		contentPane.add(panel_1);
		
		JLabel lblDevelopement = new JLabel("Developement Des Applications Informatique :");
		lblDevelopement.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblDevelopement.setBounds(10, 11, 269, 18);
		panel_1.add(lblDevelopement);
		
		JLabel lblLinux = new JLabel("System D'exploiatation GNU/Linux :");
		lblLinux.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblLinux.setBounds(10, 43, 256, 18);
		panel_1.add(lblLinux);
		
		 dev = new JLabel("");
		dev.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		dev.setBounds(276, 13, 70, 15);
		panel_1.add(dev);
		
		 linux = new JLabel("");
		linux.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		linux.setBounds(276, 45, 70, 15);
		panel_1.add(linux);
		
		JLabel lblMath = new JLabel("Mathematiques : ");
		lblMath.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblMath.setBounds(10, 72, 247, 18);
		panel_1.add(lblMath);
		
		 math = new JLabel("");
		math.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		math.setBounds(276, 72, 70, 15);
		panel_1.add(math);
		
		JLabel lblNewLabel_6_1 = new JLabel("la Moyenne De Module :");
		lblNewLabel_6_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_6_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_6_1.setBounds(19, 166, 164, 25);
		panel_1.add(lblNewLabel_6_1);
		
		 ttltech = new JLabel("");
		ttltech.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		ttltech.setBounds(187, 171, 70, 15);
		panel_1.add(ttltech);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Modules Professionnel");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setForeground(new Color(70, 130, 180));
		lblNewLabel_3_1_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_3_1_2.setBounds(186, 417, 318, 25);
		contentPane.add(lblNewLabel_3_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(182, 441, 334, 102);
		contentPane.add(panel_2);
		
		JLabel lblAnglais_1 = new JLabel("Systeme D'exploiataion Propretaire :");
		lblAnglais_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblAnglais_1.setBounds(10, 11, 223, 18);
		panel_2.add(lblAnglais_1);
		
		JLabel lblFranais_1 = new JLabel("Reseau Informatique :");
		lblFranais_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblFranais_1.setBounds(10, 43, 171, 18);
		panel_2.add(lblFranais_1);
		
		 wind = new JLabel("");
		wind.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		wind.setBounds(243, 13, 70, 15);
		panel_2.add(wind);
		
		 res = new JLabel("");
		res.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		res.setBounds(243, 45, 70, 15);
		panel_2.add(res);
		
		JLabel lblNewLabel_6_2 = new JLabel("la Moyenne De Module :");
		lblNewLabel_6_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_6_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_6_2.setBounds(29, 165, 164, 25);
		panel_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_4_3_2_2 = new JLabel("18.5");
		lblNewLabel_4_3_2_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_4_3_2_2.setBounds(203, 170, 70, 15);
		panel_2.add(lblNewLabel_4_3_2_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("la Moyenne De Module :");
		lblNewLabel_6_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_6_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_6_3.setBounds(20, 72, 164, 25);
		panel_2.add(lblNewLabel_6_3);
	
		ttlpro = new JLabel("");
		ttlpro.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		ttlpro.setBounds(180, 78, 70, 15);
		panel_2.add(ttlpro);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(62, 546, 565, 42);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		 total = new JLabel("");
		total.setBounds(331, 11, 143, 25);
		panel_3.add(total);
		total.setForeground(new Color(128, 0, 0));
		total.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3_1_3 = new JLabel("La Moyenne Generale :");
		lblNewLabel_3_1_3.setBounds(50, 8, 318, 25);
		panel_3.add(lblNewLabel_3_1_3);
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setForeground(new Color(70, 130, 180));
		lblNewLabel_3_1_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		
		
		
		
	}
}
