package com.skilldistillery.sanctuary;

public class Cow extends Animal {
	
/////Fields
	private static String noise = "MOOOOOOOOOO";
	

	//////Methods
	@Override
	public void makeNoise()
	{
		System.out.println(noise);
		
	}
	
	public void eat(int amountOfFood) 
	{
		System.out.println(noise + " I love eathing these " 
										+ amountOfFood + " bails of hay");
	}
	
	
	

}
