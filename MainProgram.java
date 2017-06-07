/***************************************************************************************************/
/*Jared Bain																			Homework #5*/
/*CISC3150																		   December 4, 2014*/
/***************************************************************************************************/
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal [] animal= {new Dog(), new Goldfish(), new Duck()};
		String [] aniName = {"Dog", "Goldfish", "Duck"};
		
		Dog dog = new Dog();
		Goldfish goldfish = new Goldfish();
		Duck duck = new Duck();
		
		for (int i = 0; i< 3; i ++)
		{
			if(animal[i] instanceof Animal)
			{
				System.out.print(aniName[i] + " Mammal "+ animal[i].isAMammal() + " Carnivorous " + animal[i].isCarnivorous() + " Sound " + animal[i].getHello());
			}
			
			if (animal[i] instanceof Dog)
			{
				System.out.println(" Number of Legs are " + dog.getNumberOfLegs() + " Tail " + dog.hasATail());
			}
			
			if (animal [i] instanceof Goldfish){
				System.out.println(" Gills " + goldfish.hasGills() + " Lays Eggs " + goldfish.laysEggs());
			}
			
			if (animal[i] instanceof Duck){
				System.out.println(" Number of Legs " + duck.getNumberOfLegs() + " Tail " + duck.hasATail() + " Gills " + duck.hasGills()+  " Lays Eggs " + duck.laysEggs() );
			}
				
		}
		
		

	}

}
