import javax.swing.JOptionPane;

public class Sheeps {
	
	// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
	
	public static void main(String[] args) {
		
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Sheeps??"));
		
		for (int i = num; i>0;i--) {
			System.out.println(num--+" sheep...");
		}
		
	   
	}
	
	public static String countingSheep(int num) {
	    
		num = Integer.parseInt(JOptionPane.showInputDialog("Sheeps??"));
		
		for (int i = num; i>0;i--) {
			System.out.println(num--+" sheep...");
		}
		
	    return "";
	  }

}
