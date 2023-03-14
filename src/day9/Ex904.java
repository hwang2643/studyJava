package day9;

// 1~100까지 7의배수가 아니면서 13의 배수에 해당
public class Ex904 {
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(!(i%7!=0 && i%13==0)) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}

