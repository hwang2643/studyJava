package day10;

public class Ex1004 {
	public static void main(String[] args) {
		int[] arr = {70, 85, 90};
		int total = 0;
		double avg = 0.0;
		for(int i = 0; i<=2; i++) {
			total += arr[i];
		}
		System.out.println("총점 : " + total);
		avg = total/3.0;
		System.out.println("평균 : " + avg);
		
	}
}
