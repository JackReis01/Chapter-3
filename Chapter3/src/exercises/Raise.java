package exercises;

import javax.swing.JOptionPane;

public class Raise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String salary;
		final double RAISE_RATE = 1.10;
		double newSalary;
		salary = JOptionPane.showInputDialog(null, "what is the salary?", "Salary Input", JOptionPane.INFORMATION_MESSAGE);
		newSalary = Double.parseDouble(salary)* RAISE_RATE;
		JOptionPane.showMessageDialog(null, "Current salary: " + salary + " After raise: " + newSalary);
	}
	
}
