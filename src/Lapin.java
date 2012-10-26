import java.awt.Color;
import java.util.LinkedList;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Lapin extends Neuneu{
	public Lapin(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom, prenom, genre, qteEnerg, pos);
		int[][] tabColors = {
				{Color.pink.getRGB(), Color.white.getRGB(), Color.pink.getRGB()},
				{Color.white.getRGB(), Color.pink.getRGB(), Color.white.getRGB()},
				{Color.pink.getRGB(), Color.white.getRGB(), Color.pink.getRGB()}
		};
		this.representationGraphique = tabColors;
	}

	/* (non-Javadoc)
	 * @see Neuneu#seDeplacer()
	 */
	@Override
	public void seDeplacer() {
		int distanceMin = this.loft.dimensions[0]+this.loft.dimensions[1];
		int [] positionMin = new int[2];
		LinkedList<Aliment> population = this.loft.population;
		int nvDistance = 0;
		for (int i = 0; i<population.size(); i++) {
			nvDistance = Math.abs(population.get(i).position[0]-this.position[0])+Math.abs(population.get(i).position[1]-this.position[1]);
			if (nvDistance <= distanceMin && nvDistance != 0) {
				distanceMin = nvDistance;
				positionMin[0] = population.get(i).position[0];
				positionMin[1] = population.get(i).position[1];
			}
		}
		if (this.quantiteEnergetique <= nvDistance)
			this.quantiteEnergetique = 0;
		else {
			this.quantiteEnergetique -= nvDistance;
			
			this.estDetruit();
			this.loft.cases[positionMin[0]][positionMin[1]].add(this);
			this.position[0] = positionMin[0];
			this.position[1] = positionMin[1];
		}		
	}

	/* (non-Javadoc)
	 * @see Neuneu#manger(Aliment)
	 */
	@Override
	public void manger(Aliment bouffe) {
		this.quantiteEnergetique += bouffe.quantiteEnergetique;
		bouffe.estDetruit();		
	}
}
