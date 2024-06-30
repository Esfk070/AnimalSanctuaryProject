package com.skilldistillery.sanctuary;

public class Animal {
	/////Fields
	private String name;

	

	/////Methods
	public void makeNoise()
	{
		System.out.println("Animal Noise, should probably be a real animal noise");
	}
	
	
	public void eat(int amountOfFood) {
	
		System.out.println(("I'm eating " + amountOfFood + " foods"));
	}
	
	////Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}



//class notes
//underlined = static

//dont use main, should be just a couple of lines

//UML 
//Hollow Arrow  = extends = "is a"

// diamond arrows = "has a"

//* is zero or more
//1 = 1 attendant