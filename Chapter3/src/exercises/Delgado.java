package exercises;
import javax.swing.JOptionPane;
public class Delgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String order;
		String tacoOrder;
		String burritoOrder;
		String saladOrder;
		String guacomoleOrder;
		String salsaOrder;
		String waterOrder;
		String nachoOrder;
		String burgerOrder;
		String fajitaOrder;
		String secretOrder;
		double taco;
		double burrito;
		double salad;
		double guacomole;
		double salsa;
		double water;
		double nacho;
		double burger;
		double fajita;
		double secretStuff;
		order = JOptionPane.showInputDialog(null, "Welcome to Delgados tacos! What would you like to order?", "order", JOptionPane.INFORMATION_MESSAGE);
		
		
		if (order.equals("taco")||order.equals("Taco")) {
			tacoOrder = JOptionPane.showInputDialog(null, "They are 1.99. How many?", "Tacos", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("burrito")||order.equals("Burrito")) {
			burritoOrder = JOptionPane.showInputDialog(null, "They are 2.99. How many?", "Burrito", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("salad")||order.equals("Salad")) {
			saladOrder = JOptionPane.showInputDialog(null, "They are 1.99. How many?", "salad", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("guacomole")||order.equals("Guacomole")) {
			guacomoleOrder = JOptionPane.showInputDialog(null, "It is .99 cents. How many?", "Guacomole", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("salsa")||order.equals("Salsa")) {
			salsaOrder = JOptionPane.showInputDialog(null, "It is .99 cents. How many?", "Salsa", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("water")||order.equals("Water")) {
			waterOrder = JOptionPane.showInputDialog(null, "It is .99 cents. How many?", "Water", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("nacho")||order.equals("Nacho")) {
			nachoOrder = JOptionPane.showInputDialog(null, "They are 1.99. How many?", "Nacho", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("burger")||order.equals("Burger")) {
			burgerOrder = JOptionPane.showInputDialog(null, "They are 1.99. How many?", "Burger", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("fajita")||order.equals("Fajita")) {
			fajitaOrder = JOptionPane.showInputDialog(null, "They are 1.99. How many?", "Fajita", JOptionPane.INFORMATION_MESSAGE);}
		if (order.equals("illegal drugs")||order.equals("Secret Stuff")) {
			secretOrder = JOptionPane.showInputDialog(null, "It is 20.00. How many?", "Normal window", JOptionPane.INFORMATION_MESSAGE);}
		
		taco = Double.parseDouble(tacoOrder);
		burrito = Double.parseDouble(burritoOrder);
		salad = Double.parseDouble(saladOrder);
		guacomole = Double.parseDouble(guacomoleOrder);
		salsa = Double.parseDouble(salsaOrder);
		water = Double.parseDouble(waterOrder);
		nacho = Double.parseDouble(nachoOrder);
		burger = Double.parseDouble(burgerOrder);
		fajita = Double.parseDouble(fajitaOrder);
		secretStuff = Double.parseDouble(secretOrder);
	}

}
