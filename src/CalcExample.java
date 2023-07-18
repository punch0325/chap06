
public class CalcExample {
	static class Calc {
		int num1;
		int num2;
		
		Calc(){
			
		}
		
		public Calc(int num1, int num2) {
			super();
			this.num1 = num1;
			this.num2 = num2;
		}

		int add(int num3) {
			return add()+num3;
		}
		
		int add (int num3, int num4) {
			return add(num3)+num4;
		}
		
		            //가변 매개변수 : 배열처럼 사용할 수 있음
		int sum (int ...nums) {
			int sum = 0;
			for(int n : nums)
				sum += n;
			return sum;
			
		}
		
		//타입이 있는 메소드는 무조건 return값이 있어야한다.
		int add() {
			return num1+num2;	
		}
		
		//타입 부분에 'void'가 있으면 return값이 없어도 된다.
		void print() {
			
		}
	
	
	}
	
	
	
	public static void main(String[] args) {
		Calc c1 = new Calc(10,20);
		
		System.out.println(c1.add());
		System.out.println(c1.sum(10,4,5,6));
		System.out.println(c1.sum(10,30,40,50));
		
	}

}
