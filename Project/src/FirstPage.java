

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JScrollBar;
import java.awt.Choice;
import javax.swing.JToggleButton;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JProgressBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Point;
import java.awt.Button;
import java.awt.TextField;

import java.awt.Checkbox;

public class FirstPage extends JFrame {

	private JPanel contentPane;
	private JPanel psw;
	 static JLabel icon ;
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
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setBackground(SystemColor.windowBorder);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 493);
		psw = new JPanel();
		psw.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.textInactiveText, SystemColor.textInactiveText));
		psw.setToolTipText("");
		psw.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();

			        xy = e.getY();
			}
		});
		psw.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0 ) {
				int x = arg0.getXOnScreen();

			        int y = arg0.getYOnScreen();

			        FirstPage.this.setLocation(x - xx, y - xy);  
			}
		});
		psw.setBackground(SystemColor.control);
		setContentPane(psw);
		psw.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setBounds(717, 0, 24, 48);
		lblNewLabel.setIcon(new ImageIcon("D:\\x-button.png"));
		psw.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.textInactiveText, SystemColor.textInactiveText));
		panel.setBounds(0, 0, 301, 514);
		panel.setBackground(SystemColor.scrollbar);
		psw.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Shop online");
		lblNewLabel_2.setBounds(55, 334, 199, 77);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\icons8-worldwide-delivery-64.png"));
		lblNewLabel_2.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(35, 38, 143, 133);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Master-Card-Electronic-icon.png"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(152, 105, 162, 128);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Paypal-icon.png"));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(35, 188, 128, 80);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Visa-icon.png"));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Try it now...");
		lblNewLabel_5.setBounds(105, 395, 113, 32);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_1.setBounds(192, 11, 99, 59);
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\icons8-worldwide-delivery-64.png"));
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(SystemColor.inactiveCaption);
		panel.add(lblNewLabel_2_1);
		
		JButton sign = new JButton("Already Registered");
		sign.setBackground(SystemColor.scrollbar);
		sign.setBounds(465, 429, 223, 38);
		psw.add(sign);
		sign.setIcon(new ImageIcon("D:\\user.png"));
		sign.setForeground(Color.BLACK);
		sign.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblNewLabel_6 = new JLabel("Register Now ");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\verify.png"));
		lblNewLabel_6.setBackground(SystemColor.window);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_6.setBounds(323, 38, 210, 38);
		psw.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.scrollbar);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.activeCaptionBorder, SystemColor.activeCaptionBorder));
		panel_1.setBounds(317, 38, 192, 38);
		psw.add(panel_1);
		
		JLabel lblNewLabel_7 = new JLabel("First Name");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(361, 91, 100, 17);
		psw.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(487, 87, 234, 28);
		psw.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7_2 = new JLabel("Last Name");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2.setBounds(361, 132, 100, 17);
		psw.add(lblNewLabel_7_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(487, 128, 234, 28);
		psw.add(textField_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("City");
		lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2_1.setBounds(370, 247, 91, 17);
		psw.add(lblNewLabel_7_2_1);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Dialog", Font.BOLD, 14));
		choice.setBounds(487, 247, 234, 38);
		psw.add(choice);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("Phone Number");
		lblNewLabel_7_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2_1_1.setBounds(361, 171, 116, 17);
		psw.add(lblNewLabel_7_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(487, 167, 234, 28);
		psw.add(textField_2);
		
		JLabel lblNewLabel_7_2_1_1_1 = new JLabel("Birthday");
		lblNewLabel_7_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_2_1_1_1.setBounds(361, 212, 116, 17);
		psw.add(lblNewLabel_7_2_1_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 13));
		spinner.setModel(new SpinnerDateModel(new Date(1634425200000L), new Date(1634425200000L), null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(487, 208, 234, 28);
		psw.add(spinner);
		
		Checkbox checkbox = new Checkbox("I Agree That all information is right");
		checkbox.setFont(new Font("Dialog", Font.BOLD, 12));
		checkbox.setBounds(507, 288, 214, 28);
		psw.add(checkbox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(343, 81, 388, 293);
		psw.add(panel_2);
		panel_2.setLayout(null);
		
		JButton sign_1 = new JButton("Register");
		sign_1.setBounds(75, 249, 234, 33);
		panel_2.add(sign_1);
		sign_1.setBackground(SystemColor.scrollbar);
		sign_1.setIcon(new ImageIcon("D:\\add-people-interface-symbol-of-black-person-close-up-with-plus-sign-in-small-circle.png"));
		sign_1.setForeground(Color.BLACK);
		sign_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.windowBorder);
		separator.setBounds(297, 399, 457, 2);
		psw.add(separator);
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

		sign.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
	sign sign1 = new sign();
				sign1.setVisible(true);
				*/
			}
		});
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
