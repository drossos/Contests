package Senior2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleChoice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int numQ = Integer.parseInt(in.readLine());
		int correct = 0;
		String [] resp = new String [numQ];
		
		for (int i=0; i < resp.length;i++) {
			resp[i] = in.readLine();
		}
		
		for (int i=0; i < resp.length;i++) {
			if (in.readLine().equals(resp[i]))
				correct++;
		}
		
		System.out.println(correct);

	}

}
