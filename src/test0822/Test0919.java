package test0822;

public class Test0919  {
	
	// 생성자
	public int calculateSum () {
		int sum = 0;
		for (int i = 0 ; i <= 10; i++) {
			sum += i;
			
		}
		return sum;
	}
	
	
	// 클래스의 멤버변수를 생성 전역변수
	String str = "안녕";
	// 초기에 담는 값이라 하여 초기값.
	
	// 멤버 메소드
	public void test() {
		int a = 0; // 지역변수 영역을 구분해서 변수를 만드는것. 
		
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요");
		//System.out.println(str);
		
		// 객체 생성 코드 형식
		// 클래스 타입 객체참조변수 = new 클래스생성자();
		
		Test0919 t = new Test0919();
//		System.out.println("t에 담긴 값은?" + t);
//		String aaa = t.str;
//		System.out.println("str에 담긴 값은?" + aaa);
		
		// Test0919 tt = new Test0919(1);
		Test0919 calculator = new Test0919();
		int result = calculator.calculateSum();
		System.out.println("1부터 10까지의 합: " + result);
		
		// 클래스 C를 생성해서 1에서 10까지 합을 구하는 메소드를 만들고 그 값을 출력하시오.
		
		C c = new C();
		int g = c.add();
		System.out.println("총 합은?" + g);
		
		// 클래스 D를 생성해서 멤버변수 X를 설정하고
		// X값이 3이고 X값이 5보다 작으면 작다라고 출력하고 5보다 크면 크다라는 메소드를 만들고
		// 그 값을 출력하시오.
		
		D d = new D();
		System.out.println("ggg" + d);
		String str2 = d.mtd();
		
		System.out.println("값은"+str2);

	}

}
