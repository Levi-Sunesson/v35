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

Fråga 1: Det blev inte i ordning 
Fråga 2: För att trådarna kallar på samma counter, och hämtar värdet och då blir det fel.

Fråga 3: Ordning.
Fråga 4: Ordning.
Fråga 5: För nu väntar funktionen med att svara tills den är klar varje gång

Fråga 6: Kaos igen för att det inte är syncat
Fråga 7: Oordning
Fråga 8: se fråga 6


Fråga 9: Kaos igen eftersom den returnerar värdet syncat med trådarna är inte syncade 
Fråga 10: Relativit mycket ordning men lite siffror på fel ställen. Alla siffror finns
Fråga 11: Kanske för att trådarna inte sync:ar

Fråga 12: Ordning eftersom trådarna kommer kalla på counter synkroniserat
Fråga 13: Alla tal kommer ut i ordning
Fråga 14: Eftersom kallningen på counter är syncad

 */