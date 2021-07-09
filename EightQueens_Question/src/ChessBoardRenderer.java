public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int row=square/8;
		if(row%2==0)
		{
			if(square%2==0)
				return false;
		}
		else
		{
			if(square%2!=0)
				return false;
		}
		return true;
	}
}
