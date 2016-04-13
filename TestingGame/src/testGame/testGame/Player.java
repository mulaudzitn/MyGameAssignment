package testGame;

import java.awt.color.ColorSpace;

public abstract  class Player {
	
	private int playerScore;
	private String playerName;
	private boolean playerIsAlive;
	private ColorSpace playerColor;
	public Player ( int playerScore , String playerName ,boolean playerIsAlive,ColorSpace playerColor)
	{
		this.playerScore = playerScore;
		this.playerName = playerName;
		this.playerIsAlive =playerIsAlive;
		this.playerColor = playerColor;
	}
	
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public boolean isPlayerIsAlive() {
		return playerIsAlive;
	}
	public void setPlayerIsAlive(boolean playerIsAlive) {
		this.playerIsAlive = playerIsAlive;
	}
	public ColorSpace getPlayerColor() {
		return playerColor;
	}
	public void setPlayerColor(ColorSpace playerColor) {
		this.playerColor = playerColor;
	}
	


}
