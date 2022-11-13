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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainPage extends JFrame {
static MainPage frame;
	private JPanel contentPane;
	int xx , xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainPage();
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
	public MainPage() {
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

		        MainPage.this.setLocation(x - xx, y - xy);  
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
		
		JLabel lblNewLabel_4 = new JLabel("Choisir Votre Fili\u00E8re");
		lblNewLabel_4.setIcon(new ImageIcon(MainPage.class.getResource("/Images/list-option.png")));
		lblNewLabel_4.setForeground(new Color(70, 130, 180));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		lblNewLabel_4.setBounds(288, 81, 365, 92);
		contentPane.add(lblNewLabel_4);
		
	/*	
		Years year = new Years();
	
		year.exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				year.setVisible(false);
				
			}
		});
		*/
		JButton sri = new JButton("SRI");
		sri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Notes note = new Notes();
		Years year = new Years();
				year.titre.setText("Systemes Et Reseaux Informatique");
			
				year.img.setIcon(new ImageIcon(MainPage.class.getResource("/Images/computer (2).png")));
				year.titre.setFont(new Font("Tw Cen MT Condensed", Font.BOLD,30));
				frame.setVisible(false);
				year.setUndecorated(true);
				year.setVisible(true);
				year.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(true);
						year.setVisible(false);
						
					}
				});
				year.ere.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						year.setVisible(false);
						note.setUndecorated(true);
						note.setVisible(true);
						
					}
				});
				Notes2 note2 = new Notes2();
				year.Eme.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
		
					year.setVisible(false);
						note2.setUndecorated(true);
						note2.setVisible(true);
						
					}
				});
				
				
				note.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						year.setVisible(true);
					note.setVisible(false);
						
					}
				});
				note2.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						year.setVisible(true);
					note2.setVisible(false);
						
					}
				});
			
				Result res = new Result();
				note.calculer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 
							 		
							 		res.NAME.setText(note.name);
							 		res.ang.setText(Double.toString( (note.Anglais)));
							 		res.fran.setText(Double.toString(note.Francais));
							 		res.arab.setText(Double.toString(note.Arab));
							 		res.tec.setText(Double.toString(note.Tec));
							 		res.ttlcom.setText(Double.toString(note.Com));
							 		res.dev.setText(Double.toString(note.Dev));
							 		res.linux.setText(Double.toString(note.Linux));
							 		res.arch.setText(Double.toString(note.Arch));
							 		res.eej.setText(Double.toString(note.EEJ));
							 		res.math.setText(Double.toString(note.Math));
							 		res.ttltech.setText(Double.toString(note.Techni));
							 		res.wind.setText(Double.toString(note.Windows));
							 		res.res.setText(Double.toString(note.Reseau));
							 		res.ttlpro.setText(Double.toString(note.Pro));
							 		res.total.setText(Double.toString(note.Total));
							 		
					note.setVisible(false);
						res.setUndecorated(true);
						res.setVisible(true);
						
						
					}
				});
				
				res.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						res.setVisible(false);
						note.setVisible(true);
						
					}
				});
				
				Result2 res2 = new Result2();
				note2.calculer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 
							 		
							 		res2.NAME.setText(note2.name);
							 		res2.ang.setText(Double.toString( (note2.Anglais)));
							 		res2.fran.setText(Double.toString(note2.Francais));
							 		res2.arab.setText(Double.toString(note2.Arab));
							 		res2.tec.setText(Double.toString(note2.Tec));
							 		res2.ttlcom.setText(Double.toString(note2.Com));
							 		res2.dev.setText(Double.toString(note2.Dev));
							 		res2.linux.setText(Double.toString(note2.Linux));
							 		res2.math.setText(Double.toString(note2.Math));
							 		res2.ttltech.setText(Double.toString(note2.Techni));
							 		res2.wind.setText(Double.toString(note2.Windows));
							 		res2.res.setText(Double.toString(note2.Reseau));
							 		res2.ttlpro.setText(Double.toString(note2.Pro));
							 		res2.total.setText(Double.toString(note2.Total));
							 		
						note2.setVisible(false);
						res2.setUndecorated(true);
						res2.setVisible(true);
						
						
					}
				});
				
				
			
				
				res2.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						res2.setVisible(false);
						note2.setVisible(true);
						
					}
				});
				
			}
		});
		
		sri.setIcon(new ImageIcon(MainPage.class.getResource("/Images/computer (1).png")));
		sri.setSelectedIcon(new ImageIcon(MainPage.class.getResource("/Images/computer.png")));
		sri.setBackground(new Color(224, 255, 255));
		sri.setForeground(new Color(112, 128, 144));
		sri.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
		sri.setBounds(288, 201, 150, 58);
		contentPane.add(sri);
		
		JButton elt = new JButton("ELT");
		elt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Years year = new Years();
				year.titre.setText("Electro Technique");
				
				year.img.setIcon(new ImageIcon(MainPage.class.getResource( "/Images/electrical-energy (1).png")));
				year.titre.setFont(new Font("Tw Cen MT Condensed", Font.BOLD,50));
				frame.setVisible(false);
				year.setUndecorated(true);
				year.setVisible(true);
				year.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(true);
						year.setVisible(false);
						
					}
				});
			}
		});
		elt.setIcon(new ImageIcon(MainPage.class.getResource("/Images/electrical-energy.png")));
		elt.setToolTipText("   ");
		elt.setForeground(new Color(112, 128, 144));
		elt.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
		elt.setBackground(new Color(224, 255, 255));
		elt.setBounds(503, 277, 150, 79);
		contentPane.add(elt);
		
		JButton cg = new JButton("CG");
		cg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Years year = new Years();
				year.titre.setText("Comptabilité Et Gestion");
				
				year.img.setIcon(new ImageIcon(MainPage.class.getResource("/Images/analytics (1).png")));
				year.titre.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
				frame.setVisible(false);
				year.setUndecorated(true);
				year.setVisible(true);
				year.exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						frame.setVisible(true);
					year.setVisible(false);
						
					}
				});
			}
		});
		cg.setIcon(new ImageIcon(MainPage.class.getResource("/Images/analytics.png")));
		cg.setToolTipText("   ");
		cg.setForeground(new Color(112, 128, 144));
		cg.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
		cg.setBackground(new Color(224, 255, 255));
		cg.setBounds(288, 362, 150, 58);
		contentPane.add(cg);
		
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
		
		
		
		
		
		
	}
}
