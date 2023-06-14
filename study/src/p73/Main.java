package p73;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		
		int result1 = a + b ;
//		byte result3 = a + b; 'b'가 int 값의 정수이기 때문에 byte 명령어의 결과로 출력 불가능하다(그릇이 작아서)
		double result2 = c + d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		
		System.out.println(result1);
		System.out.println(result2);
	}
 
}
