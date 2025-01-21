package vision;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class titleScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					titleScreen frame = new titleScreen();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public titleScreen() {
		setTitle("JTG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		int bordax = 424;
		int borday = 149;
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon(titleScreen.class.getResource("/imgs/title.png")).getImage()
				.getScaledInstance(bordax, borday, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(0, 0, 540, 249);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statsScreen frame= new statsScreen();
				dispose();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
			}
		});
		btnNewButton.setBounds(10, 260, 151, 48);
		btnNewButton.setFont(new Font("DMC5Font", Font.PLAIN, 40));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(379, 260, 151, 48);
		btnNewButton_1.setFont(new Font("DMC5Font", Font.PLAIN, 40));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Credits");
		btnNewButton_2.setBounds(184, 260, 176, 48);
		btnNewButton_2.setFont(new Font("DMC5Font", Font.PLAIN, 40));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		contentPane.add(btnNewButton_2);
	}
}
