package H;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		int X = a.nextInt();
		
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int b = a.nextInt();
			if(b < X) {
				s.append(b+" ");
			}
		}
		System.out.println(s);
	}

}
