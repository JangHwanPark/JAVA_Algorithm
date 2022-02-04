package G;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter B = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(A.readLine());
		A.close();
		
		for(int i = 1; i<=C; i++) {
			for(int a = 1; a <= C-i; a++) {
				B.write(" ");
			}
		for(int k = 1; k <= i; k++) {
				B.write("*");
			}
		B.newLine();
		}
		B.flush();
		B.close();
	}

}
