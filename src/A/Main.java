package A;

import java.io.*;
public class Main {

	public static void main(String[] args)  throws IOException{
		BufferedReader D = new BufferedReader(new InputStreamReader(System.in)); //BuffereadReader선언
		BufferedWriter E = new BufferedWriter(new OutputStreamWriter(System.out)); //BuffereadWriter선언

		int T = Integer.parseInt(D.readLine()); 
		for(int i=1; i<=T; i++) { 
			String F = D.readLine();
			int A = Integer.parseInt(F.split(" ")[0]); 
			int B = Integer.parseInt(F.split(" ")[1]);
			E.write(A+B+"\n");
		}
		E.flush();
	} 
}
