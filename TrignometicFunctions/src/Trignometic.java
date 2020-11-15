import java.util.*;

public class Trignometic {

	static double pie = 3.141592653589793;					//assign the value of pie

	static double power(double num, int pow) {

		double result = 1;
		try {
			
			//directly return 1 if the power if 0 
			if (pow == 0)
				result = 1;

			//throw exception if the power is in negative
			else if (pow < 0)
				throw new Exception("Negative number not allowed");

			else {

				while (pow > 0)
				{

					result *= num;

					pow--;
				}

			}
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return result;

	}

	static int fact(int num) {
		if (num == 0)
			return 1;

		//store factorial of the number
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact = fact * i;

		// Return the factorial 
		return fact;
	}

	public static double toradian(double degree) {
		
		return degree*(pie/180);
	}

	public static double sine2(double x) {

		double sin = x, term, numerator = x, denominator = 1, xsquare = x * x, factorial = 1, sign = -1;
		do {
			numerator *= xsquare;												//calculates the numerator part of the taylor series
			denominator = denominator * (factorial + 1) * (factorial + 2);		//calculates the denominator part of the taylor series
			factorial = factorial + 2;
			term = numerator / denominator;
			sin = sin + (sign * term);											//adds up the series and assigns proper sign of either + or -
			sign *= -1;
		} while (term > 0.00);

		return sin;																//return the value of sin(x)

	}

	public static double cos(double x) {
		double cos = 1, term, numerator = 1, denominator, sign = -1;
		int i = 2;

		do {
			numerator = power(x, i);				//calculates the numerator part of the taylor series
			denominator = fact(i);				    //calculates the denominator part of the taylor series
			term = numerator / denominator;
			cos = cos + (sign * term);			   //adds up the series and assigns proper sign of either + or -
			sign *= -1;
			i += 2;

		} while (i <= 13);

		return cos;									//return the value of cos(x)

	}

	public static double tan(double x) {

		return sine2(x) / cos(x);				//returns the value of tan(x) because tan(x)=sin(x)/cos(x)
	}

	public static void main(String args[]) {

		int c=0;
		double x = 0,rad;

		
		
		System.out.println("1. Radian \n2. Degree");
		System.out.println("Choose the type of input");
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		
		System.out.println("Enter the value of x in radian : ");
		x = sc.nextDouble();

		switch(c) {
		case 1:
			System.out.println("sin(" + x + ") = " + sine2(x));
			System.out.println("cos(" + x + ") = " + cos(x));
			System.out.println("tan(" + x + ") = " + tan(x));
			break;
			
		case 2:
			rad=toradian(x);
			System.out.println("sin(" + x + ") = " + sine2(rad));
			System.out.println("cos(" + x + ") = " + cos(rad));
			System.out.println("tan(" + x + ") = " + tan(rad));
			break;
			
		default:
			System.out.println("Choose a proper type of output output");
		}
		
		

		sc.close();

	}
}
