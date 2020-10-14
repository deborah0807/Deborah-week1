//Author: Deborah 
public class Driver{

	public static void main (String [] arg) {
		//Fish is actually a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish();  //nemo is an object while fish is class

		nemo.Swim();
		nemo.color = "red"; //tukar value
		nemo.Swim();

		Fish dory = new Fish(); // another object
		dory.Swim();
		dory.color = "pink"; // tukar value
		dory.Swim();
	}

}