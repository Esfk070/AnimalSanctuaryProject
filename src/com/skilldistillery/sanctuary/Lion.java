package com.skilldistillery.sanctuary;

public class Lion extends Animal  
{
	/////Fields
	private static String noise = "ROAAAAARRRRR";
	

	//////Methods
	@Override
	public void makeNoise()
	{
		System.out.println(noise);
		
	}
	
	public void eat(int amountOfFood) 
	{
		System.out.println(noise + " I love eathing these " 
										+ amountOfFood + " steaks");
	}
	
	

}
