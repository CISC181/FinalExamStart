package pkgUT;


import org.apache.poi.ss.formula.functions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class TestPMT {

	@Test
	public void TestPMT() {
		
		//	PMT is a standard function included in apache POI.
		//	For a given r (rate), n (number of payments), p (present value), f (future value), t (how compounding is applied)
		//	this function will determine payment
		
		//	This is an example with known values
		//	PMT returns with negative values (this is typical accounting).  
		
		//TODO: call the PMT method from Loan, and check the amount with a known PV, rate, FV
		double PMT= 0;
		double PMTExpected = 1162.95;		
		assertEquals(PMTExpected, PMT, 0.01);
	}

}

 

