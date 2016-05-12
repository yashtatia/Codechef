import java.io.*;
import java.util.Arrays;

class TurboSort1 {

	public static void main(String[] args)throws IOException {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int t = Integer.parseInt(br.readLine());
			int[] nums = new int[t];
			for (int i = 0; i <t ; i++) {
				nums[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(nums);
			
			/* Doing this without using the PrintWriter in this way resulted
			   in the problem timing out. It's the single flush at the end that
			   seems like the secret.  If I set the PrintWriter to flush at the
			   end of every line automatically, then it timed out again. */
			PrintWriter pw = new PrintWriter(System.out);
			for (int i = 0; i < t; i++) {
				pw.println(nums[i]);
			}
			pw.flush();
	}
}