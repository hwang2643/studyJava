package test01;

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this.num = (int)(Math.random()*10)+1;
		this.isKwang = true;
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	String info() {
		
		return num + (isKwang ? "K" : "");
		
	}
}

public class Chap6_1_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
}
