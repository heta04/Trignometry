import java.util.*;

public class Trignometic {

	static double pie=3.141592653589793;
	
	
		static double power(double num, int pow) {

		double result = 1;

		while (pow > 0) {

			result *= num;

			pow--;
		}
			return result;
		}


	
		static int fact(int num) 
		{ 
			if (num == 0) 
	        return 1; 
	  
			// To store factorial of the number 
			int fact = 1; 
			for (int i = 1; i <= num; i++) 
	        fact = fact * i; 
	  
			// Return the factorial of a number 
			return fact; 
		} 
	
		public static double toradian(double degree) {
			 // to do ....
			
			return degree*(pie/180);
			
			
		}
		
		 public static double sine2(double x){
			 
			 int status=0;
			 if(x<0) {
				 x=x*-1;
				 status=1;
			 }
			 
			 double sin=x,term, numerator=x, denominator=1, 
		        		xsquare=x*x, factorial=1, sign=-1;
		        do{
		            numerator *= xsquare;
		            denominator=denominator*(factorial+1)*(factorial+2);
		            factorial=factorial+2;
		            term=numerator/denominator;
		            sin=sin+(sign*term);
		            sign*=-1;
		        }
		        while(term>0.00);
		        
		        return status==1?-1*sin:sin;
			 
			 
		 }
		 
		 
		 
		 
		 public static double cos(double x){
			 
			 int status=0;
			 if(x<0) {
				 x=x*-1;
				 status=1;
			 }
			 
			 double cos=1,term, numerator=1, denominator,sign=-1;
			 int f=2,p=2;
			 
		        do{
		            numerator=power(x,p);
		            p+=2;
		            denominator=fact(f);
		            f+=2;
		            term=numerator/denominator;
		            cos=cos+(sign*term);
		            sign*=-1;
		            
		        }
		        while(term>=0.0);
		        
		        return cos;
			 
			 
		        
		 }
		  
		 		 
		 public static double tan(double x){
			 
			 return sine2(x)/cos(2);
		 }
		 
	
	 
	    public static void main(String args[]){
	    	
	    	System.out.println(Math.cos(0.7853981633974483)+" "+cos(0.7853981633974483));
	    	System.out.println(Math.sin(0.7853981633974483)+" "+sine2(0.7853981633974483));
		System.out.println(Math.tan(0.7853981633974483)+" "+tan(0.7853981633974483));

	        
	    }
	}


