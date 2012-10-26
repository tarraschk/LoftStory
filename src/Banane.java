import java.awt.Color;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Banane extends Aliment {
	public Banane(int qteEnerg, int[] pos) {
		super(qteEnerg, pos);
		int[][] tabColors = {
				{Color.white.getRGB(), Color.white.getRGB(), Color.yellow.getRGB()},
				{Color.white.getRGB(), Color.yellow.getRGB(), Color.yellow.getRGB()},
				{Color.yellow.getRGB(), Color.yellow.getRGB(), Color.yellow.getRGB()}
		};
		this.representationGraphique = tabColors;
	}
}
