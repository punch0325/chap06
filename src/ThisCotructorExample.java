
public class ThisCotructorExample {
	static class Alpha {
		int line;
		int column;
		int fg;
		int bg;
		char ch;
		
		public Alpha(int line, int column, int fg, int bg, char ch) {
			super();
			this.line = line;
			this.column = column;
			this.fg = fg;
			this.bg = bg;
			this.ch = ch;
		}
		
		//이런식으로도 생성자 선언 가능
		public Alpha(int line, int column) {
			this(line, column, 31, 44, 'B');
		}
		
		void show() {
			System.out.printf("[%d, %d, %d, %d, %c]\n", line, column, fg, bg, ch);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Alpha a1 = new  Alpha(10, 5, 31, 44, 'A');
		Alpha a2 = new Alpha(4, 6);
		
		a1.show();
		a2.show();
	}

}
