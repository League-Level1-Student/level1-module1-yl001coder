package _11_binary_converter;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class Binary implements ActionListener{
	JTextField answer = new JTextField(20);
	JButton button = new JButton();
	JFrame frame = new JFrame("Convert 8 bits of binary to ASCII");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		new Binary().run();
	}
	void run() {
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.setSize(70,70);
		frame.add(panel);
		panel.add(button);
		panel.add(answer);
		panel.add(label);
		button.setText("convert");
		button.addActionListener(this);
		answer.setVisible(true);
		button.setVisible(true);
		label.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent arg0)
	{
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button))
		{
			label.setText(convert(answer.getText()));
		}
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

}
