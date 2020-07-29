package sudoku.userinterface;

import java.awt.Rectangle;
import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;

public class UserInterfaceImpl implements IuserInterfaceContract.view, EventHandler<KeyEvent> {
	
	private final Stage stage;
	private final Group root;
	
	// how do we keep track of 81 different test fields 
	private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;
	
	private IuserInterfaceContract.EventListener listener;
	
	private static final double WINDOW_Y = 732;
	private static final double WINDOW_X = 668;
	private static final double BOARD_PADDING = 50;
	private static final double BOARD_X_AND_Y = 576;
	
	private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);
	private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
	private static final String SUDOKU = "Sudoku";
	
	public UserInterfaceImpl(final Stage stage) {
		this.stage = stage;
		this.root = new Group();
		this.textFieldCoordinates = new HashMap<>();
		initializeUserInterface();
	}
	
	private void initializeUserInterface() {
		drawBackground(root);
		drawTitle(root);
		drawSudokuBoard(root);
		drawTextFields(root);
		drawGridLines(root);
		stage.show();
	}
	
	private void drawBackground(Group root) {
		int xAndY = 114;
		int index = 0;
		while(index < 8) {
			int thickness;
			if(index == 2 || index == 5) {
				thickness = 3;
			} else {
				thickness = 2;
			}
			
			Rectangle verticalLine = getLine(
				xAndY + 64 * index,
				BOARD_PADDING,
				BOARD_X_AND_Y,
				thickness
			)
		}
	}
	
	private void drawTitle(final Group root) {
		
	}
	
	private void drawSudokuBoard(final Group root) {
		
	}
	
	private void drawTextFields(final Group root) {
		
	}
	
	private void drawGridLines(final Group root) {
		
	}
	
	@Override
	public void handle(final KeyEvent keyEvent) {
		
	}
	
	@Override
	public void setListener(final IuserInterfaceContract.EventListener listener) {
		
	}
	
	@Override
	public void updateSquare(final int x, final int y, final int input) {
		
	}
	
	@Override
	public void updateBoard(final SudokuGame game) {
		
	}
	
	@Override
	public void showDialog(final String message) {
		
	}
	
	@Override
	public void showError(final String message) {
		
	}
}
