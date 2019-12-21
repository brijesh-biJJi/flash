package junittest;



public class calculatetest {

	calculate calculation = new calculate(); 
	int sum = calculation.sum(2, 5); 
	int testSum = 7;
	
	@Test public void testSum() 
	{ 
		System.out.println("@Test sum(): " + sum + " = " + testSum); 
		assertEquals(sum, testSum); 
	}

}
