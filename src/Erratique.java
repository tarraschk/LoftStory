import java.awt.Color;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Erratique extends Neuneu{
	public Erratique(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom, prenom, genre, qteEnerg, pos);
		int[][] tabColors = {
				{Color.gray.getRGB(), Color.gray.getRGB(), Color.gray.getRGB()},
				{Color.gray.getRGB(), Color.gray.getRGB(), Color.gray.getRGB()},
				{Color.gray.getRGB(), Color.gray.getRGB(), Color.gray.getRGB()}
		};
		this.representationGraphique = tabColors;
	}

	/* (non-Javadoc)
	 * @see Neuneu#seDeplacer()
	 */
	@Override
	public void seDeplacer() {
		this.estDetruit();
		for (int i = 0; i < 10; i++) {
			double choix = 10*Math.random();
			if (0<=choix && choix<=4) {
				if (this.position[1]-1 >= 0)
					this.position[1]--;
				else
					this.position[1]++;
			}
			else if (5<=choix && choix<=9) {
				if (this.position[0]+1 < this.loft.dimensions[0])
					this.position[0]++;
				else
					this.position[0]--;
			}
			else if (10<=choix && choix<=14) {
				if (this.position[1]+1 < this.loft.dimensions[1])
					this.position[1]++;
				else
					this.position[1]--;
			}
			else if (15<=choix && choix<=19) {
				if (this.position[0]-1 >= 0)
					this.position[0]--;
				else
					this.position[0]++;
			}
		}
		if (this.quantiteEnergetique <= 10)
			this.quantiteEnergetique = 0;
		else {
			this.quantiteEnergetique -= 10;
			this.loft.cases[this.position[0]][this.position[1]].add(this);
		}
	}
	/* (non-Javadoc)
	 * @see Neuneu#manger(Aliment)
	 */
	@Override
	public void manger(Aliment bouffe) {
		double qte = Math.random()*100;
		if (qte  >= bouffe.quantiteEnergetique) {
			this.quantiteEnergetique += bouffe.quantiteEnergetique;
			bouffe.estDetruit();
		}
		else {
			this.quantiteEnergetique += qte;
			bouffe.quantiteEnergetique -= qte;
		}
	}
}