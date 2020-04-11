package Nextday;

import junit.framework.TestCase;

public class YearTest extends TestCase {
	Year year1 = new Year(2020);
	int year_1 = year1.getYear();
	int year = 2020 ;

	public void testyear(){
		System.out.println("@Test getYear()" + year_1 + "=" + year);
		assertEquals(year, year_1);
	}
	
	public void testyear1(){
		year = -202;
		year1.setYear(-202);
		year_1 = year1.getYear();
		System.out.println("@Test setYear()" + year_1 + "=" + year);
	}
	
}
