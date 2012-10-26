import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PixelLoft extends JFrame {
	private Container c;

	public PixelLoft(int[] dim, Loft loft) {
		super("Loft");
		this.initialize(dim, loft);
	}

	private void initialize(int[] dim, Loft loft) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		JPanel panel = new LoftPanel(dim, loft);
		panel.setPreferredSize(new Dimension(dim[0]*9, dim[1]*9));
		c.add(panel);
	}

	class LoftPanel extends JPanel {
		private BufferedImage img;
		private int width;
		private int height;
		private Loft loft;

		public LoftPanel(int[] dim, Loft loft) {
			super();
			this.width = dim[0]*9;
			this.height = dim[1]*9;
			this.loft = loft;
		}

		public void paint(Graphics g) {
			int imgWidth = width;
			int imgHeight = height;
			img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);
			int absCases = 0;
			int ordCases = 0;
			for (int i = 4; i < imgWidth-4; i += 9) {
				ordCases = 0;
				for (int j = 4; j < imgHeight-4; j += 9) {
					int w = 0;
					int nbAlimentCase = this.loft.cases[absCases][ordCases].size();
					for (int a = i-3; a <= i+3; a += 3) {
						for (int b = j-3; b <= j+3; b += 3){
							if (nbAlimentCase != 0) {
								if (w+1<=nbAlimentCase) {
									img.setRGB(a-1, b-1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[0][0]);
									img.setRGB(a-1, b, this.loft.cases[absCases][ordCases].get(w).representationGraphique[0][1]);
									img.setRGB(a-1, b+1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[0][2]);									img.setRGB(a-1, b-1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[0][0]);
									img.setRGB(a, b-1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[1][0]);
									img.setRGB(a, b, this.loft.cases[absCases][ordCases].get(w).representationGraphique[1][1]);
									img.setRGB(a, b+1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[1][2]);
									img.setRGB(a+1, b-1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[2][0]);
									img.setRGB(a+1, b, this.loft.cases[absCases][ordCases].get(w).representationGraphique[2][1]);
									img.setRGB(a+1, b+1, this.loft.cases[absCases][ordCases].get(w).representationGraphique[2][2]);
								}
							}
							else {
								img.setRGB(a-1, b-1, Color.WHITE.getRGB());
								img.setRGB(a-1, b, Color.WHITE.getRGB());
								img.setRGB(a-1, b+1, Color.WHITE.getRGB());
								img.setRGB(a-1, b-1, Color.WHITE.getRGB());
								img.setRGB(a, b-1, Color.WHITE.getRGB());
								img.setRGB(a, b, Color.WHITE.getRGB());
								img.setRGB(a, b+1, Color.WHITE.getRGB());
								img.setRGB(a+1, b-1, Color.WHITE.getRGB());
								img.setRGB(a+1, b, Color.WHITE.getRGB());
								img.setRGB(a+1, b+1, Color.WHITE.getRGB());
							}
							w++;
						}
					}
					ordCases++;
				}
				absCases++;
			}
			g.drawImage(img, 0, 0, null);
		}
	}
}
