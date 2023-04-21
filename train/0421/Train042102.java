//선택한 요소 중 가장 앞에 있는 요소 찾기
package study.tr0421;

import java.util.Scanner;

public class Train042102 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("요소 수 :");
	int n = stdIn.nextInt();
	int[]a = new int[n];
	
	for(int j=0; j<n; j++) {
		System.out.println("a[" + j + "] =");
		a[j] = stdIn.nextInt();
	}
	System.out.println("찾을 숫자: ");
	int key = stdIn.nextInt();
	
	int i;
	for(i=0; i<n; i++) {
		if(a[i]==key)break;
	}
	if(i<n)
		System.out.println("그 값은 a["+ i + "]에 있습니다.");
	else
		System.out.println("해당 값이 존재하지 않습니다.");
	}

}
