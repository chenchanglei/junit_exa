package junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
//@RunWith(TestClassRunner.class)
public class Calculatortest {
	private static Calculator calculator=new Calculator();
	@Before //为了保证初始值为默认，Before作用为：下方每个测试用例之前都会初始化
	public void setUp() throws Exception {
		calculator.clear();
	}

	@After //每个测试用例执行完毕收尾
	public void tearDown() throws Exception {
//		calculator.clear();
	}

	@Test
	public void testJia() {
		calculator.jia(2);
		calculator.jia(3);
		assertEquals(5,calculator.getResult());
	}

	@Test
	public void testJian() {
		calculator.jia(10);
		calculator.jian(2);
		assertEquals(8,calculator.getResult());
	}
	
	@Ignore("ignore testKong")  //此标注表明测试用例testKong被忽略
	@Test
	public void testKong() {
		System.out.println("忽略空");
	}

	@Test
	public void testChu() {
		calculator.jia(8);
		calculator.chu(2);
		assertEquals(3,calculator.getResult());
	}
	
	@Test(timeout=1000) //设置死循环时的超时时间，单位毫秒
	public void testSixunhuan(){
		calculator.sixunhuan(0);
		assertEquals(9,calculator.getResult());
	}
	
//	@Test(expected = ArthmeticException.class)
	public void chuByZero(){
		calculator.chu(0);
	}

}
