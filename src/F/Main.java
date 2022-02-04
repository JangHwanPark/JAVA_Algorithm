//2438
package F;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter B = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(A.readLine());
		String S = "";
		for(int i = 1; i<=C; i++) {
			S = S + "*";
			B.write(S + "\n");
		}
		B.flush();
	}

}
