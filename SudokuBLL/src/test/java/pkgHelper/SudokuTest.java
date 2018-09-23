package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {

	@Test
	public void isPartialSudoku() {
	
		int[][] sudokuTester = {
				{8,6,0,0,2,0,0,0,0},
				{0,0,0,7,0,0,0,5,9},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,6,0,8,0,0},
				{0,4,0,0,0,0,0,0,0},
				{0,0,5,3,0,0,0,0,7},
				{0,0,0,0,0,0,0,0,0},
				{0,2,0,0,0,0,6,0,0},
				{0,0,7,5,0,9,0,0,0}
		};
		
		Sudoku Sod = new Sudoku(sudokuTester);
		
		boolean partialSudoku = Sod.isPartialSudoku();
		assertEquals(partialSudoku, true);
	}
	
	@Test
	public void isSudoku() {

		int[][] sudokuTester =
		      {{5, 3, 4, 6, 7, 8, 9, 1, 2},
		       {6, 7, 2, 1, 9, 5, 3, 4, 8},
		       {1, 9, 8, 3, 4, 2, 5, 6, 7},
		       {8, 5, 9, 7, 6, 1, 4, 2, 3},
		       {4, 2, 6, 8, 5, 3, 7, 9, 1},
		       {7, 1, 3, 9, 2, 4, 8, 5, 6},
		       {9, 6, 1, 5, 3, 7, 2, 8, 4},
		       {2, 8, 7, 4, 1, 9, 6, 3, 5},
		       {3, 4, 5, 2, 8, 6, 1, 7, 9}};
		
		Sudoku Sod = new Sudoku(sudokuTester);

		boolean completeSud = Sod.isSudoku();

		assertTrue(completeSud);

	}
	
	@Test
	public void isValueValid() {

		int[][] sudokuTester =
		    {{1,2,3,4},
		     {0,4,2,1},
		     {4,3,1,2},
		     {2,1,4,3}
		      };
		
		Sudoku Sod = new Sudoku(sudokuTester);
		
		boolean validVal = Sod.isValueValid(0,1,3);
		
		assertTrue (validVal);
	}
}
