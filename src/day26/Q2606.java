package day26;

//클래스 Car를 정의하세요.
//- 인스턴스변수 : int plate(번호판) / String color(색상) / String model(모델명)
//- ㅅ : (아무 일도 하지 마세요)
//- 인스턴스메서드 : 
//	void setPlate(____)  // 파라미터의 값을 필드 plate에 대입
//	void setColor(____) 
//	void setModel(____) 
//	void showCar()   // 출력 : "Car 객체 : 모델 A(blue), 차량번호 1234"
//
//main() : Car 객체 3개를 생성 후 각 set~~~~() 메서드들을 사용하여 아래와 같이 필드 값들을 셋팅:
//	(객체1) 	1234, "blue", "모델 A"
//	(객체2)	5678, "white", "모델 B"
//	(객체3)	9012, "red", "모델 C"
//
//각 객체에 대해 showCar() 호출해서 출력:
//(실행결과)
//	Car 객체 : 모델 A(blue), 차량번호 1234
//	Car 객체 : 모델 B(white), 차량번호 5678
//	Car 객체 : 모델 C(red), 차량번호 9012

class Car {
	int plate;
	String color;
	String model;
	void setPlate(int plate) {
		this.plate = plate;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setModel(String model) {
		this.model = model;
	}
	void showCar() {
		System.out.println("Car 객체 : " + model + "(" + color + "), 차량번호 " + plate);
	}
}
public class Q2606 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.setPlate(1234);
		c1.setColor("blue");
		c1.setModel("모델A");
		c2.setPlate(5678);
		c2.setColor("white");
		c2.setModel("모델B");
		c3.setPlate(9012);
		c3.setColor("bred");
		c3.setModel("모델C");
		c1.showCar();
		c2.showCar();
		c3.showCar();
		
		
		
	}
}
