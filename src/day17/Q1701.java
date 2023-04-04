package day17;

//Q1701(고급). Palindrome 알고리즘
//1) noon --> palindrome("noon") --> true
//	Ex) "noon" --> n 과 n을 비교.
//		   --> "oo" --> o와 o를 비교.
//		   --> "" --> true !
//2) racecar --> p....("racecar') --> true
//	Ex) "racecar" --> r 과 r을 비교.
//		--> "aceca" --> a 와 a를 비교.
//		--> "cec" --> c 와 c를 비교.
//		--> "e" ----> true !
//3) door ---> palindrome("door") --> false
//	Ex) "door" --> d 과 r을 비교.--> false!
public class Q1701 {
	static String palindrom(String s) {
		if(s.length()<=1)
			return s;
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			s = s.substring(1, s.length()-1);
			palindrom(s);
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(palindrom("racecar"));
	}
}
