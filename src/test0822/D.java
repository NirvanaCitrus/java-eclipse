package test0822;

public class D {
	
	private int x = 3;
	
	
	public String mtd() {
		String value = "";
		
		if (x < 5) {
//			System.out.println("작다");
			value = "작다";
			
		} else if (x > 5) {
//			System.out.println("크다");
			value = "크다";
			
		}
		
		return value;
	}
	
	

}
