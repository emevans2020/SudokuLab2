package pkgGame;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	
	/**  the length of the width/height of the Sudoku puzzle.
	 * 
	 */
	private int	iSize;
	
	private int	iSqrtSize;


	public Sudoku () {
		super();
	}

	public Sudoku (int [][] latinsquare) {
		super (latinsquare);
	}
	
	protected int[][] getPuzzle(){
		return super.getLatinSquare();
	}
	
	/** pass in a given region, get back a one-dimensional array 
	 * of the region's content 
	 * @param r
	 * @return
	 */
	
	// 4lines to figure out start and end
	//nested for loop
	//no more than 8 lines of code
	protected int [] getRegion (int r) {
		int [] reg = new int [super.getLatinSquare().length];
		
		int i = (r % iSqrtSize) * iSqrtSize;
		int j = (r / iSqrtSize) * iSqrtSize;
		
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		
		for (;j < jMax;j++) {
			for (i = (r % iSqrtSize) * iSqrtSize; i<iMax; i++) {
				System.out.print(j + i);
			}
		}
	}
	
	protected int [] getRegion (int iCol, int iRow) {
		int i = (iCol /iSqrtSize) + ((iRow/iSqrtSize)*iSqrtSize);
		return getRegion (i);
	}
	
	protected boolean isSudoku() {
		if ()
		//has to be latinsquare
		//test every region to make sure every region is found in first row
	}
	
	/** return 'true' if... It's a LatinSquare 
	 * If each region doesn't have duplicates 
	 * If each element in the first row of the puzzle is in each region of the puzzle
	 * At least one of the elements is a zero
	 * @return
	 */
	protected boolean isPartialSudoku() {
		int i;
		
		if (super.isLatinSquare() == true && super.ContainsZero() == true ) {
			for (i = 0; i < latinsquare.length; i++) {
				if (super.hasDuplicates(getRegion (r)) == false) {
					if (super.hasAllValues(super.getRow(0), getRegion(r)) == true) {
						return true;
					}
				}
			}
		}
		else
			return false;
	}
	
	/**test to see if a given value would 'work' for a given column / row
	 * 
	 * @param iCol
	 * @param iRow
	 * @param iValue
	 * @return
	 */
	protected boolean isValueValid (int iCol, int iRow, int iValue) {
		for (int i = 0; i <latinsquare.length; i++) {
			for (int j = 0; j <latinsquare.length; j++ ) {
				if (super.getColumn(j)== iValue && super.getRow(i)==iValue) {
					return false;
				}
				else {
					return true;
				}
			}
		}
	}
}