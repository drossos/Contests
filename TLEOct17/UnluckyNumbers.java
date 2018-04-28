package TLEOct17;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Arrays;
	
	public class UnluckyNumbers {
	
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int numUnlucky = Integer.parseInt(input.readLine());
			String [] unLuckFloorsS = input.readLine().split(" ");
			int [] unLuckFloors = new int[unLuckFloorsS.length];
			for (int i = 0; i < numUnlucky; i++) {
				unLuckFloors[i] = Integer.parseInt(unLuckFloorsS[i]);
			}
			Arrays.sort(unLuckFloors);
			int numApp = Integer.parseInt(input.readLine());
			int actFloors = 0;
			int lessThan = 0;
			int [][] prevSln = new int[numApp][2];
			for (int i = 0; i < numApp;i++) {
				lessThan = 0;
				actFloors = Integer.parseInt(input.readLine());
				int toStart = 0;
				if (0 != i && prevSln[i-1][0] < actFloors) {
					toStart = prevSln[i-1][1];
					lessThan +=prevSln[i-1][1];
					
				}
				for (int j = toStart; j < unLuckFloorsS.length;j++) {
					if (actFloors> unLuckFloors[j])
						lessThan++;
				}
				prevSln[i][0] = actFloors;
				prevSln[i][1] = lessThan;
				System.out.println(actFloors-lessThan);
			}
	
		}
	
	}
