
public class OldCar {
	
	// https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java
	
	public static void main(String[] args) {
		
		System.out.println(bumps(""));
		
	}
	
	public static String bumps(final String road) {
		
		int result = 0;
		
		for (char dead : road.toCharArray()) {
			
			if (dead == 'n') result +=1;
			
		}
		
		return (result<15)? "Woohoo!" : "Car Dead";
		
	}

}
