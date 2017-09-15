package exercises;
import javax.swing.JOptionPane;
public class Num4 {

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
		twiceTheNum(first, second);
		five(first, second);
		squared(first, second);
	}
	public static void twiceTheNum(double first, double second)
	{
		double firstNum;
		double secondNum;
		firstNum = first * 2;
		secondNum = second * 2;
		JOptionPane.showMessageDialog(null, firstNum);
		JOptionPane.showMessageDialog(null, secondNum);
		
	}
	public static void five(double first, double second)
	{
		double sum1;
		double sum2;
		sum1 = first + 5;
		sum2 = second + 5;
		JOptionPane.showMessageDialog(null, sum1);
		JOptionPane.showMessageDialog(null, sum2);
		
	}
	public static void squared(double first, double second) {
		double ans1;
		double ans2;
		ans1 = first * first;
		ans2 = second * second;
		JOptionPane.showMessageDialog(null, ans1);
		JOptionPane.showMessageDialog(null, ans2);
		
	}

}