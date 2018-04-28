package JohnsonTrotterAlgo;

public class JTAlgo {
	//creds to princeton for code
	
	//algo for find permutations or an array
	
	/*The algorithm works by placing the numbers 1…n in the increasing order and associating LEFT < as the direction for each of them

	Find the largest mobile integer and swap it with the adjacent element on its direction without changing the direction of any of these two.

	In doing so, if the largest mobile integer has reached a spot where it’s no more mobile, proceed with the next largest integer if it’s mobile (or with the next …). There’s a catch. Read step 4.

	After each swapping, check if there’s any number, larger than the current largest mobile integer. If there’s one or more, change the direction of all of them. (see the example shown bellow for clarity).
	The algorithm terminates when there are no more mobile integers.*/
	
	public static void perm(int n) {
        int[] p   = new int[n];     // permutation
        int[] pi  = new int[n];     // inverse permutation
        int[] dir = new int[n];     // direction = +1 or -1
        for (int i = 0; i < n; i++) {
            dir[i] = -1;
            p[i]  = i;
            pi[i] = i;
        }
        perm(0, p, pi, dir);
        System.out.printf("   (0 1)\n");
    }

    public static void perm(int n, int[] p, int[] pi, int[] dir) { 

        // base case - print out permutation
        if (n >= p.length) {
            for (int i = 0; i < p.length; i++)
            	 System.out.print(p[i]);
            return;
        }

        perm(n+1, p, pi, dir);
        for (int i = 0; i <= n-1; i++) {

            // swap 
        	 System.out.printf("   (%d %d)\n", pi[n], pi[n] + dir[n]);
            int z = p[pi[n] + dir[n]];
            p[pi[n]] = z;
            p[pi[n] + dir[n]] = n;
            pi[z] = pi[n];
            pi[n] = pi[n] + dir[n];  

            perm(n+1, p, pi, dir); 
        }
        dir[n] = -dir[n];
    }


    public static void main(String[] args) {
       // int n = Integer.parseInt(args[0]);
    	int n = 3;
        perm(n);
    }
}
