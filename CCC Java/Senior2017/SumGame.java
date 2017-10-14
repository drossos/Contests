package Senior2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int numGames = Integer.parseInt(read.readLine());
		String [] teamOneS = read.readLine().split(" ");
		String [] teamTwoS = read.readLine().split(" ");
		int oneTot = 0;
		int twoTot = 0;
		int totDays = 0;
		for (int i = 0; i < teamOneS.length;i++) {
			oneTot += Integer.parseInt(teamOneS[i]);
			twoTot += Integer.parseInt(teamTwoS[i]);
			
			if (oneTot == twoTot)
				totDays = i+1;
			else 
				break;
		}
		System.out.println(totDays);
	}

}
