
public class Car {
	int model;
	int speed; 
	//필드 : 클래스(객체)의 속성을 표현함 즉, 객체의 데이터가 저장 됨
	
	void forward() { // 메소드
		int num = 0 ;  // 변수 (로컬변수, 스택변수, 임시변수, 블럭변수)
		System.out.println("전진 ...");
	}
	
	void backward() {
		System.out.println("후진 ...");
	}
	
	
	
	public static void main(String[] args) {
		Car car1 = new Car(); //객체 생성자 : 객체 생성시 초기화 담당
		car1.forward();
		car1.backward();
		
		Car car2 = null;
		// 한번 new 연산자로 객체를 생성하고 나면 이후엔 new를 사용하지 않아도 된다.
		
		

	}

}
