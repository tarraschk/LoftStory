import java.util.LinkedList;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class Cannibale extends Neuneu{
	public Cannibale(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom, prenom, genre, qteEnerg, pos);
	}

	/* (non-Javadoc)
	 * @see Neuneu#seDeplacer()
	 */
	@Override
	public void seDeplacer() {
		int distanceMin = 0;
		int [] positionMin = new int[2];
		LinkedList<Aliment> population = this.loft.population;
		int nvDistance = 0;
		for (int i = 0; i<population.size(); i++) {
			nvDistance = (int) (Math.pow(population.get(i).position[0]-this.position[0], 2)+Math.pow(population.get(i).position[1]-this.position[1], 2));
			if (nvDistance >= distanceMin) {
				distanceMin = nvDistance;
				positionMin[0] = population.get(i).position[0];
				positionMin[1] = population.get(i).position[1];
			}
		}
		if (this.quantiteEnergetique <= nvDistance)
			this.quantiteEnergetique = 0;
		else {
			this.quantiteEnergetique -= nvDistance;
			this.position[0] = positionMin[0];
			this.position[1] = positionMin[1];
		}
	}

	/* (non-Javadoc)
	 * @see Neuneu#manger(Aliment)
	 */
	@Override
	public void manger(Aliment bouffe) {
		if (bouffe instanceof Neuneu) {
			this.quantiteEnergetique += bouffe.quantiteEnergetique;
			((Neuneu) bouffe).etreExclu();
		}
		else {
			this.quantiteEnergetique += bouffe.quantiteEnergetique;
			bouffe.estDetruit();
		}
	}
}
