package CCC2012;

public class AromaticNumbers {

	public static void main(String[] args) {
		String str = "3M1D2C";
		int sum = 0;
		for (int i = 0; i < str.length() - 2; i+=2) {
		if (Integer.parseInt(str.substring(i,i+1)) < Integer.parseInt(str.substring(i+2,i+3)) && romanN(str.substring(i+1,i+2)) < romanN(str.substring(i+3,i+4))) {
			sum -= Integer.parseInt(str.substring(i,i+1)) * romanN(str.substring(i+1,i+2));
		} else {
			sum += Integer.parseInt(str.substring(i,i+1)) * romanN(str.substring(i+1,i+2));
		}
		
		}
		sum += Integer.parseInt(str.substring(str.length()-2,str.length()-1)) * romanN(str.substring(str.length()-1,str.length()));
		System.out.println(sum);
	}
	
	public static int romanN (String rom) {
		if (rom.equals("I"))
			return 1;
		else if (rom.equals("V"))
			return 5;
		else if (rom.equals("X"))
			return 10;
		else if (rom.equals("L"))
			return 50;
		else if (rom.equals("C"))
			return 100;
		else if (rom.equals("D"))
			return 500;
		else 
			return 1000;
	}

}
