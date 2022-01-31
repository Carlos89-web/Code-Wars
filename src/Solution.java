
public class Solution {
	
	public static void main(String[] args) {
		

		// https://www.codewars.com/kata/517abf86da9663f1d2000003/solutions

	}
	
	static String toCamelCase(String s){

		 StringBuilder a = new StringBuilder();
	     for(int i = 0; i < s.length(); i++) {
	          if(s.charAt(i) == '-' || s.charAt(i) == '_') {
	             a.append(Character.toUpperCase(s.charAt(i + 1))); 
	             i++;
	             continue;      
	          }else {
	             a.append(s.charAt(i));
	          }
	       
	      
	       
	     }
	    return String.valueOf(a);
	    
	}

}
