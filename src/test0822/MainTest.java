package test0822;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test0920 t = new Test0920();
		// 1. Test0920 객체 생성하기
		// new 연산자로 메모리 공간을 할당하고 
		// 생성자를 호출하여 객체를 생성한 후에 
		// 그 객체의 주소값을 객체 참조변수 t에 담는다.
		// 객체 참조변수 t의 타입은 Test0920클래스 타입이다.
		// 객체 참조변수 t값을 찍어봄으로써 객체 생성여부를 알 수 있다.
		
		t.move();
		
		try {
			a();
			b();
			c();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayListTest a = new ArrayListTest();
		
		// ArrayList 자바가 제공하는 컬렉션 프레임워크 클래스 빈상자와 같다
		// 배열의 특성을 가지소 있어서 속도가 빠른게 장점이고 번호표가 부여된다.
		
		ArrayList<String> dd = a.test();
		System.out.println("dd값은 뭘까요?" + dd);
		String name = dd.get(1);
		System.out.println("두번째 이름은?"+name);

	}
	
	public static void a() throws Exception {
		System.out.println("a입니다.");
		
		throw new Exception();
		
		  
	}
	
	public static void b() {

		System.out.println("b입니다.");
	}

	public static void c() {

		System.out.println("c입니다.");
	}
	
	

}
