package cz.vutbr.feec.cviko2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String direction;
		GamePlan game = new GamePlan();
		game.printArray();
		while (true) {
			System.out.println("Enter 8 or w for up , 4 or a for left, 2 or s for down, 6 or d for right");
			direction = myObj.next();
			game.move(direction);
			if (game.checkIfWinner() == true) {
				System.out.println("winner of the game");
				game.printArray();
				break;
			}
			game.printArray();
		}
	}

}
