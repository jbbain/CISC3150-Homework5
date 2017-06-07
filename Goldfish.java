/***************************************************************************************************/
/*Jared Bain																			Homework #5*/
/*CISC3150																		   December 4, 2014*/
/***************************************************************************************************/
public class Goldfish implements Animal, WaterAnimal {
			
	//Implemented from Animal
	public String getHello(){
		return null;
	}
	
	public boolean isAMammal(){
		return false;
	}
	
	public Boolean isCarnivorous(){
		return false;
	}
	
	
	
	public Goldfish(){
		super();
		hasGills();
		laysEggs();
	}
	
	
	//Implemented from WaterAnimal
	public boolean hasGills(){
		return true;
	}
	public boolean laysEggs(){
		return true;
	}
			


}
