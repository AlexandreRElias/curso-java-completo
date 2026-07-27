package entities;

import java.util.Date;

public class UsedProduct extends Product{
	
	public Date manufactureDate;
	
	@Override
	public String priceTag() {
		return "name" + price.toString();
	}

}
