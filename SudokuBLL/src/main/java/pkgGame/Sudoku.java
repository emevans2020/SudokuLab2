package pkgGame;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	
	public Sudoku () {
		super();
	}

	public Sudoku (int [][] latinsquare) {
		super (latinsquare);
	}
	
	protected int[][] getPuzzle(){
		return super.getLatinSquare();
	}
	
	protected int [] getRegion (int region) {
		
	}
	
	protected int [] getRegion (int region1, int region2) {
		
	}
	
	protected boolean isSudoku() {
		
	}
	
	protected boolean isPartialSudoku() {
		
	}
	
	protected boolean isValueValid (int val, int val1, int val2) {
		
	}
}
