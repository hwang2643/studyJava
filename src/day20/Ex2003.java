package day20;

import java.util.Arrays;

public class Ex2003 {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "안녕하세요";
		
		// 1. 길이 : .length() --> 문자열의 길이(글자 수)를 리턴
		System.out.println(s.length());
		System.out.println(s2.length());
		
		// 2. '동등 비교'(내용이 같은지 비교) : .equals()
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s));
		
		// 3. 가나다(abc) 순 비교 : .compareTo();
		// 		문자열1.compareTo(문자열2) -----> 문자열1 에서 문자열2를 빼세요...
		// 		-> 문자열1이 문자열2보다 앞서면 (-)부호의 값
		// 		-> 문자열2이 문자열1보다 앞서면 (+)부호의 값
		// 		-> 같으면 0
		System.out.println("ABC".compareTo("BCA"));  // -
		System.out.println("BCA".compareTo("ABC"));  // +
		System.out.println("AA".compareTo("AA"));  // 0
		
		// 4. .valueOf(예를 들어, 숫자) : 수자를 문자열로 바꿈. (클래스 메서드)
		String s6 = 55 + "";  // 문자열과 더한 결과는 무조건 문자열이 된다!     
		String s7 = String.valueOf(55);
		System.out.println(s6.equals(s7));
		
		// 5. .spilt(구분자) : 문자열을 쪼개어 문자열 배열로.
		String str = "자바_C_파이썬_정처산기";
		String[] arrStr = str.split("_");
		System.out.println("arrStr : " + Arrays.toString(arrStr));
		
		// 6. .substring(시작인덱스)  Ex) Hello --> ello
		System.out.println(s.substring(1));
		
		// 7. .substring(시작인덱스, 끝인덱스+1)
		System.out.println(s.substring(1,4));  // ell[1]~[3]
		// s.substring(1) ---> 1부터 시작해서 끝까지
		// s.substring(1,4) --> 1부터 시작해서 4-1까지
		
		// 8. indexOf(문자열) : 문자열의 위치(인덱스). // 왼쪽에서 부터
		//					 	단, 없으면 -1을 리턴
 		// 9. lastIndexOf(문자열) : 오른쪽에서 부터.
		// str : "자바_C_파이썬_정처산기"
		System.out.println(str.indexOf("_"));
		System.out.println(str.lastIndexOf("_"));
		
		// 10. charAt(인덱스) : 인덱스 위치에 있는 한 문자를 리턴.
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		
		// 11. .contains(문자열) : 해당 문자열을 포한하고 있으면 true를 리턴.
		System.out.println(str.contains("_"));  // true
		System.out.println(str.contains("~"));  // false
		System.out.println(str.indexOf("~"));  // -1
		
		// 12. .repalce(old문자열, new문자열)
		str = str.replace("_", " ");
		System.out.println(str);
		
		
		
		
		
	}
}
