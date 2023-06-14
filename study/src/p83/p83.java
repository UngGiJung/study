package p83;

public class p83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "JDK" + 3 + 3.0;
		            // String + int + double, 연산 우선순위 -> 따라서, 스트링+인트 = 스트링 >> 스트링+더블 = 스트링 >> JDK33.0
		String str6 = 3 + 3.0 + "JDK";
		            // int + double + String, 연산 우선순위 -> 따라서, 인트+더블 = 더블 >> 더블+스트링 = 스트링 >> 6.0JDK
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		 
		
	
	}

}
