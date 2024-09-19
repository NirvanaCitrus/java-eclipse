package test0822;

public class C {
	
	public int add() {
		int value = 0; // 값을 담을 변수를 초기화 세팅.
		
		int sum = 0; // 총합을 누적해서 담는 변수.
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		value = sum;
		
		return value;
		
	}

}
