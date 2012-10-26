import java.awt.Color;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class CordonBleu extends Aliment{
	public CordonBleu(int qteEnerg, int[] pos) {
		super(qteEnerg, pos);
		int[][] tabColors = {
				{Color.orange.getRGB(), Color.orange.getRGB(), Color.orange.getRGB()},
				{Color.pink.getRGB(), Color.pink.getRGB(), Color.pink.getRGB()},
				{Color.orange.getRGB(), Color.orange.getRGB(), Color.orange.getRGB()}
		};
		this.representationGraphique = tabColors;
	}
}