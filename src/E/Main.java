package E;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter B = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(A.readLine());
			for(int i = 1; i<=C; i++) {
				String D = A.readLine();
				int E = Integer.parseInt(D.split(" ")[0]); //입력값 int변환
				int F = Integer.parseInt(D.split(" ")[1]);
				
				int Sum = E + F;
				B.write("Case #"+i+": "+E+" + "+F+" = "+Sum+"\n");
			}
			B.flush();
	}

}
