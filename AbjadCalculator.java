import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AbjadCalculator extends JFrame implements ActionListener {

	// Require Components Declarations
	private JLabel lblInput, lblOutput;
	private JTextField txtInput, txtOutput;
	private JButton btnCalculate, btnExit;
	private JPanel panelSouth, panelNorth;
	private ImageIcon imgBackround;
	private JLabel lblBackground;

	public AbjadCalculator() {	
		// Background Customization
		imgBackround = new ImageIcon(getClass().getResource("background.jpg"));
		lblBackground = new JLabel(imgBackround);
		add(lblBackground);

		// Labels and TextFields Customization
		lblInput = new JLabel("Type your name in Arabic/Persian:");
		lblInput.setForeground(Color.white);
		txtInput = new JTextField("بسم الله الرحمن الرحیم");
		txtInput.setHorizontalAlignment(JTextField.RIGHT);
		
		lblOutput = new JLabel("Abjad calculation of your name:");
		lblOutput.setForeground(Color.white);
		txtOutput = new JTextField("786");
		
		panelNorth = new JPanel();
		panelNorth.setBackground(new Color(0, 153, 204));
		panelNorth.setLayout(new GridLayout(3, 2));

		panelNorth.add(lblInput);
		panelNorth.add(txtInput);
		panelNorth.add(lblOutput);
		panelNorth.add(txtOutput);
		add(panelNorth, BorderLayout.NORTH);

		// Buttons Customization
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(this);
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		
		panelSouth = new JPanel();
		panelSouth.setBackground(new Color(0, 153, 204));
		panelSouth.add(btnCalculate);
		panelSouth.add(btnExit);
		add(panelSouth, BorderLayout.SOUTH);

		// JFrame Customization
		setUndecorated(true);
		setSize(500, 317);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// Add action to calculation and exit buttons
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalculate) {
			int total = 0;
			String inputStr = txtInput.getText();
			for (int i = 0; i < inputStr.length(); i++) {
				total += Integer.parseInt(abjadKabir(inputStr.charAt(i)));
			}
			txtOutput.setText(String.valueOf(total));
		}
		if (e.getSource() == btnExit) {
			System.exit(0);
		}
	}

	// Abjad Kabir calculation method
	public static String abjadKabir(char ch) {
		String abjad_help = Character.toString(ch);
		String input = abjad_help.replaceAll("ا", "1").replaceAll("آ", "1")
				.replaceAll("ب", "2").replaceAll("پ", "2").replaceAll("ج", "3")
				.replaceAll("چ", "3").replaceAll("د", "4").replaceAll("ه", "5")
				.replaceAll("و", "6").replaceAll(" ", "0").replaceAll("ز", "7")
				.replaceAll("ژ", "7").replaceAll("ح", "8").replaceAll("ط", "9")
				.replaceAll("ی", "10").replaceAll("ي", "10")
				.replaceAll("ک", "20").replaceAll("گ", "20")
				.replaceAll("ل", "30").replaceAll("م", "40")
				.replaceAll("ن", "50").replaceAll("س", "60")
				.replaceAll("ع", "70").replaceAll("ف", "80")
				.replaceAll("ص", "90").replaceAll("ق", "100")
				.replaceAll("ر", "200").replaceAll("ش", "300")
				.replaceAll("ت", "400").replaceAll("ث", "500")
				.replaceAll("خ", "600").replaceAll("ذ", "700")
				.replaceAll("ض", "800").replaceAll("ظ", "900")
				.replaceAll("غ", "1000");
		return input;
	}

	public static void main(String[] args) {
		new AbjadCalculator();
	}
}