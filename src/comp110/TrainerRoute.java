package comp110;

/**
 * Author:
 *
 * Honor Pledge: I certify that no unauthorized assistance has been received or
 * given in the completion of this work. I certify that I understand and could
 * now rewrite on my own, without assistance from collaborators or course staff,
 * the problem set code I am submitting.
 */
public class TrainerRoute {

	void embark(Trainer jaysen) {
		jaysen.chooseGender("male");
		jaysen.moveForward(2);
		jaysen.moveForward(2);
		jaysen.getPokemonFromOak("bulbasaur");
		jaysen.moveBack(2);
		jaysen.turnRight();
		jaysen.moveForward(1);
		jaysen.moveForward(1);
		jaysen.turnLeft();
		jaysen.moveForward(2);
		jaysen.catchPokemon(4);
		jaysen.turnLeft();
		jaysen.moveForward(1);
		jaysen.turnLeft();
		jaysen.moveForward(4);
		jaysen.moveBoulder();
		jaysen.turnLeft();
		jaysen.moveForward(2);
		jaysen.getOnLapras();
		jaysen.moveForward(4);
		jaysen.turnRight();
		jaysen.getOffLapras();
		jaysen.pickupEgg();
		jaysen.turnRight();
		jaysen.moveForward(4);
		jaysen.turnLeft();
		jaysen.moveForward(2);
		jaysen.turnRight();
		jaysen.moveForward(4);
		jaysen.useAttack();
	}

}