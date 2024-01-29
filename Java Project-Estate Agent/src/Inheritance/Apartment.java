package Inheritance;

public class Apartment extends Building {

	
	private int noOfLivingUnit;
	private boolean elevator;
	private double condoFee;
	private int noOfFlorrs;
	
	
	public Apartment() {
		super();
		this.noOfLivingUnit = 0;
		this.elevator = false;
		this.condoFee = 0.0;
		this.noOfFlorrs = 0;
	}
	
	
	

	public Apartment(String buildingName, int buildingAge, double buildingArea, String buildingAddress,
			double buildingPrice, int noOfLivingUnit, boolean elevator, double condoFee, int noOfFlorrs) {
		super(buildingName, buildingAge, buildingArea, buildingAddress, buildingPrice);
		this.noOfLivingUnit = noOfLivingUnit;
		this.elevator = elevator;
		this.condoFee = condoFee;
		this.noOfFlorrs = noOfFlorrs;
	}






	public int getNoOfLivingUnit() {
		return noOfLivingUnit;
	}


	public void setNoOfLivingUnit(int noOfLivingUnit) {
		this.noOfLivingUnit = noOfLivingUnit;
	}


	public boolean isElevator() {
		return elevator;
	}


	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}


	public double getCondoFee() {
		return condoFee;
	}


	public void setCondoFee(double condoFee) {
		this.condoFee = condoFee;
	}


	public int getNoOfFlorrs() {
		return noOfFlorrs;
	}


	public void setNoOfFlorrs(int noOfFlorrs) {
		this.noOfFlorrs = noOfFlorrs;
	}
	
	


	@Override
	public String toString() {
		return "\nApartment"+super.toString()+"\nLiving Unit Number: " + noOfLivingUnit + "\nElevator: " + elevator + "\nCondoFee: " + condoFee
				+ "\nFloor Number: " + noOfFlorrs + "\n";
	}


	@Override
	public void calcPrice() {
		
		if(buildingAge >20)
		{	
			if(noOfLivingUnit > 3)
			{
				buildingPrice= buildingArea* 7150;
			}
			else
			{
				buildingPrice= buildingArea* 8500;
			}
			
		}
		else
		{
			if(noOfLivingUnit > 3)
			{
				buildingPrice= buildingArea* 11250;
			}
			else
			{
				buildingPrice= buildingArea* 12000;
			}
			
		}
		
	}




	

	
}
