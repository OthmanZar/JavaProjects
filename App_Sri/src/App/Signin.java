package App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Signin extends JFrame {

	private JPanel contentPane;
	private JPanel psw;
int xx , xy;
private JTextField fstname;
private JTextField lstname;
private JTextField numph;
static Signin frame ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	 
					 frame = new Signin();
					 Signin.frame.setUndecorated(true);
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
	public Signin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 581);
		psw = new JPanel();
		psw.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

		        int y = e.getYOnScreen();

		        Signin.this.setLocation(x - xx, y - xy);  
			}
		});
		psw.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();

			        xy = e.getY();
			}
		});
		psw.setToolTipText("");
		
		psw.setBackground(Color.WHITE);
		setContentPane(psw);
		psw.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(366, 0, 235, 586);
		psw.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Shop Online");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 33));
		lblNewLabel_1.setBounds(35, 333, 169, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\shopping-bag (2).png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(53, 193, 128, 154);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Try it Now ...");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_3.setBounds(71, 368, 115, 26);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(201, 0, 24, 42);
		panel.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("D:\\delete-icon.png"));
		
		JLabel lblNewLabel_4 = new JLabel("register to start the online purchase");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\register.png"));
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_4.setBounds(0, 21, 364, 78);
		psw.add(lblNewLabel_4);
		
		JLabel firstname = new JLabel("First Name");
		firstname.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		firstname.setBounds(28, 98, 85, 22);
		psw.add(firstname);
		
		fstname = new JTextField();
		fstname.setBounds(38, 119, 212, 30);
		psw.add(fstname);
		fstname.setColumns(10);
		
		JLabel lastname = new JLabel("Last Name");
		lastname.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lastname.setBounds(28, 165, 85, 22);
		psw.add(lastname);
		
		lstname = new JTextField();
		lstname.setColumns(10);
		lstname.setBounds(38, 185, 212, 30);
		psw.add(lstname);
		
		JLabel phonenum = new JLabel("Phone Number");
		phonenum.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		phonenum.setBounds(28, 229, 108, 22);
		psw.add(phonenum);
		
		numph = new JTextField();
		numph.setColumns(10);
		numph.setBounds(38, 249, 212, 30);
		psw.add(numph);
		
		JLabel birthday = new JLabel("Birthday");
		birthday.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		birthday.setBounds(28, 295, 85, 22);
		psw.add(birthday);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1634511600000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setBounds(38, 317, 212, 28);
		psw.add(spinner);
		
		JLabel city = new JLabel("City");
		city.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		city.setBounds(28, 362, 85, 20);
		psw.add(city);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		choice.setBounds(38, 382, 212, 25);
		choice.addItem("");
		choice.addItem("Fés");
		choice.addItem("Rabat");
		choice.addItem("Salé");
		choice.addItem("Kenitra");
		choice.addItem("CasaBlanca");
		choice.addItem("Tanger");
		choice.addItem("Tetouane");
		choice.addItem("Agadir");
		choice.addItem("Dakhla");
		choice.addItem("El Jadida");
		choice.addItem("Marakkech");
		choice.addItem("Taza");
		choice.addItem("El Hoceima");
		psw.add(choice);
		
		JButton signup = new JButton("Sign up");
		signup.setIcon(new ImageIcon("D:\\add-user.png"));
		signup.setBackground(new Color(230, 230, 250));
		signup.setForeground(new Color(135, 206, 250));
		signup.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		signup.setBounds(177, 427, 144, 41);
		psw.add(signup);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(28, 490, 328, 2);
		psw.add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("Already Register");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblNewLabel_6.setBounds(54, 526, 144, 28);
		psw.add(lblNewLabel_6);
		
		JLabel signin = new JLabel("");
		signin.setIcon(new ImageIcon("D:\\sign-in (1).png"));
		signin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						login login1 = new login();
						frame.setVisible(false);
						login1.setUndecorated(true);
						login1.setVisible(true);
						
					
				
			}
		});
		signin.setBounds(208, 517, 71, 69);
		psw.add(signin);
		
		
	}
}
