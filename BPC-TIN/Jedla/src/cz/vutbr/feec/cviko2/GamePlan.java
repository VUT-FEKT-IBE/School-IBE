package cz.vutbr.feec.cviko2;

public class GamePlan {
	private int[][] array;
	private int[] helpArr = { 7, 2, 4, 5, 0, 6, 8, 3, 1 };
	private int[] winnerArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	private int[] winnerArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };

	public GamePlan() {
		super();
		this.array = new int[3][3];
		setArray();
	}

	public int[] findZero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == 0) {
					int[] helpArray = { i, j };
					return helpArray;

				}

			}
		}
		return null;
	}

	public void move(String direction) {
		int[] help = findZero();
		int swapHelp;
		// up
		if (direction.equals("8") || direction.equals("w")) {
			if (help[0] != 0) {
				swapHelp = array[(help[0] - 1)][help[1]];
				array[(help[0] - 1)][help[1]] = 0;
				array[help[0]][help[1]] = swapHelp;

			}
		}
		// down
		else if (direction.equals("2") || direction.equals("s")) {
			if (help[0] != 2) {
				swapHelp = array[(help[0] + 1)][help[1]];
				array[(help[0] + 1)][help[1]] = 0;
				array[help[0]][help[1]] = swapHelp;

			}
		}
		// left
		else if (direction.equals("4") || direction.equals("a")) {
			if (help[1] != 0) {
				swapHelp = array[help[0]][(help[1] - 1)];
				array[help[0]][(help[1] - 1)] = 0;
				array[help[0]][help[1]] = swapHelp;

			}
		}
		// right
		else if (direction.equals("6") || direction.equals("d")) {
			if (help[1] != 2) {
				swapHelp = array[help[0]][(help[1] + 1)];
				array[help[0]][(help[1] + 1)] = 0;
				array[help[0]][help[1]] = swapHelp;

			}
		}
	}

	public void printArray() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public void setArray() {
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = helpArr[k];
				k++;
			}
		}
	}

	public void setWinnerArray() {
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = winnerArray[k];
				k++;
			}
		}
	}

	public void setWinnerArray2() {
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = winnerArray2[k];
				k++;
			}
		}
	}

	public boolean checkIfWinner() {
		int k = 0;
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == winnerArray[k]) {
					count++;
				}
				k++;
			}
		}
		if (count == 9) {
			return true;
		}
		count = 0;
		k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == winnerArray2[k]) {
					count++;
				}
				k++;
			}
		}
		if (count == 9) {
			return true;
		} else {
			return false;
		}
	}

	public int[] getWinnerArray() {
		return winnerArray;
	}

	public void setWinnerArray(int[] winnerArray) {
		this.winnerArray = winnerArray;
	}

	public int[] getWinnerArray2() {
		return winnerArray2;
	}

	public void setWinnerArray2(int[] winnerArray2) {
		this.winnerArray2 = winnerArray2;
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public int[] getHelpArr() {
		return helpArr;
	}

	public void setHelpArr(int[] helpArr) {
		this.helpArr = helpArr;
	}

}
