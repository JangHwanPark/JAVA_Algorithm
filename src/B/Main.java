//2741
package B;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		//BufferedReader/Writer사용을위한 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력 선언
		
		//String B = br.readLine();
		int A = Integer.parseInt(br.readLine()); 
		//readLine으로 받은 데이터(String으로 받아지기 때문에 int형식으로 변환(integer.parsint)
		
		if(A<=100000)
			for(int i = 1; i<=A; i++)
		//if문을 사용해 A값이 맞게들어왔는지 확인후 for문 사용
				bw.write(i + "\n");
		//for문을 통해 1~A값까지 출력 할 것이기 때문에 i값을 찍어준다.
		//for(시작값을 1부터해서; A값보다 같거나 작게; 1씩 늘어나게)
		
		bw.flush(); //write로 담은 내용 출력 후, 버퍼 닫음
		br.close();
	}

}
