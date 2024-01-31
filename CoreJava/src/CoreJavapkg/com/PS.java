package CoreJavapkg.com;

import org.testng.annotations.BeforeMethod;

public class PS {

	public void DoThis()
	{
		System.out.println("Main Class");
	}
	@BeforeMethod
	public void BeforeRun2()
	{
		System.out.println("Run me second");
	}

}
