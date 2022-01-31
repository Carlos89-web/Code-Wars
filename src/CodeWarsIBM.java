
public class CodeWarsIBM {
	
	// https://www.codewars.com/kata/57a429e253ba3381850000fb/solutions/java/me/best_practice

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

public static String bmi(double weight, double height) {

	double imc = weight / (Math.pow(height, 2));
	
	if(imc <= 18.5) {
		
		return "Underweight";
	}
	
	else if(imc <= 25.0) {
		
		return "Normal";
	}
	
	else if(imc <= 30.0) {
		
		return "Overweight";
	}else {
		
		return "Obese";
	}
	
  }

}
	