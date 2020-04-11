package Nextday;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(NextdayTest.class);
		suite.addTestSuite(YearTest.class);
		//$JUnit-END$
		return suite;
	}

}
