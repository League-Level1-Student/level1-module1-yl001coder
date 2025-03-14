package Calculator;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class caculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean caculator = true;
		JPanel panel = new JPanel();
		while(caculator == true) {
			String  de = "";
			de = JOptionPane.showInputDialog(panel,"welcome to da caculator. whats your first number?");
			int num1 = Integer.parseInt(de);
			String e = "";
			e = JOptionPane.showInputDialog(panel, "whats your second number?");
			int num2 = Integer.parseInt(e);
			String d = "";
			d = JOptionPane.showInputDialog("what is your operator?");
			if(d.equals("+"))
			{
				int num3 = num1 + num2;
				JOptionPane.showMessageDialog(panel, "your number is " + num3);
			}
			else if(d.equals("-"))
			{
				int num3 = num1 - num2;
				JOptionPane.showMessageDialog(panel, "your number is " + num3);
			}
			else if(d.equals("x")||(d.equals("*")))
			{
				int num3 = num1 * num2;
				JOptionPane.showMessageDialog(panel, "your number is " + num3);
			}
			else if(d.equals("/"))
			{
				int num3 = num1/num2;
				JOptionPane.showMessageDialog(panel, "your number is " + num3);
			}
			else if(d.equals("%"))
			{
				int num3 = num1%num2;
				JOptionPane.showMessageDialog(panel, "your number is " + num3);
			}
			String exit = "";
			exit = JOptionPane.showInputDialog(panel, "do ya wanna leave?");
			if(exit.equalsIgnoreCase("yes")||(exit.equalsIgnoreCase("Y")))
			{
				JOptionPane.showMessageDialog(panel, "ok bye");
				caculator = false;
			}
			else
			{
				
			}		}
	}

}
