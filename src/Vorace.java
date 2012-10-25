import java.util.LinkedList;


public class Vorace extends Neuneu{

	public Vorace(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom,prenom, genre, qteEnerg, pos);
	}

	@Override
	public void seDeplacer() {
		int distanceMin = 0;
		int [] positionMin = new int[2];
		Aliment[][] cases = this.loft.cases;
		int nvDistance = 0;
		for (int i = 0; i<this.loft.dimensions[0]; i++) {
			for (int j = 0; j<this.loft.dimensions[1]; j++) {
				if (cases[i][j] != null && !(cases[i][j] instanceof Neuneu)) {
					nvDistance = (int) (Math.pow(i-this.position[0], 2)+Math.pow(j-this.position[1], 2));
					if (nvDistance >= distanceMin) {
						distanceMin = nvDistance;
						positionMin[0] = i;
						positionMin[1] = j;
					}
				}
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

	@Override
	public void manger(Aliment bouffe) {
			this.quantiteEnergetique += bouffe.quantiteEnergetique;
			bouffe.estDetruit();
	}
}
