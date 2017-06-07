/***************************************************************************************************/
/*Jared Bain																			Homework #5*/
/*CISC3150																		   December 4, 2014*/
/***************************************************************************************************/




public class Dog extends LandAnimal implements Animal{
	
	//Implemented from Animal
	public String getHello(){
		return ("Bark") ;
	}
	
	public boolean isAMammal(){
		return true;
	}
	public Boolean isCarnivorous(){
		return true;
	}
	
	
	public Dog(){
		super();
		getNumberOfLegs();
		hasATail();
	}
		
	
	//From abstract class LandAnimal
	public int getNumberOfLegs(){
				return 4;
	}
	
	public boolean hasATail(){
		return true;
	}
}
