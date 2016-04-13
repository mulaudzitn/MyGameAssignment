package gameScreen;

public class FrameSize {
	private final static int WINDOWHEIGHT = 800;
	private final static int WINDOWWIDTH = 600;
	private static int windowHeight;
	private static int windowWidth;
	
	public FrameSize()
	{
		windowHeight = WINDOWHEIGHT;
		windowWidth = WINDOWWIDTH;
				
	}
	
	
	public static int getWindowHeight() {
		return windowHeight;
	}
	public static void setWindowHeight(int windowHeight) {
		if (windowHeight > 0)
		{
			FrameSize.windowHeight = windowHeight;
		}
		else 
			FrameSize.windowHeight = WINDOWHEIGHT;
		
	}
	public static int getWindowWidth() {
		return windowWidth;
	}
	public static void setWindowWidth(int windowWidth) {
		if (windowWidth > 0)
		{
		FrameSize.windowWidth = windowWidth;
		}
		else
			FrameSize.windowWidth = WINDOWWIDTH;
		}
	

}
