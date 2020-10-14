//Author: Deborah 
public class Driver{

	public static void main (String [] arg) {
		//Fish is actually a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish();  //nemo is an object while fish is class

		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();


		//nemo.Eat(); //superclass call sublass method - not possible


		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish(); // another object
		//dory.Swim();
		//dory.color = "pink"; // tukar value
		//dory.SetColor("pink");
		//dory.Swim();

		//Aquarium fancyAquarium = new Aquarium();
		//fancyAquarium.fillFish();
	}

}