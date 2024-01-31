package CoreJavapkg.com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {

	
	
	
	@Test
	public void TestRun()
	{
		
//		ps.DoThis();
		
		int a = 4;
		PS2 ps2 = new PS2(a); 
		DoThis(); 
		System.out.println(ps2.increment()); 
		System.out.println(ps2.Decrement());
		//PS3 ps3 = new PS3(a); 
		System.out.println(ps2.MultiplyTwo());
		System.out.println(ps2.MultiplyThree());
	}
	
//	@BeforeMethod
//	public void BeforeRun1()
//	{
//		System.out.println("Run me first");
//	}

}
