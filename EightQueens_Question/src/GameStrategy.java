public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int column=cellId%8;
		return column;
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int row=cellId/8;
		return row;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................
			 * 
			 */
		//Check for same row
		for(int i=0;i<8;i++)
		{
			if(placedQueens[row][i])
			{
				return isValid=false;
			}
		}
		//Check for same column
		for(int i=0;i<8;i++)
		{
			if(placedQueens[col][i])
				return isValid=false;
		}
		
		//Check for right lower diagonal
		for(int i=row+1,j=col+1; i<8 && j<8;i++,j++)
		{
			if(placedQueens[i][j])
				return isValid=false;
		}
		//Check for right upper diagonal
		for(int i=row-1,j=col+1; i>=0 && j<8;i--,j++)
		{
			if(placedQueens[i][j])
				return isValid=false;
		}
		//Check for left lower diagonal
		for(int i=row+1,j=col-1; i<8 && j>=0;i++,j--)
		{
			if(placedQueens[i][j])
				return isValid=false;
		}
		//Check for left upper diagonal
		for(int i=row-1;j=col-1;i>=0&&j>=0;i--,j--)
		{
			if(placedQueens[i][j])
				return isValid=false;
		}
		if(isValid)
		{
			placedQueens[row][col]=true;
			numQueens++;
		}
	}
}














