package Senior2010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ComputerPurchase {

	public static void main(String[] args) throws IOException {
		long x = System.currentTimeMillis();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int numComps = Integer.parseInt(input.readLine());
		Computer [] comps = new Computer[numComps];
		ComputerPurchase getStuff = new ComputerPurchase();
		for (int i =0; i < numComps; i++) {
			String [] temp = input.readLine().split(" ");
			comps[i] = getStuff.new Computer(temp[0], Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]));
		}
		
		Arrays.sort(comps);
		System.out.println(comps[0].getName());
		System.out.println(comps[1].getName());
		System.out.println(((double)(System.currentTimeMillis() - x))/1000);

	}
	
	class Computer implements Comparable<ComputerPurchase.Computer>{
		private String name;
		private int ram;
		private int cpu;
		private int diskSpace;
		
		public Computer(String name, int ram, int cpu, int dickSpace) {
			super();
			this.name = name;
			this.ram = ram;
			this.cpu = cpu;
			this.diskSpace = dickSpace;
		}

		@Override
		public int compareTo(Computer o) {
			if (2*this.ram + 3*this.cpu + this.diskSpace < 2*o.ram + 3*o.cpu + o.diskSpace)
				return 1;
			else if (2*this.ram + 3*this.cpu + this.diskSpace > 2*o.ram + 3*o.cpu + o.diskSpace)
				return -1;
			else 
				return 0;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		
	}

}
