package SystemAndMain;

import java.util.Scanner;

import Buildinghas.Owner;
import GUI.BuildingFrame;
import Inheritance.Building;

public class BuildingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildingSys.addBuilding("Apartment","Star", 24, 220, "New York", 0, 4, true, 2250, 8, 0, null, false, false, false, null);
		BuildingSys.addBuilding("Apartment","Sun", 12, 320, "Los Angelos", 0, 3, false, 1850, 7, 0, null, false, false, false, null);
		BuildingSys.addBuilding("Apartment","Earth", 8, 280, "Nevada", 0, 5, true, 1400, 5, 0, null, false, false, false, null);
		BuildingSys.addBuilding("Villa","Mars", 32, 320, "New Jersey", 0, 0, false, 0, 0, 100, "Dublex", true, false, false, null);
		BuildingSys.addBuilding("Villa","Venus", 44, 225, "Colarado", 0, 0, false, 0, 0, 65, "Triplex", false, false, false, null);
		BuildingSys.addBuilding("Villa","Black Hole", 13, 240, "Teksas", 0, 0, false, 0, 0, 140, "Forleks", true, false, false, null);
		BuildingSys.addBuilding("Bungalov", "Mercury", 5, 160, "Ohio", 0, 0, false, 0, 0, 0, null, false, true, true, "Gable Roof");
		BuildingSys.addBuilding("Bungalov", "Uranus", 21, 120, "Kansas", 0, 0, false, 0, 0, 0, null, false, false, true, "Gable Roof");
		BuildingSys.addBuilding("Bungalov", "Neptun", 43, 210, "Florida", 0, 0, false, 0, 0, 0, null, false, true, false, "Round Roof");
		
		BuildingSys.searchBuilding("Star").getOwners().add(new Owner(101,"Ahmet","Male",19,true));
		BuildingSys.searchBuilding("Sun").getOwners().add(new Owner(102,"Ceren","Female",34,true));
		BuildingSys.searchBuilding("Earth").getOwners().add(new Owner(103,"Alper","Male",62,true));
		BuildingSys.searchBuilding("Mars").getOwners().add(new Owner(104,"Sude","Female",54,true));
		BuildingSys.searchBuilding("Venus").getOwners().add(new Owner(105,"Kerem","Male",47,true));
		BuildingSys.searchBuilding("Black Hole").getOwners().add(new Owner(106,"Ayse","Female",22,true));
		BuildingSys.searchBuilding("Uranus").getOwners().add(new Owner(107,"Erdem","Male",29,true));
		BuildingSys.searchBuilding("Earth").getOwners().add(new Owner(108,"Ece","Female",33,true));
		BuildingSys.searchBuilding("Sun").getOwners().add(new Owner(109,"Tugba","Female",45,true));
		BuildingSys.searchBuilding("Star").getOwners().add(new Owner(110,"Steve","Male",46,false));
		BuildingSys.searchBuilding("Mercury").getOwners().add(new Owner(111,"Meg","Female",37,false));
		BuildingSys.searchBuilding("Venus").getOwners().add(new Owner(112,"Alex","Male",18,false));
		BuildingSys.searchBuilding("Star").getOwners().add(new Owner(110,"Jesica","Female",53,false));
		
		BuildingFrame bf= new BuildingFrame();
		bf.setVisible(true);
	}

}
