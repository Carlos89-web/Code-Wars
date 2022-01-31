
public class BuenasIdeas {
	
	// https://www.codewars.com/kata/57f222ce69e09c3630000212/solutions
	
	public static String well(String[] x) {

		int count = 0;
	      for (String s : x) {
	         if (s.equals("good")) count++;
	         if (count > 2) return "I smell a series!";
	      }
	      if (count != 0) return "Publish!";
	      return "Fail!";
		
	  }

}
