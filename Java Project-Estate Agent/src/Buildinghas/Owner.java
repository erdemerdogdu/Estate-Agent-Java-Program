package Buildinghas;

import java.util.Scanner;

public class Owner {

	private int ownerId;
	private String name;
	private String gender;
	private int age;
	private boolean isCitizen;
	
	public Owner() {
		super();
		this.ownerId = -1;
		this.name = "";
		this.gender = "";
		this.age = 0;
		this.isCitizen = false;
	}
	
	public Owner(int ownerId, String name, String gender, int age, boolean isCitizen) {
		super();
		this.ownerId = ownerId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isCitizen = isCitizen;
	}
	
	public int getOwnerId() {
		return ownerId;
	}


	public void getInput()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("id:");
		ownerId=input.nextInt();
		input.nextLine();
		System.out.println("name:");
		name= input.nextLine();
		System.out.println("gender:");
		gender = input.nextLine();
		System.out.println("age:");
		age= input.nextInt();
		System.out.println("is Citizen(true/false)");
		isCitizen = input.nextBoolean();
		
	}

	@Override
	public String toString() {
		return "\nOwner"+"\nownerId=" + ownerId + "\nname=" + name + "\ngender=" + gender + "\nage=" + age + "\nisCitizen="
				+ isCitizen + "\n";
	}
	
	
	
}
