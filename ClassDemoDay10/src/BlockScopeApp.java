
public class BlockScopeApp {
	
	String classVariable = "hello";

	public static void main(String[] args) {
		boolean inBlock = true;
		String a = "hello... in scope";
		
		if(inBlock) {
			System.out.println(a);
			String b = "b block";
			System.out.println(b);
		}
		
		if(inBlock) {
			String c = "c block";
			System.out.println(c);
			System.out.println(inBlock);
		
		}
		
		// You can look out of your block of code but not inside another block!
	}

}
