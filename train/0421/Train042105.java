//배열의 모든 요소에 1~10 난수채우기
package study.tr0421;

import java.util.Random;
import java.util.Scanner;

public class Train042105 {

	public static void main(String[] args) {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	
	System.out.print("요소 수 : ");
	int n = sc.nextInt();
	int[]a = new int[n];
	
	for(int i =0; i<n;i++)
		a[i] = 1 +rand.nextInt(10);
	
	for(int i =0; i<n; i++)
		System.out.println("a[" + i + "] =" + a[i] );
	
	

	}

}
