import org.newdawn.slick.SlickException;

/**
 * This class represents one stone on the screen
 */
public class Stone extends Sprite {

	// Acts as a normal sprite for now.
	public Stone(String image_src, int x, int y, boolean access) throws SlickException {
		super(image_src, x, y, access);
	}

}