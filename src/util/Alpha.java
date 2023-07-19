package util;

public class Alpha {
	
	int line;
	int col;
	Color fg;
	Color bg;
	char ch;
	
	public Alpha() {
		line = (int)(Math.random()*20+1);
		col = (int)(Math.random()*40+1);
		
		do {			
			fg = Color.values()[(int)(Math.random()*8)];
			bg = Color.values()[(int)(Math.random()*8)];
		}while(fg==bg);
		// fg 랑 bg가 같으면 다시 랜덤으로 데이터를 대입하라는 뜻
		
		ch = (char)(Math.random()*26 + 'A');
	}
	
	public void show() {
		VT100.corsorMove(line, col);
		VT100.setForeground(fg);
		VT100.setbackground(bg);
		VT100.printChar(ch);
	}
}
