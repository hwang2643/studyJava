package day13;

public class Q1301 {
	public static void main(String[] args) {
		boolean[] b = new boolean[45];
		for(int i=1; i<=6; i++) {
			int ran = (int)(Math.random()*45);
			b[ran] = true;
		}
		
		for(int i=0; i<=b.length-1; i++) {
			if(b[i]) {
				System.out.print((i+1) + " ");
			}
		}
	}
}
