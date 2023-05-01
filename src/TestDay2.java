import java.util.ArrayList;
import java.util.Scanner;

class ScoreData {
	String name;
	int jScore;
	int kScore;
	int eScore;
	int mScore;
	
	ScoreData(String name, int jScore, int kScore, int eScore, int mScore) {
		this.name = name;
		this.jScore = jScore;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
	}
}

public class TestDay2 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<ScoreData> listScores = new ArrayList<ScoreData>();
	
	static void showMenu() {
		System.out.println("-----------------------\n1. 전체성적 조회\n2. 성적등록\n3. 성적검색\n4. 성적삭제\n0. 종료\n-----------------------");
	}
	
	static void showAll() {
		if(listScores.size()<1) {
			System.out.println("<전체성적 조회>\n - 저장된 성적 데이터가 없습니다 - ");
		}else {
			for(int i=0; i<=listScores.size()-1; i++) {
				String name = listScores.get(i).name;
				int jScore = listScores.get(i).jScore;
				int kScore = listScores.get(i).kScore;
				int eScore = listScores.get(i).eScore;
				int mScore = listScores.get(i).mScore;
				System.out.println((i+1) + "번 -	[이름 : " + name + "]\n\t자바 : " + jScore 
						+ "점, 국어 : " + kScore + "점, 영어 : " + eScore + "점, 수학 : " + mScore + "점");
			}
		}
	}
	
	static void addScore() {
		System.out.print("<성적등록>\n이름 : ");
		String name = sc.next();
		System.out.print("자바 : ");
		int jScore = sc.nextInt();
		System.out.print("국어 : ");
		int kScore = sc.nextInt();
		System.out.print("영어 : ");
		int eScore = sc.nextInt();
		System.out.print("수학 : ");
		int mScore = sc.nextInt();
		listScores.add(new ScoreData(name, jScore, kScore, eScore, mScore));
		System.out.println("등록되었습니다!");
		
		
	}
	
	static void findScore() {
		System.out.print("<성적검색>\n 검색할 이름은 입력하세요 : ");
		String findName = sc.next();
		int cnt = 0;
		for(int i=0; i<=listScores.size()-1; i++) {
			if(listScores.get(i).name.contains(findName)) {
				System.out.println(findName + "을(를) 찾았습니다!\n\t[이름 : " 
						+ listScores.get(i).name + "]\n\t자바 : " + listScores.get(i).jScore + "점, 국어 : " 
						+ listScores.get(i).kScore + "점, 영어 : " + listScores.get(i).eScore + "점, 수학 : " 
						+ listScores.get(i).mScore + "점");
			}else
				cnt++;
		}
		if(cnt>=listScores.size()) {
			System.out.println(" - 그런 이름이 없습니다 -");
		}
	}
	
	static void delScore() {
		System.out.print("<성적삭제>\n삭제할 데이터의 번호를 입력하세요 : ");
		int dNum = sc.nextInt();
		if(dNum>listScores.size() || dNum<1) {
			System.out.println("(유효하지 않은 번호입니다. 처음부터 다시 진행해 주세요.)");
		}else {
			listScores.remove(dNum-1);
			System.out.println("삭제되었습니다.");
		}
			
	}
	public static void main(String[] args) {
		while(true) {
			showMenu();
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 0 : 
				break;
			case 1 : {
				showAll();
				break;
			}
			case 2 : {
				addScore();
				break;
			}
			case 3 : {
				findScore();
				break;
			}
			case 4 : {
				delScore();
				break;
			}
			default : {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
			}
			if(menu == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
