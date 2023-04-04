package day11;

/* 난수 발생(1~10) 값을 크기가 6인 배열을 채운 후,
	1) 배열의 내용을 출력. (단, Arrays.toString() 사용X)
	2) 평균 값을 출력
	   ---> "평균 : _____"
	3) 평균 값보다 큰 요소들만 출력. 
	   ---> "평균보다 큰 요소 : ________..."
*/
public class Q1103 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		while(true) {
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*10) +1;
			}
			boolean dup = true;
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						dup = false;
					}
				}
			}
			if(dup) {
				break;
			}
		}
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		float avg = (float)sum/arr.length;
		System.out.println("---> \"평균 : " + avg + "\"");
		System.out.print("---> \"평균보다 큰 요소 : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>avg) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("...\"");
	}
}
