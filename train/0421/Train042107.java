//배열의 모든 요소를 1~10의 난수로 채우기
package study.tr0421;

import java.util.Random;
import java.util.Scanner;

public class Train042107 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("요소 수 :");
			n = sc.nextInt();
		}  while(n>10);
		int[]a = new int[n];
		
		for(int i = 0; i<n; i++) {
			int j;
			do {
				j=0;
				a[i] = 1+rand.nextInt(10);
				for(;j<i;j++)
					if(a[j]==a[i])break;
			}while(j<i);
		}
	
		
		for(int i =0; i<n; i++)
			System.out.println("a[" + i + "] =" + a[i] );
	}

}
