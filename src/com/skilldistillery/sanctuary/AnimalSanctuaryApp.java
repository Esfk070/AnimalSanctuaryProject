package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	public Sanctuary sanctuary;
	
	private Scanner scanner;
	

	
	
	public static void main(String[] args) {

		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		
		app.launchApp();
		
		
	}
	/////Methods
	public void launchApp() {
		sanctuary = new Sanctuary();
		
		Attendant attend = new Attendant();
		
		sanctuary.setAttendant(attend);
		
		scanner = new Scanner(System.in);
		
		boolean functionRunning = true;
		
		while (functionRunning) 
		{
			printMenu();
			String response = scanner.next();
			if (response.equals("a"))	//List animals
			{
				sanctuary.listAnimals();
			}
			else if(response.equals("b"))// add new animal
			{
				System.out.println("What kind of animal?");
				System.out.println("a. Lion");
				System.out.println("b. Cow");
				System.out.println("c. Duck");
				response = scanner.next();
				
				if (response.equals("a")) {		/// add lion
					Animal animalObj = new Lion();
					System.out.println("Enter animal name");
					String name  = scanner.next();
					animalObj.setName(name);
					sanctuary.addAnimal(animalObj);
					
				}
				if (response.equals("b")) {		/// add cow
					Animal animalObj = new Cow();
					System.out.println("Enter animal name");
					String name  = scanner.next();
					animalObj.setName(name);
					sanctuary.addAnimal(animalObj);
					
				}
				if (response.equals("c")) {		// add duck
					Animal animalObj = new Duck();
					System.out.println("Enter animal name");
					String name  = scanner.next();
					animalObj.setName(name);
					sanctuary.addAnimal(animalObj);
					
				}
			}
			
			else if(response.equals("c"))
			{
				sanctuary.startAttendantRounds();
			
			}
			else if(response.equals("d"))
			{
				System.out.println("Exiting Program");
				break;
			}
			
		}
		
	
		
		scanner.close();

	}
	public void printMenu()
	{
		System.out.println("a. List animals");
		System.out.println("b. Add new animal");
		System.out.println("c. Start the attendant's rounds");
		System.out.println("d. Quit");
		System.out.println("enter lowercalse letter for option");
	}

	
	
}
