package day13;

public class Q1301_A {
	public static void main(String[] args) {
		boolean[] arr = new boolean[45];
		for(int i=1; i<=6; i++) {
			int idx = (int)(Math.random()*45);
			if(arr[idx]) {
				i--;
				continue;
			}
			arr[idx] = true;
		}
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]) {
				System.out.print((i+1) + " ");
			}
		}
	}
}
