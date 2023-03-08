package test01;

public class JavaPractice {
	public static void main(String[] args) {
		// 3-2
		int numOfApples = 151; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int numOfBucket = (numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : (numOfApples/sizeOfBucket)+1); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("바구니의 수 :"+numOfBucket);
		
		// 3-3
		int num = 10;
		System.out.println(num>0 ? "양수" : num<0 ? "음수" : 0);
		
		// 3-4
		int num1 = 456;
		System.out.println(num1-(num1%100));
		
		// 3-5
		int num2 = 555;
		System.out.println(num2 - num2%10 + 1);
		
		// 3-6
		int num3 = 24;
		System.out.println((num3/10+1)*10);
		System.out.println((num3/10+1)*10 - num3);
		
		// 3-7
		int fahrenheit = 100;
		float celcius = (((float)fahrenheit-32)*5/9);
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		// 3-8
		byte a = 10;
		byte b = 20;
		int c = a + b;
		char ch = 'A';
		ch =(char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000l * 3000l * 3000l;
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		// 3-9
		char ch1 = 'a';
		int n =(int)'0';
		System.out.println(n);
		boolean b1 = ((int)'0'<=(int)ch1 && (int)'9'>=(int)ch1 ? true : (int)'A'<=(int)ch1 && (int)'Z'>=(int)ch1 ? true : (int)'a'<=(int)ch1 && (int)'z'>=(int)ch1 ? true : false);
		System.out.println(b1);
		
		// 3-10
		char ch2 = 'C';
		char lowerCase = ((int)'A'<=(int)ch2 && (int)'Z'>=(int)ch2) ? (char)(ch2+32) : ch2;
		System.out.println("ch:"+ch2);
		System.out.println("ch to lowerCase:"+lowerCase);
	

	}
	

}
