package mainLogic;

public class UserInput {
	private String product_name;
	private float living_space;
	
	//to take user input
	public UserInput() {
		product_name = "Optimal";
		living_space = 10f;
	}
	
	//to perform uni test
	public UserInput(String product_name_local, float living_space_local) {
		product_name = product_name_local;
		living_space = living_space_local;
	}
	
	public String getProductName() {
		return product_name;
	}
	
	public float getFloorSpace() {
		return living_space;
	}
	
}
