// 배열의 각 요소에 5,4,3,2,1을 대입
package study.tr0420;

public class Train07 {

	public static void main(String[] args) {
	int[] a = new int[5];
	
	for(int i = 0; i< a.length; i++)
		a[i] = 5 -i;
	
	for(int i = 0; i < a.length; i++)
		System.out.println("a[" + i + "] =" + a[i]);
	}

}
