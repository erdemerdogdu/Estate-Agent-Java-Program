package Inheritance;

public class Bungalov extends Building{

	private boolean fireplace;
	private boolean jacuzzi;
	private String roofType;
	
	public Bungalov() {
		super();
		this.fireplace = false;
		this.jacuzzi = false;
		this.roofType = "";
	}
	
	public Bungalov(String buildingName, int buildingAge, double buildingArea, String buildingAddress,
			double buildingPrice, boolean fireplace, boolean jacuzzi, String roofType) {
		super(buildingName, buildingAge, buildingArea, buildingAddress, buildingPrice);
		this.fireplace = fireplace;
		this.jacuzzi = jacuzzi;
		this.roofType = roofType;
	}


	public boolean isFireplace() {
		return fireplace;
	}

	public void setFireplace(boolean fireplace) {
		this.fireplace = fireplace;
	}

	public boolean isJacuzzi() {
		return jacuzzi;
	}

	public void setJacuzzi(boolean jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

	public String getRoofType() {
		return roofType;
	}

	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}

	
	@Override
	public String toString() {
		return "\nBungalov"+super.toString()+"\nFireplace: " + fireplace + "\nJacuzzi: " + jacuzzi + "\nRoof Type: " + roofType + "\n";
		
	}

	@Override
	public void calcPrice() {
		double price=0;
		if(buildingAge >20)
		{
			price= buildingArea* 8500;
			
		}
		else
		{
			price= buildingArea* 12000;
		}
		
		if(jacuzzi)
		{
			price*=1.08;
		}
		
		if(fireplace)
		{
			price*=1.05;
		}
		
		buildingPrice=price;
	}
	
	
	
}
