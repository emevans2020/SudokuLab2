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
	
}
