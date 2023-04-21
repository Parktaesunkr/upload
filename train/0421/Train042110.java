// 각 월에 해당하는 영어단어 학습 프로그램
package study.tr0421;

import java.util.Random;
import java.util.Scanner;

public class Train042110 {

	public static void main(String[] args) {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	
	String[] monstString = {
			"January","February","March","April","May","June","July",
			"August","September","October","November","December"
	};
	
	System.out.println("해당 월의 영어 단어를 입력하시오");
	System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
	
	int retry;
	int last = -1;
	
	do {
		int month;
		do {
			month = rand.nextInt(12);
		}while(month==last);
	
		while(true) {
			System.out.println((month+1)+"월");
			String s = sc.next();
			
			if(s.equals(monstString[month]))break;//정답
			System.out.println("틀렸습니다.");
			}
		System.out.println("정답입니다. 다시한번? 1..Yes/0..No:");
		retry = sc.nextInt();
		}while(retry==1);
	
	
	
	}

}
