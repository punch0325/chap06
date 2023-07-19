
public class CallbyReferenceExample {
	static void process(int[] nums1) {
		nums1[0] = nums1[0]*10;
		nums1[1] = nums1[1]*100;
		
		for (int i : nums1)
			System.out.println("nums1 : "+i);
	}
	

	
	
	
	public static void main(String[] args) {
		int[] nums2 = {10, 9, 5, 4};
		process(nums2);
		System.out.println();
		for (int i : nums2)
			System.out.println("nums2 : "+i);
		
		// 배열은 데이터 값을 넘기는게 아니라 참조를 넘기기 때문에 기존 데이터 값도 같이 변경된다.
	}


}
