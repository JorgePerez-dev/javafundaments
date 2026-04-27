package algorithm;

public class RecursionTest {
	
	public static void main(String[] args) {
		add(0);
		
	}
	
	static void add(int num) {
		num++;
		System.out.println(num);
		if (num <= 1000) {
			add(num);
			
		}
		
		
	}
	
	

}
