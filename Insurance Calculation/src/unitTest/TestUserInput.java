package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import mainLogic.UserInput;

class TestUserInput {

	private UserInput obj_test_user_input = new UserInput("successful", 10f);
	
	@Test
	void testgetProductName() {
		String result = obj_test_user_input.getProductName();
		assertEquals("successful", result);
	}

	@Test
	void testgetFloorSpace() {
		float result = obj_test_user_input.getFloorSpace();
		assertEquals(10f, result);
	}

}
