package testNgSamples;

import org.testng.annotations.Test;

public class Sample1 {
	int age = 33;
	void display() {
		System.out.println("i am display method");
	}
	
	@Test
  public void testcase1() {
	  
	  System.out.println("i am test case one");
	  System.out.println("age"+age);
	  display();
  }
	
	@Test
	public void testcase2() {
		System.out.println("i am test case 2");
		
	}

	@Test
	public void testcase3() {
		System.out.println("i am test case 3");
	}
	
}
