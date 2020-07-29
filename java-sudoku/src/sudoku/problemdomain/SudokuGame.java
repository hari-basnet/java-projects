package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
	
	private final GameSatate gameState;
	private final int[][] gridState;
	
	public static final int GRID_BOUNDARY = 9;
	
	public SudokuGame(final GameSatate gameState, final int[][] gridState) {
		this.gameState = gameState;
		this.gridState = gridState;
	}
	
	public GameSatate getGameState() {
		return gameState;
	}
	
	public int[][] getCopyOfGridState() {
		return SudokuUtilities.copyToNewArray(gridState);
	}
}
