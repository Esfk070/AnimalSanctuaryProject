package com.skilldistillery.sanctuary;

public class Duck extends Animal {
/////Fields
	private static String noise = "Quack";
	

	//////Methods
	@Override
	public void makeNoise()
	{
		System.out.println(noise);
		
	}
	
	public void eat(int amountOfFood) 
	{
		System.out.println(noise + "\n"+ "I love eating these " 
				+ amountOfFood + " seeds");
	}
	
	
	
	
	
	

}
