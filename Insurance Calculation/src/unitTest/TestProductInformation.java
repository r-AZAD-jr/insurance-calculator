package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import mainLogic.ProductInformation;

class TestProductInformation {

	@Test
	void testgetProductCost() {
		ProductInformation obj_test_product_information = new ProductInformation();
		int result = obj_test_product_information.getPerUnitProductCost("Optimal");
		
		assertEquals(700, result);
	}

}
