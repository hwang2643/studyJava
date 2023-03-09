package day6;

public class Ex603 {
	public static void main(String[] args) {
		int i;
		// 0 1 2 3 4 5 (for)
		for(i=0; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 0 1 2 3 4 5 (while)
		i = 0;
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		// 0 1 2 3 4 5 (do~while)
		i = 0;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);
		
		System.out.println();
		
		// 6 5 4 3 2 (for)
		for(i=6; i>=2; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 6 5 4 3 2 (while)
		i=6;
		while(i>=2) {
			System.out.print(i + " ");
			i--;
		}
		
		System.out.println();
		
		// 6 5 4 3 2 (do~while)
		i=6;
		do {
			System.out.print(i + " ");
			i--;
		} while(i>=2);
		
		System.out.println();
		
		// 0 2 4 6 8 (for)
		for(i=0; i<=8; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 0 2 4 6 8 (while)
		i=0;
		while(i<=8) {
			System.out.print(i + " ");
			i+=2;
		}
		
		 System.out.println();
		 
		 // 0 2 4 6 8 (do~while)
		 i=0;
		 do {
			System.out.print(i + " ");
			i+=2;
		 }while(i<=8);
		 
		 System.out.println();
		 
		 // 1 4 7 10 (for)
		 for(i = 1; i <=10; i+=3) {
			 System.out.print(i + " ");
		 }
		 
		 System.out.println();
		 
		 // 1 4 7 10 (while)
		 i = 1;
		 while(i <=10) {
			 System.out.print(i + " ");
			 i+=3;
		 }
		 
		 System.out.println();
		 
		 // 1 4 7 10 (do~while)
		 i = 1;
		 do {
			 System.out.print(i + " ");
			 i+=3;
		 }while(i <=10);
		 
		 System.out.println();
		 
		 // 100 90 80 70 (for)
		 for(i = 100; i>=70; i-=10) {
			 System.out.print(i + " ");
		 }
		 
		 System.out.println();
		 
		 // 100 90 80 70 (while)
		 i = 100;
		 while(i>=70) {
			 System.out.print(i + " ");
			 i -= 10;
		 }
		 
		 System.out.println();
		 // 100 90 80 70 (do~while)
		 
		 i = 100;
		 do {
			 System.out.print(i + " ");
			 i -= 10;
		 }while(i>=70);
		 
		 System.out.println();
		 // 1 4 9 16 25 36 (for)
		 //  3 5 7  9  11 
		 int j;
		 for(i = 3, j = 1; j<=36; i+=2) {
			 System.out.print(j + " ");
			 j += i;
		 }
//		 i = 1;
//		 for(i=1;i<=6;i++) {
//			 System.out.print(i*i+" ");
//		 }
	}
}	
