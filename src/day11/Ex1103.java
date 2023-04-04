package day11;

public class Ex1103 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("(");
			}
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(" ");
			}
			if(i==arr.length-1) {
				System.out.print(")");
			}
		}
		System.out.println();
		
		int odd = 0;
		int even = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("홀수는 " + odd + "개 짝수는 " + even + "개");
		
		boolean b = false;
		int[] n = new int[5];
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					n[i] = arr[i];
					b = true;
				}
			}
		}
		if(b) {
			System.out.println("중복된 값이 있음");
		}else {
			System.out.println("중복된 값이 없음");
		}
	}
}
