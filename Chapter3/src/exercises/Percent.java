package exercises;

import javax.swing.JOptionPane;

public class Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String StFirst;
		String StSecond;
		double first;
		double second;
		StFirst = JOptionPane.showInputDialog(null, "what is the number?", "Number Input", JOptionPane.INFORMATION_MESSAGE);
		StSecond = JOptionPane.showInputDialog(null, "what is the number?", "Number Input 2", JOptionPane.INFORMATION_MESSAGE);
		first = Double.parseDouble(StFirst);
		second = Double.parseDouble(StSecond);
		computePercent(first, second);
	}
	public static void computePercent(double first, double second)
	{
		double ans;
		double percent;
		ans = first / second; 
		percent = ans * 100;
		JOptionPane.showMessageDialog(null, first + " is " + percent + " percent of " + second);
	}
}
