package com.skilldistillery.sanctuary;

public class Attendant {
	
	public void makeRounds(Animal[] animalArray)
	{
		System.out.println("Dum de dum, I love taking care of my Animal friends...");
		System.out.println();
		for (int i = 0; i < animalArray.length; i++)
		{
			int num = (int)(Math.random()*10);
			if (animalArray[i] != null)
			{
				System.out.println("I will feed " + animalArray[i].getName() + " " + num + " foods "+ "\n"
						+ animalArray[i].eat(num));						///START HERE
				System.out.println();
			}
			else
			{
				System.out.println("The enclosure is Empty!! On to the next one");
			}
			
			
		}
		System.out.println("Break time!!!");
		
	}
	
	
	

}
