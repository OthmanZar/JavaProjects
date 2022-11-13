package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import javax.swing.JSlider;

public class products extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					products frame = new products();
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
	public products() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1011, 587);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 985, 512);
		contentPane.add(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setForeground(Color.DARK_GRAY);
		tabbedPane.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		scrollPane.setViewportView(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Android Application", new ImageIcon("D:\\application-mobile.png"), panel, null);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		tabbedPane.addTab("Desktop Application", new ImageIcon("D:\\pc.png"), panel_1, null);
		tabbedPane.setForegroundAt(1, Color.DARK_GRAY);
		tabbedPane.setEnabledAt(1, true);
		tabbedPane.setDisabledIconAt(1, new ImageIcon("D:\\pc.png"));
		tabbedPane.setBackgroundAt(1, Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Ios Application", new ImageIcon("D:\\telephone-intelligent.png"), panel_2, null);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Web Application", new ImageIcon("D:\\application.png"), panel_3, null);
		
		lblNewLabel.setIcon(new ImageIcon("D:\\delete-icon.png"));
		lblNewLabel.setBounds(983, 0, 53, 31);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setEnabled(false);
		menuBar.setBounds(320, 25, 450, 40);
		contentPane.add(menuBar);
		
		JPanel panel_4 = new JPanel();
		menuBar.add(panel_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Profile");
		mntmNewMenuItem_2.setIcon(new ImageIcon("D:\\user (1).png"));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		panel_4.add(mntmNewMenuItem_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Settings");
		mntmNewMenuItem_1.setIcon(new ImageIcon("D:\\gear.png"));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		menuBar.add(mntmNewMenuItem_1);
	}
}
