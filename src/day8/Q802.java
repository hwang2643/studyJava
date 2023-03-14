package day8;

public class Q802 {
	public static void main(String[] args) {
		int i = 1;
		for( ; ; ) {
			if(i>100) {
				break;
			}if(i%3!=0) {
				i++;
				continue;
			}
			System.out.print(i + " ");
			i++;
		}
	}
}
