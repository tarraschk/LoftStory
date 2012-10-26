import java.awt.Color;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Eau extends Aliment{
	public Eau(int qteEnerg, int[] pos) {
		super(qteEnerg, pos);
		int[][] tabColors = {
				{Color.black.getRGB(), Color.blue.getRGB(), Color.black.getRGB()},
				{Color.black.getRGB(), Color.blue.getRGB(), Color.black.getRGB()},
				{Color.black.getRGB(), Color.black.getRGB(), Color.black.getRGB()}
		};
		this.representationGraphique = tabColors;
	}
}