package mainLogic;

public class MainProgram {

	public static void main(String[] args) {
		
		ProductInformation obj_product_information = new ProductInformation();
		ProductUnitCalculation obj_product_unit_calculation = new ProductUnitCalculation();
		UserInput obj_user_input = new UserInput();
		
		String user_inserted_product_name = obj_user_input.getProductName();
		float user_inserted_floor_space = obj_user_input.getFloorSpace();
		
		
		int per_unit_product_cost = obj_product_information.getPerUnitProductCost(user_inserted_product_name);
		float final_calculated_cost = obj_product_unit_calculation.getFinalCost(per_unit_product_cost, user_inserted_floor_space);

	}

}
