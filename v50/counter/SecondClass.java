package counter;

public class SecondClass {

	public static void main(String[] args) {

		Runnable r = () -> {

			for (int i = 0; i < 5; i++) {
				
				synchronized (args) {
				
					System.out.println(Counter.count());
					
				}
				
			}

		};

		for (int i = 0; i < 10; i++) {

			new Thread(r).start();

		}


	}

}
/*

Fr�ga 1: Det blev inte i ordning 
Fr�ga 2: F�r att tr�darna kallar p� samma counter, och h�mtar v�rdet och d� blir det fel.

Fr�ga 3: Ordning.
Fr�ga 4: Ordning.
Fr�ga 5: F�r nu v�ntar funktionen med att svara tills den �r klar varje g�ng

Fr�ga 6: Kaos igen f�r att det inte �r syncat
Fr�ga 7: Oordning
Fr�ga 8: se fr�ga 6


Fr�ga 9: Kaos igen eftersom den returnerar v�rdet syncat med tr�darna �r inte syncade 
Fr�ga 10: Relativit mycket ordning men lite siffror p� fel st�llen. Alla siffror finns
Fr�ga 11: Kanske f�r att tr�darna inte sync:ar

Fr�ga 12: Ordning eftersom tr�darna kommer kalla p� counter synkroniserat
Fr�ga 13: Alla tal kommer ut i ordning
Fr�ga 14: Eftersom kallningen p� counter �r syncad

 */