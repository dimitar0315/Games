package dominos;

public class DominoTile {
	int leftSideBlock;
	int rightSideBlock;
	
	//int[] block;
	
	
	public DominoTile() {
		leftSideBlock = 0;
		rightSideBlock = 0;
	}
	
	
	public DominoTile(int _leftSide, int _rightSide) {
		if(_leftSide>=0 && _leftSide<=6) {
			leftSideBlock = _leftSide;
		}
		
		if(_rightSide>=0 && _rightSide<=6) {
			rightSideBlock = _rightSide;
		}	
	}


	public int getLeftSideBlock() {
		return leftSideBlock;
	}



	public int getRightSideBlock() {
		return rightSideBlock;
	}
	
	
	public void swapSides(int _leftSide, int _rightSide) {
		int swapper = 0;
		swapper = _leftSide;
		_leftSide = _rightSide;
		_rightSide = swapper;
	}
	
	public String toString() {
		
	//to right something because i thing some is bugged	
		
		return null;
	}
	
	public String whichNumberIsIt( int Side) {
		String picture = null;
		if(Side==0) {
			picture = "   \n   \n   ";
		}else if(Side==1) {
			picture = "   \n * \n   ";
		}
		return picture;
	}
	
	
	
	
	public boolean equals(int _leftSide, int _rightSide) {
		if(leftSideBlock ==_rightSide && rightSideBlock == _leftSide) {
			return true;
		}else if(leftSideBlock == _leftSide && rightSideBlock==_rightSide){
			return true;
		}else {
			return false;
		}
	}
	
	
}
