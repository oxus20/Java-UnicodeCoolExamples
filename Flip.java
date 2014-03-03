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

public class Flip extends JFrame implements KeyListener {
	// Required Components Declarations
	private JLabel lblInput, lblOutput;
	private JTextField txtInput, txtOutput;
	private JButton btnExit;
	private JPanel panelSouth, panelNorth;
	private ImageIcon imgBackground;
	private JLabel lblBackground;

	public Flip() {
		// Background Settings and Customizations
		imgBackground = new ImageIcon(getClass().getResource("background.jpg"));
		lblBackground = new JLabel(imgBackground);
		add(lblBackground);

		// Labels and TextFields Settings and Customizations
		lblInput = new JLabel("Enter Your Text:");
		lblInput.setForeground(Color.white);
		txtInput = new JTextField("Flip and Upside down");
		txtInput.addKeyListener(this);

		lblOutput = new JLabel("Result in Flip:");
		lblOutput.setForeground(Color.white);
		txtOutput = new JTextField("Ⅎן!d ɐnd ∩ds!dǝ doʍn");

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

	public void keyPressed(KeyEvent e) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtInput) {
			String input = txtInput.getText();
			String change = toFlip(input);
			txtOutput.setText(change);
		}
	}

	private String toFlip(String input) {
		String change = input.replace('a', 'ɐ').replace('b', 'q')
				.replace('c', 'ɔ').replace('d', 'p').replace('e', 'ǝ')
				.replace('f', 'ɟ').replace('g', 'ƃ').replace('h', 'ɥ')
				.replace('i', '!').replace('j', 'ɾ').replace('k', 'ʞ')
				.replace('l', 'ן').replace('m', 'ɯ').replace('n', 'u')
				.replace('o', 'o').replace('p', 'd').replace('q', 'b')
				.replace('r', 'ɹ').replace('s', 's').replace('t', 'ʇ')
				.replace('u', 'n').replace('v', 'ʌ').replace('w', 'ʍ')
				.replace('x', 'x').replace('y', 'ʎ').replace('z', 'z')
				.replace('A', '∀').replace('B', 'ᗺ').replace('C', 'Ɔ')
				.replace('D', 'p').replace('E', 'Ǝ').replace('F', 'Ⅎ')
				.replace('G', 'פ').replace('H', 'H').replace('I', 'I')
				.replace('J', 'ſ').replace('K', 'ʞ').replace('L', '˥')
				.replace('M', 'W').replace('N', 'N').replace('O', 'O')
				.replace('P', 'd').replace('Q', 'ઠ').replace('R', 'ᴚ')
				.replace('S', 'S').replace('T', '⊥').replace('U', '∩')
				.replace('V', 'ᴧ').replace('W', 'M').replace('X', 'X')
				.replace('Y', 'ʎ').replace('Z', 'Z');
		return change;
	}

	public static void main(String[] args) {
		new Flip();
	}
}