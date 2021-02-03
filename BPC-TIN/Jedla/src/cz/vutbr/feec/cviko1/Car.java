package cz.vutbr.feec.cviko1;

public class Car {
	private int[][] array;
	private int[] helpArr = { 7, 2, 4, 5, 0, 6, 8, 3, 1 };
	private int[] winnerArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	private int[] winnerArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };

	public Car() {
		super();
		setArray();
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
