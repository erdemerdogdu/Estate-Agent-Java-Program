package SystemAndMain;

import java.util.HashSet;

import Inheritance.Apartment;
import Inheritance.Building;
import Inheritance.Bungalov;
import Inheritance.Villa;

public class BuildingSys {

	private static HashSet<Building> buildingSet = new HashSet<>();
	private static int countofBuilding=0;
	
	public static boolean addBuilding(String type,String buildingName,int buildingAge,double buildingArea,
						String buildingAddress,double buildingPrice,int noOfLivingUnit, boolean elevator,
						double condoFee,int noOfFlorrs,double gardenArea,String villaType,boolean pool,
						boolean fireplace, boolean jacuzzi, String roofType)
	{
		if(type.equalsIgnoreCase("Apartment"))
		{
			countofBuilding++;
			 return buildingSet.add(new Apartment(buildingName,buildingAge,buildingArea,
					buildingAddress,buildingPrice,noOfLivingUnit,elevator,condoFee,noOfFlorrs));
		}
		else if(type.equalsIgnoreCase("Villa"))
		{
			countofBuilding++;
			return buildingSet.add(new Villa(buildingName,buildingAge,buildingArea,
					buildingAddress,buildingPrice,gardenArea,villaType,pool));
		}
		else
		{
			countofBuilding++;
			return buildingSet.add(new Bungalov(buildingName,buildingAge,buildingArea,
					buildingAddress,buildingPrice,fireplace,jacuzzi,roofType));
		}
		
	}
	
	public static boolean removeBuilding(String buildingName)
	{
		for(Building a: buildingSet)
		{
			if(a.getBuildingName().equalsIgnoreCase(buildingName))
			{
				buildingSet.remove(a);
				countofBuilding--;
				return true;
			}
		}
		
		return false;
	}
	
	public static String getAllBuilding()
	{
		String out="There are " + countofBuilding + " Buildings\n";
		
		for(Building temp : buildingSet)
		{
			out+= temp.toString();
		}
		
		return out;
	}
	
	public static Building searchBuilding(String buildingName)
	{
		for(Building a: buildingSet)
		{
			if(a.getBuildingName().equalsIgnoreCase(buildingName))
			{
				return a;
			}
		}
		return null;
	}

	public static HashSet<Building> getBuildingSet() {
		return buildingSet;
	}
	
	public static String[] getBuildingName()
	{
		String[] array = new String[buildingSet.size()];
		int count=0;
		for(Building a : buildingSet)
		{
			array[count] = a.getBuildingName();
			count++;
		}
		
		return array;
	}

	
	
	
}
