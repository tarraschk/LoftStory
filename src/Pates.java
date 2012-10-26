import java.awt.Color;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Pates extends Aliment{
	public Pates(int qteEnerg, int[] pos) {
		super(qteEnerg, pos);
		int[][] tabColors = {
				{Color.white.getRGB(), Color.white.getRGB(), Color.white.getRGB()},
				{Color.white.getRGB(), Color.black.getRGB(), Color.white.getRGB()},
				{Color.white.getRGB(), Color.white.getRGB(), Color.white.getRGB()}
		};
		this.representationGraphique = tabColors;
	}
}