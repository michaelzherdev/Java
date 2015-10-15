package Test;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Calculation.Arithmetics;

public class TestArithmetics {
	
	@Rule
	public final ExpectedException exp = ExpectedException.none();
	/*
	private Arithmetics a;
	
	@BeforeClass	// выполняется один раз и а используется во всех тестах
	public static void runT(){
		 a = new Arithmetics();
	}
	*/
	
	/*
	 *  @After - после выполнения метода
	 *  @AfterClass - исполнять каждый раз после завершения теста метода
	 */
	
	/*@Test
	public void testAdd(){
		Arithmetics a = new Arithmetics();
		double res = a.add(3, 7);
		if(res != 10) Assert.fail();
	}*/
	
	@Test
	public void testAdd(){
		Arithmetics a = new Arithmetics();
		double res = a.add(3, 7);
	//	Assert.assertTrue(res == 10);
	//	Assert.assertFalse(res == 9);
	//	Assert.assertNull(a); // проверка на null. If null -> fail
		Assert.assertEquals(res, 10.0);
	}
	@Test
	public void testDeduct(){
	//	runT();
		Arithmetics a = new Arithmetics();
		double res = a.deduct(7, 7);
		if(res != 0) Assert.fail();
	//	a = null;
	}
	@Ignore // данный тест игнорируется
	@Test
	public void testMult(){
		Arithmetics a = new Arithmetics();
		double res = a.mult(3, 7);
		if(res != 21) Assert.fail();
	}
	@Test
	public void testDiv(){
		Arithmetics a = new Arithmetics();
		double res = a.div(10, 5);
		if(res != 2.0) Assert.fail();
	}
	
	@Test (expected=ArithmeticException.class)
	public void testDivException(){
		Arithmetics a = new Arithmetics();
		a.div(10.0, 0.0);
	}
	
	@Test(timeout=1000) // если выполняется дольше этого времени - fail
	public void testN(){
		while(true){}
	}
	
	
}
