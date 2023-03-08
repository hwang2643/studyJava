package day5;

import java.util.Scanner;

/*
 * 수1 입력 : 3
 * 연산자 입력 : +
 * 수2 입력 : 5.5
 * 3 + 5.5 = 8.5
 * 5.5 - 3.5 = 2
 */
public class Q508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 입력 : ");
		double n1 = sc.nextDouble();
		System.out.print("연산자 입력 : ");
		String s = sc.next();
		System.out.print("수2 입력 : ");
		double n2 = sc.nextDouble();
		switch(s) {
		case "+" : 
			double sum = n1 + n2;
			if(n1 == (int)n1 && n2 == (int)n2) {
				System.out.println((int)n1 + s + (int)n2 + " = " + (int)sum);
			} else if(n1 == (int)n1){
				System.out.println((int)n1 + s + n2 + " = " + sum);
			} else if(n2 == (int)n2) {
				System.out.println(n1 + s + (int)n2 + " = " + sum);
			} else if(sum == (int)sum) {
				System.out.println(n1 + s + n2 + " = " + (int)sum);  
			} else {
				System.out.println(n1 + s + n2 + " = " + sum);
			}
			break;
		case "-" :
			double sub = n1 - n2;
			if(n1 == (int)n1 && n2 == (int)n2) {
				System.out.println((int)n1 + s + (int)n2 + " = " + (int)sub);
			} else if(n1 == (int)n1){
				System.out.println((int)n1 + s + n2 + " = " + sub);
			} else if(n2 == (int)n2) {
				System.out.println(n1 + s + (int)n2 + " = " + sub);
			} else if(sub == (int)sub) {
				System.out.println(n1 + s + n2 + " = " + (int)sub);  
			} else {
				System.out.println(n1 + s + n2 + " = " + sub);
			}
			break;
		case "*":
			double multi = n1 * n2;
			if(n1 == (int)n1 && n2 == (int)n2) {
				System.out.println((int)n1 + s + (int)n2 + " = " + (int)multi);
			} else if(n1 == (int)n1){
				System.out.println((int)n1 + s + n2 + " = " + multi);
			} else if(n2 == (int)n2) {
				System.out.println(n1 + s + (int)n2 + " = " + multi);
			} else if(multi == (int)multi) {
				System.out.println(n1 + s + n2 + " = " + (int)multi);  
			} else {
				System.out.println(n1 + s + n2 + " = " + multi);
			}
			break;
		case "/" :
			double div = n1 / n2;
			if(n1 == (int)n1 && n2 == (int)n2 && div == (int)div) {
				System.out.println((int)n1 + s + (int)n2 + " = " + (int)div);
			} else if(n1 == (int)n1 && n2 == (int)n2) {
				System.out.println((int)n1 + s + (int)n2 + " = " + div);
			} else if(n1 == (int)n1){
				System.out.println((int)n1 + s + n2 + " = " + div);
			} else if(n2 == (int)n2) {
				System.out.println(n1 + s + (int)n2 + " = " + div);
			} else if(div == (int)div) {
				System.out.println(n1 + s + n2 + " = " + (int)div);  
			} else {
				System.out.println(n1 + s + n2 + " = " + div);
			}
			break;
		}
	}
}
