import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PixelLoft extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c;

	public PixelLoft(int[] dim) {
		super("Loft");
		this.initialize(dim);
	}

	private void initialize(int[] dim) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		JPanel panel = new LoftPanel(dim);
		panel.setPreferredSize(new Dimension(dim[0]*9, dim[1]*9));
		c.add(panel);
	}

	class LoftPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private BufferedImage img;
		private int width;
		private int height;

		public LoftPanel(int[] dim) {
			super();
			width = dim[0]*9;
			height = dim[1]*9;
		}

		public void paint(Graphics g) {
			int imgWidth = width;
			int imgHeight = height;
			img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);

			for (int i = 4; i < imgWidth-1; i += 9) {
				for (int j = 4; j < imgHeight-1; j += 9) {
					int col = (j % 2==0?Color.BLACK.getRGB():Color.WHITE.getRGB());
					img.setRGB(i, j, col);
				}
			}
			g.drawImage(img, 0, 0, null);
		}
	}
}
