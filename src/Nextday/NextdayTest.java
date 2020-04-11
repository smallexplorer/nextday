package Nextday;

import junit.framework.TestCase;

public class NextdayTest extends TestCase {
	public void test1(){
		Date date = new Date(3,29,2020);
		Date date1 = Nextday.nextDay(date);
		Date nextday = new Date(3,30,2020);
		boolean result = nextday.equals(date1);
		System.out.println("@Test Nextday:" + "result1--" + result);
	}
	
	public void test2(){
		Date date = new Date(12,31,-1);
		Date date1 = Nextday.nextDay(date);
		Date nextday = new Date(1,1,1);
		boolean result = nextday.equals(date1);
		System.out.println("@Test Nextday:" + "result2--" + result);
	}
	
	public void test3(){
		Date date = new Date(2,28,2020);
		Date date1 = Nextday.nextDay(date);
		Date nextday = new Date(2,29,2020);
		boolean result = nextday.equals(date1);
		System.out.println("@Test Nextday:" + "result3--" + result);
	}
	
	public void test4(){
		Date date = new Date(2,28,-2021);
		Date date1 = Nextday.nextDay(date);
		Date nextday = new Date(2,29,-2021);
		boolean result = nextday.equals(date1);
		System.out.println("@Test Nextday:" + "result4--" + result);
	}
	
	public void test5(){
		Date date = new Date(2,28,-2020);
		Date date1 = Nextday.nextDay(date);
		Date nextday = new Date(3,1,-2020);
		boolean result = nextday.equals(date1);
		System.out.println("@Test Nextday:" + "result5--" + result);
	}
	
	public void test6(){
		Date date = new Date(2,28,2021);
		Date date1 = Nextday.nextDay(date);
		Date nextday = new Date(3,1,2021);
		boolean result = nextday.equals(date1);
		System.out.println("@Test Nextday:" + "result6--" + result);
	}
}
