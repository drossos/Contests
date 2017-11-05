package TLEOct17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadadr {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String raw = input.readLine();
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		//String toPrint = "(";
		int numBrackets = 0;
		for (int i = 2; i < raw.length() - 4; i++) {
			if (i != raw.length() - 5) {
				if (raw.charAt(i) == 'a') {
					sb.append("car (");
					numBrackets++;
				} else if (raw.charAt(i) == 'd') {
					sb.append("cdr (");
					numBrackets++;
				}
			} else {
				if (raw.charAt(i) == 'a') {
					sb.append("car x");
					numBrackets++;
				} else if (raw.charAt(i) == 'd') {
					sb.append("cdr x");
					numBrackets++;
				}
			}
		}

		for (int i = 0; i < numBrackets; i++) {
			sb.append(")");
		}

		System.out.print(sb.toString());

	}
}
