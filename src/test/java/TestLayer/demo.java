package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.Baseclass;
@Listeners(TestLayer.ExtendReportListener.class)
public class demo extends Baseclass{

	
	@Test
	public void m1() {
		System.out.println("m1");
	}
	@Test
	public void m2() {
		System.out.println("m2");
	}
	@Test
	public void m3() {
		System.out.println("m3");
		Assert.assertEquals(true, false);
	}
	@Test
	public void m4() {
		System.out.println("m4");
	}
}
