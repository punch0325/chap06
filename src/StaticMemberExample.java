
public class StaticMemberExample {
	static class Member{
		//인스턴스 필드 : 객체에 소속(new 연산자로 인스턴스화 될 때 heap에 생성) 
		String name;
		String email;
		String adress;
		char gender;
		int height;
		
		//static(정적) 필드 : 메소드 영역의 클래스에 고정적으로 위치 (클래스가 로딩되면 Method area에 생성)
		static int age;
	
		public Member(){
			Member.age++; //static
			this.height++; //instance
		}
		
		void hide() { //인스턴스 메소드는 new 연산자로 인스턴스화를 한 후에 사용 가능
			System.out.println(height); //인스턴스 필드는 같은 클래스 내에서는 this 생략가능
			System.out.println(Member.age); //static 필드는 구분을 위해 클래스 이름을 앞에 붙여 주는게 좋음
		}
		
		static void clearScreen() { //static 메소드는 인스턴스화 하지 않고도 클래스 이름으로 사용 가능
//			System.out.println(height);    ▶ <<오류>>
			System.out.println(age);
			// static 필드는 클래스가 로딩되면 생성이 되기 때문에 클래스내에서 언제든 사용가능 하지만, 
			// 인스턴스 필드는 인스턴스화가 되어야만 사용 가능하기 때문에 오류난 것 
			
		}
		
		//정적 블록
		static {
			System.out.println("#######");
			System.out.println("Member...");
			System.out.println("#######");
		}
	
	}
	
	public static void main(String[] args) {
		Member.clearScreen();
		
		// 인스턴스 3개 생성
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		
		
		System.out.println(Member.age); 
		// static은 인스턴스 변수(객체)를 선언하지 않고 클래스 이름으로 사용 가능하기 때문에 객체 생성 없이 메소드나 필드를 활용하고 싶을 때 사용함

		System.out.println(mem1.height);
		System.out.println(mem2.height);
		System.out.println(mem3.height);

		// 출력 결과 원인 : 인스턴스는 생성이 될 때마다 각자 다른 새로운 인스턴스가 생성된 것이기 때문에 증감연산자가 각자 따로 1번 실행된 것이고,
		// 						  static은 1개 밖에 생성 되지 못하기 때문에 생성자가 실행이 될 때마다 증감연산자가 누적 된 것이므로 3번 실행된 것이다.
		
		
		
	}

}
