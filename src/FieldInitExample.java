
public class FieldInitExample {
	static class Alpha {
		// 필드값은 초기화를 해줄 수도 있고 안해줘도 된다.
		int line;
		int column;
		int fg = 31; 
		int bg = 44;
		char ch;
		
		// 기본 생성자 선언 : 다른 생성자가 없을 때는 생략 가능하지만 , 다른 생성자가 있을 때에는 생략하면 매개변수 없이 인스턴스화를 하려고 할때 오류난다. 
		public Alpha() {
			
		}

		
		//기본 생성자와 이름이 같지만 매개변수가 다르므로 사용가능하다. 이런 것을 'Overlodding(오버로딩)'이라고 함
		public Alpha(int line, int column, int fg, int bg, char ch) {
			super();
			this.line = line;
			this.column = column;
			this.fg = fg;
			this.bg = bg;
			this.ch = ch;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Alpha a = new Alpha();
	}

}
