package com.example;


class Oracle{
// 같은 파일내에 있지만 아래의 SingletonExample 클래스와는 다른 클래스

	//싱글톤 패턴 : 아래와 같은 문법으로 정의하여 인스턴스를 리턴해준다
	
	private static Oracle instance = new Oracle();
	
	private Oracle() {
		//생성자에 private 접근제한자를 주면 다른 클래스에서 사용하지 못한다.
	}
	
	public static Oracle getInstance() {
		return instance;
	}
	
}



public class SingletonExample {

	public static void main(String[] args) {
		Oracle oracle1 = Oracle.getInstance();
		Oracle oracle2 = Oracle.getInstance(); 
		// new 연산자로 인스턴스화 하여 만든 객체와 달리 싱글톤 패턴 방식을 통하여 인스턴스화 하면 객체를 여러개 만들어도 그 객체들은 모두 같다.
	
		System.out.println(oracle1 == oracle2);
		// 모두 같으므로 oracle1과 oracle2를 비교하면 참이 나온다.

	}

}
