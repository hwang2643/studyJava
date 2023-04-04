package test02;

import java.util.ArrayList;
import java.util.Scanner;

class Member {
	String name;
	String id;
	int pw;
	Member (String name, String id, int pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
}

public class Test {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Member> list = new ArrayList<Member>();
	static void showMenu() {
		System.out.println("-------------------\n1. 전체회원조회\n2. 회원등록\n3. 회원검색\n4. 회원삭제\n0. 종료\n-------------------");
	}
	
	static void showAll() {
		if(list.size()<1) {
			System.out.println("(등록된 회원이 없습니다.)");
		}else {
			for(int i=0; i<=list.size()-1; i++) {
				String name = list.get(i).name;
				String id = list.get(i).id;
				int pw = list.get(i).pw;
				System.out.println(name + "_" + id + "_" + pw);
			}
		}
	}
	
	static void addMem() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		int pw = sc.nextInt();
		boolean b = false;
		for(int i=0; i<=list.size()-1; i++) {
			if(list.get(i).name.equals(name) || list.get(i).id.equals(name)) {
				b = true;
				break;
			}
		}
		if(b) {
			System.out.println("(중복된 이름이나 아이디 입니다.)");
		}else {
			list.add(new Member(name, id, pw));
			System.out.println("등록되었습니다!");
		}
		
	}
	static void findMem() {
		System.out.print("검색할 문자 입력 : ");
		String find = sc.next();
		int cnt = 0;
		for(int i=0; i<=list.size()-1; i++) {
			if(list.get(i).name.contains(find) || list.get(i).id.contains(find)) {
				System.out.println(list.get(i).name + "_" + list.get(i).id + "_" + list.get(i).pw);
			}else 
				cnt++;
		}
		if(cnt >= list.size()) {
			System.out.println("(검색한 정보가 없습니다.)");
		}
	}
	static void delMem() {
		System.out.print("삭제할 이름이나 아이디 입력 : ");
		String del = sc.next();
		boolean b2 = false;
		boolean b1 = false;
		for(int i=0; i<=list.size()-1; i++) {
			if(list.get(i).name.equals(del) || list.get(i).id.equals(del)) {
				System.out.print("비밀번호 입력 : ");
				int delPw = sc.nextInt();
				if(list.get(i).pw==delPw) {
					list.remove(i);
					b2 = true;
				}else {
					System.out.println("(비밀번호가 틀렸습니다.)");
					b1 = true;
					break;
				}
			}
				
		}
		if(!b2) 
			System.out.println("(삭제할 이름이나 아이디가 없습니다.)");
		else if(b1)
			System.out.println();
		else
			System.out.println("삭제되었습니다.");
	}
	public static void main(String[] args) {
		while(true) {
			showMenu();
			int in = sc.nextInt();
			switch(in) {
			case 0 : 
				break;
			case 1 : {
				showAll();
				break;
			}
			case 2 : {
				addMem();
				break;
			}
			case 3 : {
				findMem();
				break;
			}
			case 4 : {
				delMem();
				break;
			}
			}
			if(in==0)
				break;
		}
	}

}
