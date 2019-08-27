package applicationLaunch;

import org.testng.Assert;

public class AssertFalse {

	public  void test1() {
		
		Assert.assertFalse(true);

	}
	
	public void test2()
	{
		Assert.assertFalse(false);
	}

}
