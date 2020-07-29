package sudoku.userinterface;

public interface IuserInterfaceContract {
	interface EventListener {
		void onSudokuInput(int x, int y, int input);
		void inDialogClick();
	}
	
	interface view {
		void setListener(IuserInterfaceContract.EventListener listener);
		void updateSquare(int x, int y, int input);
		void updateBoard(SudokuGame game);
		void showDialog(String message);
		void showError(String message)
	}
}
