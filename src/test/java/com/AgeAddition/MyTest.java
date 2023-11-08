package com.AgeAddition;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

@Test
public void testadd1()
{
	NumberCalculation num=new NumberCalculation();
Assert.assertEquals(-5,num.add());
}
@Test
public void testsub1()
{
	NumberCalculation num=new NumberCalculation();
Assert.assertEquals(-15,num.sub());
}
@Test
public void testmulti1()
{
	NumberCalculation num=new NumberCalculation();
Assert.assertEquals(-50,num.multi());
}
@Test
public void testdiv1()
{
	NumberCalculation num=new NumberCalculation();
Assert.assertEquals(-2,num.div());
}
}


