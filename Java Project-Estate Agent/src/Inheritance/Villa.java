package Inheritance;

public class Villa extends Building{

	private double gardenArea;
	private String villaType;
	private boolean pool;
	
	public Villa() {
		super();
		this.gardenArea = 0.0;
		this.villaType = "";
		this.pool = false;
	}


	public Villa(String buildingName, int buildingAge, double buildingArea, String buildingAddress,
			double buildingPrice, double gardenArea, String villaType, boolean pool) {
		super(buildingName, buildingAge, buildingArea, buildingAddress, buildingPrice);
		this.gardenArea = gardenArea;
		this.villaType = villaType;
		this.pool = pool;
	}

	
	public double getGardenArea() {
		return gardenArea;
	}


	public void setGardenArea(double gardenArea) {
		this.gardenArea = gardenArea;
	}


	public String getVillaType() {
		return villaType;
	}


	public void setVillaType(String villaType) {
		this.villaType = villaType;
	}


	public boolean isPool() {
		return pool;
	}


	public void setPool(boolean pool) {
		this.pool = pool;
	}

	

	@Override
	public String toString() {
		return "\nVilla"+ super.toString()+  "\nGardenArea: " + gardenArea + "\nVillaType: " + villaType + "\nPool: " + pool + "\n";
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
		
		if(pool)
		{
			price*=1.12;
		}
		buildingPrice=price;
		
	}
	
	
}
