package Junior2013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextInLine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int one = Integer.parseInt(in.readLine());
		int two = Integer.parseInt(in.readLine());
		
		System.out.print(two + Math.abs(one-two));

	}

}
