package App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class login extends JFrame {

	private JPanel contentPane;
	private JPanel psw;
	int xx , xy;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 581);
		psw = new JPanel();
		psw.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();

		        int y = e.getYOnScreen();

		        login.this.setLocation(x - xx, y - xy);  
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
		
		JLabel lblNewLabel_4 = new JLabel("Login to start the online purchase");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\login.png"));
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 24));
		lblNewLabel_4.setBounds(0, 21, 364, 78);
		psw.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setIcon(new ImageIcon("D:\\user (1).png"));
		lblNewLabel_5.setBounds(10, 132, 164, 41);
		psw.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(71, 171, 181, 30);
		psw.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Phone Number");
		lblNewLabel_5_1.setIcon(new ImageIcon("D:\\phone-call.png"));
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(26, 212, 164, 41);
		psw.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 251, 181, 30);
		psw.add(textField_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Code Cli");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("D:\\password (1).png"));
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1_1.setBounds(10, 292, 149, 47);
		psw.add(lblNewLabel_5_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(71, 335, 181, 30);
		psw.add(textField_2);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("D:\\sign-in (3).png"));
		btnNewButton.setBounds(103, 409, 149, 41);
		psw.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Forgot Code Cli?");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\forgot (1).png"));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(100, 149, 237));
		lblNewLabel_6.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
		lblNewLabel_6.setBounds(139, 367, 217, 41);
		psw.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Back To Register");
		btnNewButton_1.setForeground(new Color(100, 149, 237));
		btnNewButton_1.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		btnNewButton_1.setIcon(new ImageIcon("D:\\return.png"));
		btnNewButton_1.setBounds(0, 526, 198, 30);
		psw.add(btnNewButton_1);

}
}