package testGame;

import java.awt.Shape;
import java.awt.color.ColorSpace;


public class HumanPlayer extends Player { 
	
	
	private Shape playerShape;	
	
	private int playerScore;
	private String playerName;
	private boolean playerIsAlive;
	private ColorSpace playerColor;
	public HumanPlayer(int playerScore,String playerName,boolean playerIsAlive,ColorSpace playerColor,Shape playerShape )
	{
		super (playerScore,playerName,playerIsAlive,playerColor);
		this.playerShape =  playerShape;
	}
	public Shape getPlayerShape() {
		return playerShape;
	}
	public void setPlayerShape(Shape playerShape) {
		this.playerShape = playerShape;
	}
	
	
	
	

}
