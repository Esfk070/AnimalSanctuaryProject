package com.skilldistillery.sanctuary;

public class Cow extends Animal {
	
/////Fields
	private static String noise = "MOOOOOOOOOO";
	

	//////Methods
	@Override
	public void makeNoise()
	{
		System.out.println(this.noise);
		
	}
	
	public String eat(int amountOfFood) 
	{
		return(noise +"\n"+ "I love eating these " 
										+ amountOfFood + " bails of hay");
	}
	
	
	

}
