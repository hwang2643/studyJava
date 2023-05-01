package day26;

class AA {
	void m() { }
}
class BB extends AA {
	@Override
	void m() {
		System.out.println("잠깐만");
	}
}
public class Ex2601 {
	public static void main(String[] args) {
		//BB obj = new BB();
		// [암기] 부-자는 되고, 자-부는 안 된다.
		AA obj = new BB();  // 다형성(polymorphism)
//		BB obj2 = new AA();  // ERR. (이해)
		obj.m();
		
	}
}
