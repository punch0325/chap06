package com.example.ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("────────────────────────────────────────────────");
			System.out.println("    1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("────────────────────────────────────────────────");
			System.out.print("선택 >");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if (selectNo == 2) {
				accountList();
			}else if (selectNo == 3) {
				deposit();
			}else if (selectNo == 4) {
				withdraw();
			}else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}


	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		Account acc = new Account(ano, owner, balance);
	
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");		
	}


	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(accountArray[i] != null)
				System.out.println(account.toString());
		}
		
	}


	private static void deposit() {
		System.out.println("----------");
		System.out.println("   예금  ");
		System.out.println("----------");
		
		System.out.print("계좌번호 : ");
		int ano = scanner.nextInt();
		
		
	}


	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}


	
	


}
