import java.awt.Color;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Biere extends Aliment{
	public Biere(int qteEnerg, int[] pos) {
		super(qteEnerg, pos);
		int[][] tabColors = {
				{Color.black.getRGB(), Color.yellow.getRGB(), Color.black.getRGB()},
				{Color.black.getRGB(), Color.yellow.getRGB(), Color.black.getRGB()},
				{Color.black.getRGB(), Color.black.getRGB(), Color.black.getRGB()}
		};
		this.representationGraphique = tabColors;
	}
}