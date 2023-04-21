//배열의 모든 요소를 1~10의 난수로 채우기
package study.tr0421;

import java.util.Random;
import java.util.Scanner;

public class Train042106 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int[]a = new int[n];
		
		a[0] = 1+ rand.nextInt(10);
		
		for(int i = 1; i<n; i++) {
			do {
				a[i] = 1+rand.nextInt(10);
			} while(a[i]==a[i-1]);
		}
	
		
		for(int i =0; i<n; i++)
			System.out.println("a[" + i + "] =" + a[i] );
		

	}

}
