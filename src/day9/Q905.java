package day9;

// 1 -4 9 -16 25 -36 49 -64 81 -100
public class Q905 {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i*-i + " ");
			}else {
				System.out.print(i*i + " ");
			}
			
			
		}
	}
}

