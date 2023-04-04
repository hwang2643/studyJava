package test01;
//-------------------
//1. 전체회원조회
//2. 회원등록
//3. 회원검색
//4. 회원삭제
//0. 종료
//-------------------
//>> 1 (엔터)
//(등록된 회원이 없습니다)

import java.util.ArrayList;
import java.util.Scanner;

class Member {
	String name;
	String id;
	int pw;
	Member(String name, String id, int pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	void show () {
		System.out.println(name + "_" + id + "_" + pw);
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> list = new ArrayList<Member>();
		while(true) {
			System.out.println("-------------------\n1. 전체회원조회\n2. 회원등록\n3. 회원검색\n4. 회원삭제\n0. 종료\n-------------------");
			int in = sc.nextInt();
			switch(in) {
			case 1 : {
				showAll(list);
				break;
			}
			case 2 : {
				addInfo(list);
				break;
			}
			case 3 : {
				find(list);
				break;
			}
			case 4 : {
				delete(list);
				break;
			}
			case 0 : {
				break;
			}
			}
			if(in == 0) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}
	static void showAll(ArrayList<Member> list) {
		if(list.size()<1) {
			System.out.println("(등록된 회원이 없습니다)");
		}
		for(int i=0; i<=list.size()-1; i++) {
				list.get(i).show();
		}
	}
	static void addInfo(ArrayList<Member> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("패스워드 입력 : ");
		int pw = sc.nextInt();
		int n = 0;
		for(int i=0; i<=list.size()-1; i++) {
			if(list.get(i).name.equals(name) || list.get(i).id.equals(id)) {
				n++;
			}
		}
		if(n>=1) {
			System.out.println("등록된 이름이나 아이디가 있습니다.");
		}else {
			list.add(new Member(name, id, pw));
			System.out.println("회원 등록 되었습니다");
		}
		
	}
	static void find(ArrayList<Member> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디나 이름을 입력해 주세요 : ");
		String find = sc.next();
		int n = 0;
		for(int i=0; i<=list.size()-1; i++) {
			if(list.get(i).name.contains(find) || list.get(i).id.contains(find)) {
				list.get(i).show();
			}
			else {
				n++;
			}
		}
		if(n>=list.size()) {
			System.out.println("검색한 아이디나 이름이 없습니다.");
		}
	}
	static void delete(ArrayList<Member> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 아이디나 이름을 입력하세요 : ");
		String del = sc.next();
		int n = 0;
		for(int i=0; i<=list.size()-1; i++) {
			if(list.get(i).name.equals(del) || list.get(i).id.equals(del)) {
				list.remove(i);
			}
			else {
				n++;
			}
		}
		if(n>=list.size()) {
			System.out.println("삭제하실 이름이나 아이디가 없습니다.");
		}
	}
	
}
