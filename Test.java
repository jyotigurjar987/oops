package oops;

public class Test {
	public void m1(Object o) {
		System.out.println("Object version");
		
	}
	public void m1(String s) {
		System.out.println("String version");
		
	}
	public static void main(String[] args) {
		Test test= new Test();
		test.m1(new Object());
		test.m1("Durga");
		test.m1(null);
		
	}
	

}
