package EuclidAlgo;

public class Euclid {

	//for determining the lowerst common denominator of two numbers
	public static void main(String[] args) {
		System.out.println(gcd(90000,357));

	}
	
	public static int gcd (int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		
		return gcd(b, a%b);
	}

}
