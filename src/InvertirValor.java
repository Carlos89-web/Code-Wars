
public class InvertirValor {
	
	// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/solutions
	
	public static int[] invert(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
		    array[i] *= -1;
		  }
		  
		  return array;
		  }

	
	}

