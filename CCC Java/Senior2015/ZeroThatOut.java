package Senior2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ZeroThatOut {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> q = new Stack();
		
		int size = Integer.parseInt(in.readLine());
		int [] nums = new int [size];
		int index = 0;
		int sum = 0;
		for (int i =0 ; i < size; i++) {
			int temp = Integer.parseInt(in.readLine()); 
			if (temp != 0) {
				nums[i] = temp;
				sum += temp;
				q.push(nums[i]);
			} else {
				sum -= q.pop();
				index++;
			}
		}
		
		System.out.println(sum);
		
	}

}
