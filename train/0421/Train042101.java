//점수를 입력 받아서 합계, 평균, 최고점, 최저점 표시
package study.tr0421;

import java.util.Scanner;

public class Train042101 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("사람 수 :");
	int n = stdIn.nextInt();
	int[] point = new int[n];
	
	System.out.println("점수를 입력하시오. :");
	int sum = 0;
	for(int i =0; i<n; i++) {
		System.out.print((i+1)+"번의 점수 :");
		point[i] = stdIn.nextInt();
		sum += point[i];
	}
	int max = point[0];
	int min = point[0];
	for(int i =0; i<n; i++) {
	if(point[i]>max)max = point[i];
	if(point[i]<min)min = point[i];
	}
	
	System.out.println("합계는 "+sum+"점입니다.");
	System.out.println("평균은 "+(double)sum/n+"점입니다.");
	System.out.println("최고점은" +max+"점입니다.");
	System.out.println("최저점은 "+min+"점입니다.");
	}

	

}
