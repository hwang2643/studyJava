package day2;

public class Ex209 {
	public static void main(String[] args) {
		int num = 5;
		num++;
		System.out.println(num);  // 6
		++num;
		System.out.println(num);  // 7
		
		//int num2 = num++;
		int num2 = num;  // ①
		num++;  // ②
		
		System.out.println(num2); // 7 (이해)
		
		//int num3 = ++num;
		num++;  // ①
		int num3 = num;  // ②
		
		System.out.println(num3); // 9 (이해)
		System.out.println(num);  // 9
		
		//int num4 = num--;
		int num4 = num;  // ①
		num--;  // ②
		
		//System.out.println(--num4); // 8
		num4--;  // ①
		System.out.println(num4);  // ②
		
		
	}

}
