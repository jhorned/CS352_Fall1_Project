import java.util.LinkedList;
import java.util.Random;

public class ContestDriver {
	public static void main(String[] args) {
    //two arraylists to swap positions of contestants
		LinkedList<Contestant> contestants = new LinkedList<>(), newContestants = new LinkedList<>();

		boolean flipCoin = false;

		System.out.println("Running");
    
    //initiating variables to help with simplicity
    final int rounds = 12;
    final int participants = 8;
    final int contestantsTurn = 0;

    //initiating new Contestant objects and adding them to the local variables
		for(int i=0; i<participants; i++) {
		  Contestant x = new Contestant("Person"+ i, i);
		  contestants.add(x);
		}

    //copying over all contestants to newContestants and starting the program timer
		System.out.println("Total objects: "+contestants.size());
		newContestants.addAll(contestants);
    long startTime = System.nanoTime();

    //looping through each round
    for (int i=0; i<rounds; i++) {

      flipCoin = new Random().nextBoolean();

      //if contestant gets it wrong then he goes to the back of the line and everyone moves up one position
      if (!flipCoin) {
        newContestants.add(contestants.get(contestantsTurn));
        newContestants.remove(contestantsTurn);
      }

      //loops through and adds position to positionList arrayList in Contestant class
      for (Contestant j: newContestants) {
        j.setPosition(newContestants.indexOf(j));
      }
    }

    //stops the timer and prints the time in microsecnonds
    long stopTime = System.nanoTime();
    System.out.println((stopTime - startTime) / 1000000.0 + " microseconds.");
  

		System.out.println("Finished");

	}
}