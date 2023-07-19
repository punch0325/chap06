
public class FinalExample {
	static class Alpha {
		final int line = 10; // 앞에 final을 붙이면 read only가 되고 반드시 초기값을 주어야함 (생성자에서 입력해도 됨), 초기값은 변할 수 없다.
		static final double PI = 3.141592; // 상수 선언. 고정적(static)이고 최종적(final)인 값을 지정할 때 사용
		int column;
			
		//만약 
	}
	
	public static void main(String[] args) {
		Alpha a1 = new Alpha();
		
//		a1.line = 20;   ▶line은 final (인스턴스) 필드이기 때문에 초기값을 바꿀 수 없다.
		a1.column = 10;
		
		
	}

}
