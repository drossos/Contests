package Senior2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SnakesAndLadder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Map m = new HashMap();

		m.put(9, 34);
		m.put(40, 64);
		m.put(67, 86);

		m.put(54, 19);
		m.put(90, 48);
		m.put(90, 77);

		boolean finished = false;
		int pos = 1;
		while (!finished) {
			int temp = Integer.parseInt(in.readLine());

			if (temp != 0) {
				if (pos + temp < 101) {
					pos += temp;
					if (m.containsKey(pos)) {
						pos = (int) m.get(pos);
					}
				}

				System.out.println("You are now on square " + pos);
				if (pos == 100) {
					System.out.println("You win");
					finished = true;
				}

			} else {
				System.out.println("You Quit!");
				finished = true;
			}
		}
	}

}
