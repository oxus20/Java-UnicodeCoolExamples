import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersianNumbers extends JFrame implements KeyListener {
	// Declaring Components
	private JLabel lblInput, lblOutput;
	private JTextField txtInput, txtOutput;
	private JButton btnExit;
	private JPanel panelSouth, panelNorth;
	private ImageIcon imgBackground;
	private JLabel lblBackground;

	public PersianNumbers() {

		// Background Settings and Customizations
		imgBackground = new ImageIcon(getClass().getResource("background.jpg"));
		lblBackground = new JLabel(imgBackground);
		add(lblBackground);

		// Labels and TextFields Settings and Customizations

		lblInput = new JLabel("Enter English Number :");
		lblInput.setForeground(Color.white);
		txtInput = new JTextField("0123456789");
		txtInput.addKeyListener(this);

		lblOutput = new JLabel("Result of Persion Number :");
		lblOutput.setForeground(Color.white);
		txtOutput = new JTextField("٠١٢٣٤٥٦٧٨٩");

		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(0, 153, 204));
		panelNorth.setLayout(new GridLayout(2, 2, 0, 2));
		panelNorth.add(lblInput);
		panelNorth.add(txtInput);
		panelNorth.add(lblOutput);
		panelNorth.add(txtOutput);
		add(panelNorth, BorderLayout.NORTH);

		// Exit Button Settings and Customizations
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelSouth = new JPanel();
		panelSouth.setBackground(new Color(0, 153, 204));
		panelSouth.add(btnExit);
		add(panelSouth, BorderLayout.SOUTH);

		// JFrame Settings and Customizations
		setUndecorated(true);
		setSize(500, 317);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void keyPressed(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtInput) {
			String input = txtInput.getText();
			String change = digitToFarsi(input);
			txtOutput.setText(change);
		}
	}

	private String digitToFarsi(String input) {
		String change = input.replace('0', '\u0660').replace('1', '\u0661')
				.replace('2', '\u0662').replace('3', '\u0663')
				.replace('4', '\u0664').replace('5', '\u0665')
				.replace('6', '\u0666').replace('7', '\u0667')
				.replace('8', '\u0668').replace('9', '\u0669');
		return change;
	}

	public static void main(String[] args) {
		new PersianNumbers();
	}
}