package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import mainLogic.ProductUnitCalculation;

class TestProductUnitCalculation {

	@Test
	void testgetFinalCost() {
		ProductUnitCalculation obj_product_unit_calculatoin = new ProductUnitCalculation();
		float result = obj_product_unit_calculatoin.getFinalCost(700, 10);
		
		assertEquals(7000f, result);
	
	}

}
