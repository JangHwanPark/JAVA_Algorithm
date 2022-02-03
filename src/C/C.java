//2742
package C;

import java.util.*;
public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//스캐너 사용
		int N = in.nextInt(); //int형 입력
		
			for(int i = N; i>0; --i)
				System.out.println(i);
			//for(i가 N에서; 1이 될떄까지; 1을뺌)
			in.close();
	}
}
