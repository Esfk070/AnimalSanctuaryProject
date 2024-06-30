# AnimalSanctuaryProject

## Overview

* AnimalSanctuaryApp
    * Instantiates instance of itself in main in order to call launchApp()
    * Instantiates Sanctuary and Scanner objects. (Also instantiates attendant)
    * Menu is setup with while loop that only exits when exit option is chosen
    * Menu has the ability to List animals in array, add new animals, start the attendant's rounds, and quit out of the program.
* Sanctuary
    * Creates animal array
    * setAttendant method takes an attendant object and assigns it to Sanctuary's Attendant field
    *listAnimals method prints name for each animal object
    * addAnimal takes an animal object and adds it to the animalArray
    *startAttendantRounds calls makeRounds method
* Attendant
    * makeRounds() accepts the animalArray and prints information from various classes
* Animal, Duck, Lion, Cow
    * Animal is parent class of Duck Lion and Cow.  Animal contains the name field, makeNoise and eat methods which are inherited by Duck, Lion, and Cow. Animal also has get and set methods for the private name field
    * Duck, Cow and Lion have class specific classes makeNoise and eat that override parents class methods
  
## Technologies Used

* Java
* Object-Oriented Programming
   * Inheritance
   * Polymorphism

## Lessons Learned
* Gained a deeper understanding of when to use static fields.  In this instance they were used to form constants that would hold true throughout all instances of the object
* practiced instantiating objects from different classes in order to call their fields and methods
* implemented getters and setters to access private fields