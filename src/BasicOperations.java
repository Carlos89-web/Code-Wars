
public class BasicOperations {
	
	// https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
	
	 public static Integer basicMath(String op, int v1, int v2) {
		 
		 if (op == "+") {
			 
			 return v1+v2;
			 
		 } else if (op == "-") {
			 
			 return v1-v2;
			 
		 } else if (op == "*") {
			 
			 return v1*v2;
			 
		 } else return v1/v2;
		 
	   
	  }
	 
	 // return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);

}
