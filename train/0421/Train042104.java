package study.tr0421;

import java.util.Scanner;

public class Train042104 {

	public static void main(String[] args) {
	
		Scanner sca = new Scanner(System.in);
		System.out.println("요소 수 :");
		
		int n = sca.nextInt();
		double[]a = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "] =");
			a[i] = sca.nextDouble();
		}
		
		double sum =0;
		for(double i : a ) 
			sum+=i;
		
		System.out.println("모든 요소의 합은" + sum + "입니다");
		System.out.println("모든 요소의 평균은" + sum/n + "입니다");
		
			
	}

}
