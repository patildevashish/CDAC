package Assignment1;

abstract class Instrument{
	abstract void play();
	abstract void Tune();
	
}	
class Piano extends Instrument {
		
		@Override
		void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano plays...");
		
	}

		@Override
		void Tune() {
			System.out.println("Tune for Piano..");
		}
			
}
class Guitar extends Instrument {

	@Override
	void play() {
            System.out.println("\nGuitar plays...");
	}

	@Override
	void Tune() {
            System.out.println("Guitar's tune is so fine...");
	}
}

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Instrument i;
            System.out.println("Piano class calls :->\n");
            i= new Piano();
            i.play();
            i.Tune();
            System.out.println("\nGuitar class calls :->");
            i=new Guitar();
            i.play();
            i.Tune();
			
			
	}

}