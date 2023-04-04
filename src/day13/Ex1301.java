package day13;


public class Ex1301 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
		int n = 1;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] = n*10;
				n++;
			}
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			
		
		
		
	}
}
