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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class statsScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statsScreen frame = new statsScreen();
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
	public statsScreen() {
		setTitle("JTG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Set the character stats");
		lblNewLabel.setFont(new Font("DMC5Font", Font.PLAIN, 63));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 520, 153);
		contentPane.add(lblNewLabel);

		JSlider Attack = new JSlider();
		Attack.setBackground(new Color(0, 0, 0));
		Attack.setMinimum(1);
		Attack.setMaximum(5);
		Attack.setBounds(223, 292, 200, 40);
		int  valueATk = Attack.getValue();
		contentPane.add(Attack);

		JSlider Life = new JSlider();
		Life.setBackground(new Color(0, 0, 0));
		Life.setMinimum(1);
		Life.setMaximum(10);
		Life.setBounds(223, 241, 200, 40);
		int valueHP = Life.getValue();
		contentPane.add(Life);

		JLabel lblATK = new JLabel(String.valueOf(valueATk));
		lblATK.setHorizontalAlignment(SwingConstants.CENTER);
		lblATK.setForeground(Color.WHITE);
		lblATK.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblATK.setBounds(184, 284, 39, 48);
		contentPane.add(lblATK);

		JLabel lblHP = new JLabel(String.valueOf((valueHP)));
		lblHP.setHorizontalAlignment(SwingConstants.CENTER);
		lblHP.setForeground(Color.WHITE);
		lblHP.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblHP.setBounds(184, 233, 39, 48);
		contentPane.add(lblHP);
		Attack.addChangeListener(e -> {
			int value = Attack.getValue();
			lblATK.setText(String.valueOf(value));
		});
		Life.addChangeListener(e -> {
			int value = Life.getValue();
			lblHP.setText(String.valueOf(value));
		});

		txtName = new JTextField();
		txtName.setFont(new Font("DMC5Font", Font.PLAIN, 38));
		txtName.setBounds(223, 169, 200, 61);
		contentPane.add(txtName);
		txtName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("DMC5Font", Font.PLAIN, 63));
		lblNewLabel_1.setBounds(10, 167, 193, 63);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Life(HP)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblNewLabel_1_1.setBounds(10, 233, 193, 48);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Attack(ATK)");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("DMC5Font", Font.PLAIN, 35));
		lblNewLabel_1_1_1.setBounds(10, 292, 193, 48);
		contentPane.add(lblNewLabel_1_1_1);

		JButton btnNewButton = new JButton("Go!!!");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        player p = new player();
		        p.setName(txtName.getText());
		        p.setHP(Integer.parseInt(lblHP.getText()));
		        p.setATK(Integer.parseInt(lblATK.getText())); 

		        mainScreen frame = new mainScreen(p);
		        dispose();
		        frame.setVisible(true);
		        frame.setLocationRelativeTo(null);
		        frame.setResizable(false);
		    }
		});

		btnNewButton.setFont(new Font("DMC5Font", Font.PLAIN, 40));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(433, 224, 97, 70);
		contentPane.add(btnNewButton);

	}
}
