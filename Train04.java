//0.0부터 1.0까지 0.001단위로 증가시키며 제곱표시(반복 int)
package study.tr0420;

public class Train04 {

	public static void main(String[] args) {
		System.out.println("x           x의 제곱");
		System.out.println("--------------------------");
		
		for(int i = 0; i <= 1000; i++) {
			float x = (float)i/1000;
			System.out.printf("%5.3f     %10.7f\n",  x,  x*x);
		}
	}

}
