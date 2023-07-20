package com.example;

public class VT100LoopingExample1 {
// 절차적 프로그래밍
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("\033[2J");
		
		boolean[][] rect = new boolean[20][40];
		int count = 0;
		
		for (;;) {
			int line = (int) (Math.random()*20+1);
			int column = (int) (Math.random()*40+1);
			int fg = (int) (Math.random()*8+30);
			int bg = (int) (Math.random()*8+40);
			char ch = (char) (Math.random()*26+'A');
			
			System.out.printf("\033[%d;%dH" , line , column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);
			rect[line-1][column-1] = true;
			
			System.out.printf("\033[1;42H"); //커서 이동
			System.out.print("\033[0m");
			System.out.printf("count= [%5d]", count++);

			
			boolean isAllPrint = true;
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j<40; j++) {
					if(rect[i][j] == false) {
						isAllPrint = false;
						break;
					}
				}
				if(isAllPrint == false)
					break;
			}
		
			if (isAllPrint)
				break;
			
			Thread.sleep(1); // 10 밀리세컨 동안 멈춤 , 화면에 알파벳이 찍힐 때 너무 빨리 찍히지 않도록 반복문 마지막에 넣어준 것

		}

		//무한루프 문을 끝낼 수 있는 break가 없으면 아래의 실행문들은 에러난다.
		System.out.print("\033[0m");
		System.out.print("\033[21;1H"); //커서 이동
		System.out.println("Program End..");

		
		
		
		
	}

}
