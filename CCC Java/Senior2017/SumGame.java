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
		boolean nvrMatch = false;
		for (int i = 0; i < teamOneS.length;i++) {
			oneTot += Integer.parseInt(teamOneS[i]);
			twoTot += Integer.parseInt(teamTwoS[i]);
			totDays ++;
			if (i != teamOneS.length-1) {
				if (oneTot == twoTot && oneTot+Integer.parseInt(teamOneS[i+1]) != twoTot+Integer.parseInt(teamTwoS[i+1]))
					break;
			} else if (i == teamOneS.length-1 && twoTot != oneTot) {
				nvrMatch = true;
			}
			
		}
		if (!nvrMatch)
			System.out.println(totDays);
		else 
			System.out.println(0);
	}

}
