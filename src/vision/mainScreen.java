package vision;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.player;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String choice = "";

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 * 
	 * @param p
	 */
	public mainScreen(player p) {
		setTitle("JTG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("The character stats");
		lblNewLabel.setFont(new Font("DMC5Font", Font.PLAIN, 63));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 520, 153);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("DMC5Font", Font.PLAIN, 63));
		lblNewLabel_1.setBounds(10, 128, 193, 63);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Life(HP)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblNewLabel_1_1.setBounds(184, 144, 193, 48);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Attack(ATK)");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblNewLabel_1_1_1.setBounds(347, 144, 193, 48);
		contentPane.add(lblNewLabel_1_1_1);
		System.out.println(p.getName());

		JLabel lblNewLabel_1_1_2_1_1 = new JLabel(p.getName());
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblNewLabel_1_1_2_1_1.setBounds(49, 203, 134, 48);
		contentPane.add(lblNewLabel_1_1_2_1_1);

		JLabel lblATK = new JLabel(String.valueOf(p.getATK()));
		lblATK.setHorizontalAlignment(SwingConstants.CENTER);
		lblATK.setForeground(Color.WHITE);
		lblATK.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblATK.setBounds(414, 203, 39, 48);
		contentPane.add(lblATK);

		JLabel lblHP = new JLabel(String.valueOf(p.getHP()));
		lblHP.setHorizontalAlignment(SwingConstants.CENTER);
		lblHP.setForeground(Color.WHITE);
		lblHP.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblHP.setBounds(263, 203, 39, 48);
		contentPane.add(lblHP);

		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice = "Sim";
			}
		});
		btnYes.setForeground(Color.WHITE);
		btnYes.setFont(new Font("DMC5Font", Font.PLAIN, 40));
		btnYes.setBackground(Color.BLACK);
		btnYes.setBounds(137, 468, 97, 40);
		contentPane.add(btnYes);

		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice = "Não";
			}
		});
		btnNo.setForeground(Color.WHITE);
		btnNo.setFont(new Font("DMC5Font", Font.PLAIN, 40));
		btnNo.setBackground(Color.BLACK);
		btnNo.setBounds(305, 468, 97, 40);
		contentPane.add(btnNo);
		
		int cont = 1;
		String Dialog = "";
		if (cont == 1) {
			Dialog = "JTG\n" + "Está pronto pra começar\n" + "Este jogo usa apenas 2(dois) botões de sim ou não";
			if (choice.equals("Sim")) {
			    Dialog = "Sim";
			}
			if (choice.equals("Não")) {
			    Dialog = "Não";
			}
		}
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText(Dialog.toString());
		textPane.setBounds(49, 280, 443, 177);
		contentPane.add(textPane);

		

	}
}
