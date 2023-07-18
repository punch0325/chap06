
public class AlphaExample {
	static class Alpha {
		int fg;
		int bg;
		char ch;
		// 필드는 초기화 값이 없어도 사용은 가능하다.
		
		public Alpha() {
			fg = (int)(Math.random()*8 + 30);
			bg = (int)(Math.random()*8 + 40);
			ch = (char)(Math.random()*26 + 'A');
//			System.out.println("Alpha()...");
		}
		
		void show() {
			System.out.printf("\033[%dm" , fg);
			System.out.printf("\033[%dm" , bg);
			System.out.print(ch);
			System.out.print("\033[0m");
		}
		
		void hide() {
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		for (int i =0; i<10; i++) {
			for(int j = 0; j<20; j++) {
				Alpha alpha = new Alpha();
				alpha.show();
			}
			System.out.println();
		}
		
	}

	public static void main2(String[] args) {
		System.out.println("Program Start ....");
		
		Alpha alpha1 = new Alpha(); 
		Alpha alpha2 = new Alpha();
		
		alpha1.show();
		alpha2.show();
		//show 메소드 호출 
		
		System.out.println("\033[0m");
		System.out.println("Program End ....");
	}

}
