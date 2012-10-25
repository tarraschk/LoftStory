

public class Vorace extends Neuneu{

	public Vorace(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom,prenom, genre, qteEnerg, pos);
	}

	@Override
	public void seDeplacer() {
		int distanceMin = this.loft.dimensions[0]+this.loft.dimensions[1];
		int [] positionMin = new int[2];
		Aliment[][] cases = this.loft.cases;
		int nvDistance = 0;
		for (int i = 0; i<this.loft.dimensions[0]; i++) {
			for (int j = 0; j<this.loft.dimensions[1]; j++) {
				if (cases[i][j] != null && !(cases[i][j] instanceof Neuneu)) {
					nvDistance = Math.abs(i-this.position[0])+Math.abs(j-this.position[1]);
					if (nvDistance <= distanceMin && nvDistance != 0) {
						distanceMin = nvDistance;
						positionMin[0] = i;
						positionMin[1] = j;
					}
				}
			}
		}
		if (distanceMin != this.loft.dimensions[0]+this.loft.dimensions[1]) {
			if (this.quantiteEnergetique <= nvDistance)
				this.quantiteEnergetique = 0;
			else {
				this.quantiteEnergetique -= nvDistance;
				this.position[0] = positionMin[0];
				this.position[1] = positionMin[1];
			}
		}
		else {
			for (int i = 0; i < 10; i++) {
				double choix = 10*Math.random();
				if (0<=choix && choix<=4)
					if (this.position[1]-1 >= 0)
						this.position[1]--;
					else
						this.position[1]++;
				if (5<=choix && choix<=9)
					if (this.position[0]+1 < this.loft.dimensions[0])
						this.position[0]++;
					else
						this.position[0]--;
				if (10<=choix && choix<=14)
					if (this.position[1]+1 < this.loft.dimensions[1])
						this.position[1]++;
					else
						this.position[1]--;
				if (15<=choix && choix<=19)
					if (this.position[0]-1 >= 0)
						this.position[0]--;
					else
						this.position[0]++;
			}
			if (this.quantiteEnergetique <= 10)
				this.quantiteEnergetique = 0;
			else
				this.quantiteEnergetique -= 10;
		}
	}

	@Override
	public void manger(Aliment bouffe) {
		this.quantiteEnergetique += bouffe.quantiteEnergetique;
		bouffe.estDetruit();
	}
}
