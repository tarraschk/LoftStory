import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PixelLoft extends JFrame {
	private Container c;

	public PixelLoft(int[] dim) {
		super("Loft");
		this.initialize(dim);
	}

	private void initialize(int[] dim) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		JPanel panel = new LoftPanel(dim);
		panel.setPreferredSize(new Dimension(dim[0]*3, dim[1]*3));
		c.add(panel);
	}

	class LoftPanel extends JPanel {
		private BufferedImage img;
		private int width;
		private int height;

		public LoftPanel(int[] dim) {
			super();
			width = dim[0]*3;
			height = dim[1]*3;
		}

		public void paint(Graphics g) {
			int imgWidth = width;
			int imgHeight = height;
			img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);

			for (int i = 1; i < imgWidth-1; i += 3) {
				for (int j = 1; j < imgHeight-1; j += 3) {
					int col = (j % 2==0?Color.BLACK.getRGB():Color.WHITE.getRGB());
					img.setRGB(i, j, col);
				}
			}
			g.drawImage(img, 0, 0, null);
		}
	}
}
