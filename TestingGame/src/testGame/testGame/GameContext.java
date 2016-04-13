package testGame;

public class GameContext {
	private IplayerMovement playerMovement;
	public  GameContext (IplayerMovement playerMovement){
		this.playerMovement = playerMovement;
	}
	
	public int executeMovementStrategy(int currentPosition_X_Axis ) 
	{
		return playerMovement.movePlayer(currentPosition_X_Axis);
	}

}
