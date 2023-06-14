package p75;

public class p75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2+1); 
		//산출타입 : int, java에서 모든 일반적 숫자는 는 정수이면서 int 타입으로 인식되고
		//소숫점이 있는 숫자는 실수 이면서 double 타입으로 인식됨
//		char c4 = c2+1;
		
		
		System.out.println("c1 : "+c1);
		System.out.println("c1 : "+c2);
		System.out.println("c1 : "+c3);
		
		System.out.printf("%d ", (int)c2);
		System.out.printf("%c", c2);
		//%d = 결과값을 정수로 표현할때 씀
		//%c = 결과값을 문자로 표현할때 씀
		//%f = 결과값을 실수로 표현할때 씀
		//%s = 결과값을 문자열로 표현할때 씀
		
	 
	}

}
