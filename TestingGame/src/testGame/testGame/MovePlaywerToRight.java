package testGame;

public class MovePlaywerToRight implements IplayerMovement {
	
	public int movePlayer(int currentPosition_X_Axis  )
	{
		return currentPosition_X_Axis++;
	}

}
