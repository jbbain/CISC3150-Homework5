
public class Duck extends LandAnimal implements Animal, WaterAnimal{
	//Implemented from Animal 
	public String getHello(){
		return ("Quack") ;
	}
	
	public boolean isAMammal(){
		return false;
	}
	public Boolean isCarnivorous(){
		return false;
	}
	
	
	
	//From abstract class LandAnimal
	public int getNumberOfLegs(){
		return 2;
	}
	
	public boolean hasATail(){
		return false;
	}
	
	
	
	//Implemented from WaterAnimal
	public boolean hasGills(){
		return false;
	}
	
	public boolean laysEggs(){
		return true;
	}
				

	
	

}
