package com.skilldistillery.sanctuary;

public class Sanctuary {
	//////Fields
	Animal[] animalArray = new Animal[5];
	Attendant willy;
	
	
	///////Methods
	public void setAttendant(Attendant attend)
	{
		this.willy = attend;
	}
	
	public void listAnimals()
	{
		for (int i = 0; i < animalArray.length; i++)
		{
			if (animalArray[i] != null)
			{
				System.out.println(animalArray[i].getName());
			}
			else
			{
				System.out.println("The enclosure is empty");
			}	
		}
	}
	
	public void addAnimal(Animal animl)
	{
		for (int i = 0; i <= animalArray.length; i++)
		{
			
			if(i == animalArray.length)
			{
				System.out.println("Sorry, the sanctuary is full");
			}
			else if (animalArray[i] == null)
			{
				
				animalArray[i] = animl;
				//System.out.println(i + animalArray[i].getName());
				break;
			}
		}
	}
	
	public void startAttendantRounds() 
	{
		willy.makeRounds(animalArray);
	}
	

}///Class
