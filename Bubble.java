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

public class Bubble extends JFrame implements ActionListener, KeyListener {
	// Declaring Components
	private JLabel lblInput, lblOutput;
	private JTextField txtInput, txtOutput;
	private JButton btnExit;
	private JPanel panelSouth, panelNorth;
	private ImageIcon imgBackground;
	private JLabel lblBackground;

	public Bubble() {
		// Background Settings and Customizations
		imgBackground = new ImageIcon(getClass().getResource("background.jpg"));
		lblBackground = new JLabel(imgBackground);
		add(lblBackground);

		// Labels and TextFields Settings and Customizations
		lblInput = new JLabel("Enter Your Text:");
		lblInput.setForeground(Color.white);
		txtInput = new JTextField("OXUS20");
		txtInput.addKeyListener(this);

		lblOutput = new JLabel("Result in Bubble:");
		lblOutput.setForeground(Color.white);
		txtOutput = new JTextField("ⓄⓍⓊⓈ➁ⓞ");

		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(0, 153, 204));
		panelNorth.setLayout(new GridLayout(2, 2, 9, 2));
		panelNorth.add(lblInput);
		panelNorth.add(txtInput);
		panelNorth.add(lblOutput);
		panelNorth.add(txtOutput);
		add(panelNorth, BorderLayout.NORTH);

		// Exit Button Settings and Customizations
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
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

	// Adding Action to our program
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit) {
			System.exit(0);
		}
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtInput) {
			String input = txtInput.getText();
			String change = toBubble(input);
			txtOutput.setText(change);
		}
	}

	private String toBubble(String input) {
		String change = input.replace('0', 'ⓞ').replace('1', '➀')
				.replace('2', '➁').replace('3', '➂').replace('4', '➃')
				.replace('5', '➄').replace('6', '➅').replace('7', '➆')
				.replace('8', '➇').replace('9', '➈').replace('a', 'ⓐ')
				.replace('b', 'ⓑ').replace('c', 'ⓒ').replace('d', 'ⓓ')
				.replace('e', 'ⓔ').replace('f', 'ⓕ').replace('g', 'ⓖ')
				.replace('h', 'ⓗ').replace('i', 'ⓘ').replace('j', 'ⓙ')
				.replace('k', 'ⓚ').replace('l', 'ⓛ').replace('m', 'ⓜ')
				.replace('n', 'ⓝ').replace('o', 'ⓞ').replace('p', 'ⓟ')
				.replace('q', 'ⓠ').replace('r', 'ⓡ').replace('s', 'ⓢ')
				.replace('t', 'ⓣ').replace('u', 'ⓤ').replace('v', 'ⓥ')
				.replace('w', 'ⓦ').replace('x', 'ⓧ').replace('y', 'ⓨ')
				.replace('z', 'ⓩ').replace('A', 'Ⓐ').replace('B', 'Ⓑ')
				.replace('C', 'Ⓒ').replace('D', 'Ⓓ').replace('E', 'Ⓔ')
				.replace('F', 'Ⓕ').replace('G', 'Ⓖ').replace('H', 'Ⓗ')
				.replace('I', 'Ⓘ').replace('J', 'Ⓙ').replace('K', 'Ⓚ')
				.replace('L', 'Ⓛ').replace('M', 'Ⓜ').replace('N', 'Ⓝ')
				.replace('O', 'Ⓞ').replace('P', 'Ⓟ').replace('Q', 'Ⓠ')
				.replace('R', 'Ⓡ').replace('S', 'Ⓢ').replace('T', 'Ⓣ')
				.replace('U', 'Ⓤ').replace('V', 'Ⓥ').replace('W', 'Ⓦ')
				.replace('X', 'Ⓧ').replace('Y', 'Ⓨ').replace('Z', 'Ⓩ');
		return change;
	}

	public static void main(String[] args) {
		new Bubble();
	}
}