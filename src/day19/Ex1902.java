package day19;

import java.util.ArrayList;

class Member {
	String id;
	String name;
	int pw;
	
	Member(String id, String name, int pw) {
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
}

public class Ex1902 {
	public static void main(String[] args) {
		// int 값을 3개 담을 수 있는...
		// int 변수를 3개 선언하는 것과 같은 효과...
		int[] arr = new int[3];
		
		// Member첨조변수 3개 선언하는 것과 같은 효과;
		Member[] arr2 = new Member[3];
		arr2[0] = new Member("JW", "재웅", 1234);
		arr2[1] = new Member("JH", "진혁", 4567);
		arr2[2] = new Member("HJ", "하진", 7891);
		for(int i=0; i<=2; i++) {
			System.out.println(arr2[i].id + " / " + arr2[i].name + " / " + arr2[i].pw);
		}
		
		// ArrayList --> '가변길이 배열' 이라고 생각
		// 1. 정수 ----> (int 말고) "Integer"라는 표현을 사용.
		// 2. 객체 생성) ArrayList<Integer> list1 = new ArrayList<Integer>();  '<' : 제너릭
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(20);
		System.out.println(list1);
		list1.add(30);
		System.out.println(list1);
		list1.add(40);
		System.out.println(list1);
		// 1) .add(값)
		// 2) 출력 --> sysout(참조변수);
		// 3) .contains(값) / 6) .size() -> 크기("배열이름.length"와 같음)
		if(list1.contains(30)) {
			System.out.println("30이 있음!");
		}
		for(int i=0; i<=list1.size()-1; i++) {
			if(list1.get(i)==30) {
				System.out.println("30이 있음!");
				break;
			}
		}
		// 4) .remove(인덱스)
		list1.remove(1);  // 20삭제
		System.out.println(list1);  // [10, 30, 40]
		// 5) .get(인덱스) ------> "배열이름[인덱스]"와 같음.
		for(int i=0; i<=2; i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		// 7) .set(인덱스, 새로운값)
		list1.set(2, 50);
		System.out.println(list1);
		// 모든요소 의 값 + 1
		for(int i=0; i<=list1.size()-1; i++) {
			list1.set(i, list1.get(i)+1);
		}
		System.out.println(list1); 
		
		ArrayList<Member> list2 = new ArrayList<Member>();
		list2.add(new Member("JW", "재웅", 1234));
		list2.add(new Member("JH", "진혁", 4567));
		list2.add(new Member("HJ", "하진", 7891));
		
		// [암기]
		// ★배열의 길이 --> arr.length
		// ★문자열의 길이 --> str.length()
		// ★ArrayList의 길이 --> list1.size()
		
		// 1.전체 회원 조회
		for(int i=0; i<=list2.size()-1; i++) {
			// 이름_아이디_비밀번호
			String name = list2.get(i).name;
			String id = list2.get(i).id;
			int pw = list2.get(i).pw;
			System.out.println(name + "_" + id + "_" + pw);
		}
		
		// 2. 회원 등록 ---> .add(new Member(~~~~~))
		list2.add(new Member("TW", "태원", 4321));
		System.out.println("<추가 후>");
		for(int i=0; i<=list2.size()-1; i++) {
			String name = list2.get(i).name;
			String id = list2.get(i).id;
			int pw = list2.get(i).pw;
			System.out.println(name + "_" + id + "_" + pw);
		}
		// 3. 회원 검색
//		String str = "Hello";
//		System.out.println(str.indexOf("ell"));  // 1
//		System.out.println(str.indexOf("llo"));  // 2
//		System.out.println(str.indexOf("oll"));  // -1
//		System.out.println(str.contains("oll"));
		
		String findName = "재";
		for(int i=0; i<=list2.size()-1; i++) {
			if(list2.get(i).name.contains(findName)) {
				System.out.println("빙고!");
				Member m = list2.get(i);
				System.out.println(m.name + "_" + m.id + "_" + m.pw);
			}
		}
		
		// 4. 회원 삭제
		String idDelete = "HJ";
		// 인덱스 ----> list2.remove(인덱스)
		for(int i=0; i<=list2.size()-1; i++) {
			if(list2.get(i).id.equals(idDelete)) {
				list2.remove(i);
				break;
			}
		}
		System.out.println("<삭제 후>" );
		for(int i=0; i<=list2.size()-1; i++) {
			Member m = list2.get(i);
			System.out.println(m.name + "_" + m.id + "_" + m.pw);
		}
		
		
		
	}
}
