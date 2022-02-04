package D;

import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter B = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(A.readLine());
		for(int i = 1; i <= C; i++) {
			String E = A.readLine();
			int F = Integer.parseInt(E.split(" ")[0]);
			int G = Integer.parseInt(E.split(" ")[1]);
			int Sum = F + G;
			B.write("Case #"+i+": "+ Sum +"\n");
		}
		B.flush();
	}
}
