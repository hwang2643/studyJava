package day7;

// break, continue -----> "해석을 정확히" ★★★
public class Ex702 {
	public static void main(String[] args) {
		// break문 : 반복문 밖으로 빠져나온다.  (주의 : 하나만 빠져나옴)
		for(int i = 1; i<=7; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i + " ");
		}
		
		// continue문 : 위로 올라가서 계속함. (다음 반복 회차부터 계속)
		System.out.println();
		for(int i = 1; i<=7; i++) {
			if(i == 4) {
				continue;
			}
			System.out.print(i + " ");
			
		}
	}
}
