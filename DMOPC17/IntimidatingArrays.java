package DMOPC17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntimidatingArrays {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int lengthArr = Integer.parseInt(tokens[0]);
		int queries = Integer.parseInt(tokens[1]);
		int[] arr = new int[lengthArr];
		String [] nums = in.readLine().split(" ");
		for (int i = 0; i < nums.length;i++) {
			arr[i] = Integer.parseInt(nums[i]);
		}
		for (int i = 0; i < queries; i++) {
			String [] upLow = in.readLine().split(" ");
			int low = Integer.parseInt(upLow[0])-1;
			int up = Integer.parseInt(upLow[1])-1;
			int intim = 1;
			int highest = arr[low];
			for (int j = low+1; j < up +1;j++) {
				if (arr[j] > highest) {
					intim++;
					highest = arr[j];
				}
			}
			System.out.println(intim);
		}
		

	}

}