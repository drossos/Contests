package TLEOct17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WillsonAndMigration {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] fL = input.readLine().split(" ");
		int numFams = Integer.parseInt(fL[0]);
		int unitThresh = Integer.parseInt(fL[1]);
		WillsonAndMigration wm = new WillsonAndMigration();
		
		FlightPat[] paths= new FlightPat[numFams];
		
		for (int i = 0; i < numFams; i++) {
			String [] temp = input.readLine().split(" ");
			paths[i] = wm.new FlightPat(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),Integer.parseInt(temp[4]));
		}
		
		for (int i = 1; i < numFams; i++) {
			if (paths[0].getSlope() != paths[i].getSlope()) {
				double xIntersect = (((paths[0].getSlope()*paths[0].x1 + paths[0].y1) - (paths[i].getSlope()*paths[i].x1 + paths[i].y1)) / (paths[i].getSlope() - paths[1].getSlope()));
				double yIntersect = (paths[0].getSlope()* xIntersect - paths[0].getSlope()* paths[0].x1 + paths[0].y1);
				
				double timeToGetInter = ((xIntersect-paths[0].x1 + yIntersect-paths[0].y1) / paths[0].getVelo());
				double x = Math.abs((paths[0].getVelo() * timeToGetInter)- paths[1].getVelo() * timeToGetInter);
				if (((paths[0].getVelo() * timeToGetInter)- (paths[1].getVelo() * timeToGetInter)) <= unitThresh)
					System.out.println(i);
			}
		}
		
		
	}
	
	class FlightPat{
		int x1;
		int y1;
		int x2;
		int y2;
		int velocity;
		public FlightPat(int x1, int y1, int x2, int y2, int velocity) {
			super();
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.velocity = velocity;
		}
		
		public int getVelo() {
			return velocity;
		}
		
		public double getSlope() {
			return (y2-y1) / (x2-x1);
		}
		
		
	}

}
