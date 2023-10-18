package com.Login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppLoginTest {
@Test
public void test1()
{
	AppLogin al=new AppLogin();
	Assert.assertEquals(0, al.checkLogin("manvitha", "manvitha"));
}
@Test
public void test2()
{
	AppLogin al=new AppLogin();
	Assert.assertEquals(1, al.checkLogin("manvitha-mallireddy", "20761A5428"));
}
@Test
public void test3()
{
	AppLogin al=new AppLogin();
	Assert.assertEquals(0, al.checkLogin("manvitha-mallireddy", "manvitha"));
}
@Test
public void test4()
{
	AppLogin al=new AppLogin();
	Assert.assertEquals(0, al.checkLogin("manvitha-mallireddy", "20761a5428"));
}
}
