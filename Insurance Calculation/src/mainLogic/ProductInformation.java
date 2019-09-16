package mainLogic;

import java.util.HashMap;
import java.util.Map;

public class ProductInformation {

	private Map<String, Integer> product_name_and_cost = new HashMap<String, Integer>();
	
	//a database can be used to store information
	public ProductInformation() {
		product_name_and_cost.put("Kompakt", 650);
		product_name_and_cost.put("Optimal", 700);
	}
	
	public Integer getPerUnitProductCost(String product_name) {
		
		return product_name_and_cost.get(product_name);
	}

}
