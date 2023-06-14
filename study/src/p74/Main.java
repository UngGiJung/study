package p74;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 : " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 : " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 : " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 : " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 : " + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6 : " + result6);
		
		// (double)를 넣어줌으로써 v1 = 5.0 , v2 = 2.0인 실수 형식으로 강제된다
		//	따라서 결과 값 또한 2.5인 실수형식이 나오게 됨
 
	}

}
