package 쉽게배우는자바프로그래밍;

public class sec03_CharBooDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 예제 2-3 문자 및 논리 타입 응용 */
		char ga1 = '가';
		char ga2 = '\uac00';
		boolean cham = true;
		boolean geojit = false;
		System.out.println(ga1); /* 가 */
		System.out.println((int) ga1); /* 44032 */
		System.out.println(ga2); /* 가 */
		System.out.println(++ga2); /* 각 */
		System.out.println(cham + "가 아니면" + geojit + "입니다.");
		/* true가 아니면false입니다. */

	}

}
