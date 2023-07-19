
public class CallbyValueExample {
	static void process(int num) {
		num = num +10;
		System.out.println("num = "+num);
	}
	
	
	
	public static void main(String[] args) {
		int num1 = 100;
		process(num1);
		System.out.println("num1 = "+num1);
	}
   // 메인 메소드에 있는 num1값은 바뀌지 않는다
	
	
}
