package testGame;

public class MovePlayerToLeft implements IplayerMovement {
	public int movePlayer(int currentPosition_X_Axis )
	{
		return currentPosition_X_Axis--;
	}

}
