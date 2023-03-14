package test01;

public class JavaPractice_5Chap {
	public static void main(String[] args) {
		// 5-3
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("sum="+sum);
		
		// 5-4
//		int[][] arr = {
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
//		int total = 0;
//		float average = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				total += arr[i][j];
//				}
//			}
//		average = (float)total/(arr.length*arr[0].length);
//		System.out.println("total="+total);
//		System.out.println("average="+average);
		
		// 5-5
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		for(int i=0;i<ball3.length;i++) {
			ball3[i] = ballArr[i];
			System.out.print(ball3[i] + " ");
		}
	}
}
