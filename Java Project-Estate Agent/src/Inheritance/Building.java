package Inheritance;

import java.util.ArrayList;
import java.math.BigDecimal;

import Buildinghas.Owner;
import Interface.BuildingInterface;

public abstract class Building implements BuildingInterface {

	protected String buildingName;
	protected int buildingAge;
	protected double buildingArea;
	protected String buildingAddress;
	protected double buildingPrice;
	
	protected ArrayList<Owner> owners= new ArrayList<>();
	
	public Building() {
		this.buildingName = "";
		this.buildingAge = 0;
		this.buildingArea = 0.0;
		this.buildingAddress = "";
		this.buildingPrice = 0.0;
	}
	
	public Building(String buildingName, int buildingAge, double buildingArea, String buildingAddress,
			double buildingPrice) {
		this.buildingName = buildingName;
		this.buildingAge = buildingAge;
		this.buildingArea = buildingArea;
		this.buildingAddress = buildingAddress;
		this.buildingPrice = buildingPrice;
	}
	
	

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getBuildingAge() {
		return buildingAge;
	}

	public void setBuildingAge(int buildingAge) {
		this.buildingAge = buildingAge;
	}

	public double getBuildingArea() {
		return buildingArea;
	}

	public void setBuildingArea(double buildingArea) {
		this.buildingArea = buildingArea;
	}

	public String getBuildingAddress() {
		return buildingAddress;
	}

	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public double getBuildingPrice() {
		return buildingPrice;
	}

	public void setBuildingPrice(double buildingPrice) {
		this.buildingPrice = buildingPrice;
	}

	@Override
	public String toString() {
		return "\nBuilding Name: " + buildingName + "\nBuilding Age: " + buildingAge + "\nBuilding Area: "
				+ buildingArea + "\nBuilding Address: " + buildingAddress + "\nBuildingPrice: " + String.format("%.1f", buildingPrice) ;
	}
	
	public abstract void calcPrice();
	


	public boolean addOwner(int ownerId, String name, String gender, int age, boolean isCitizen)
	{
		Owner temp = new Owner(ownerId,name,gender,age,isCitizen);

		for(int i=0;i<owners.size();i++)
		{
			if(ownerId== owners.get(i).getOwnerId())
			{
				return false;
			}
		}
		
		owners.add(temp);
		return true;
		
	}
	
	
	public ArrayList<Owner> getOwners() {
		return owners;
	}


	public boolean deleteOwner(int ownerId)
	{
		for(int i=0;i<owners.size();i++)
		{
			if(ownerId== owners.get(i).getOwnerId())
			{
				owners.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public String displayAllOwner()
	{
		String out="";
		for(int i=0;i<owners.size();i++)
		{
			out+=owners.get(i).toString()+ "\n";
		}
		
		return out;
	}
	
	@Override
	public String durabilityTest() {
		
		if(buildingAge > 40)
		{
			return "Weak";
		}
		else if(buildingAge > 20 && buildingAge <= 40)
		{
			return "Satisfactory";
		}
		else
		{
			return "Strong";
		}
	}
	
	
	
	
}
