package DMOPC17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FujoNeko {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int rows = Integer.parseInt(tokens[0]);
		int cols = Integer.parseInt(tokens[1]);

		FujoNeko fn = new FujoNeko();
		ArrayList<Cordinate> creeps = new ArrayList();

		for (int i = 0; i < rows; i++) {
			String[] line = in.readLine().split("");
			for (int j = 0; j < line.length; j++) {
				if (line[j].equals("X"))
					creeps.add(fn.new Cordinate(j+1, i+1));
			}
		}
		int temp = Integer.parseInt(in.readLine());
		for (int i = 0; i < temp; i++) {
			String[] places = in.readLine().split(" ");
			int xTemp = Integer.parseInt(places[0]);
			int yTemp = Integer.parseInt(places[1]);
			boolean sees = false;
			for (int j = 0; j < creeps.size(); j++) {
				if (xTemp == creeps.get(j).x || yTemp == creeps.get(j).y)
					sees = true;
			}
			if (sees)
				System.out.println("Y");
			else
				System.out.println("N");

		}
	}

		class Cordinate {
			public int x;
			public int y;

			public Cordinate(int x, int y) {
				this.x = x;
				this.y = y;
			}
		}

	
}