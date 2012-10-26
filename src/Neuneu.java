
public abstract class Neuneu extends Aliment{

	protected String nom;
	protected String prenom;
	protected Genre genre;
	protected Aliment[] habitudesAlimentaires;

	public Neuneu(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(qteEnerg, pos);
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
	}

	public abstract void seDeplacer();

	public abstract void manger(Aliment bouffe);

	public void seReproduire(){
		Aliment var = this.loft.cases[this.position[0]][this.position[1]].getFirst();
		int [] posVide = new int[2];
		boolean posTrouvee = false;
		for (int i=0; i<this.loft.dimensions[0]; i++) {
			for (int y=0; y<this.loft.dimensions[1]; y++) {
				if (this.loft.cases[i][y] == null && !posTrouvee) {
					posVide[0] = i;
					posVide[1] = y;
					posTrouvee = true;
				}
			}
		}
		if (var.quantiteEnergetique >= 50 && this.quantiteEnergetique >= 50) {
			var.quantiteEnergetique -= 50;
			this.quantiteEnergetique -= 50;
			Genre genre = new Genre();
			genre.nom = (Math.random() > 0.5)? "Feminin":"Masculin";
			Erratique petit = new Erratique(this.nom, ((Neuneu) var).prenom, genre, 100, posVide);
			this.loft.population.add(petit);
			this.loft.cases[posVide[0]][posVide[1]].add(petit);
			if (var.quantiteEnergetique == 0)
				((Neuneu) var).etreExclu();
			if (this.quantiteEnergetique == 0)
				((Neuneu) this).etreExclu();
		}
		else if (var.quantiteEnergetique < 50 && this.quantiteEnergetique < 50) {
			((Neuneu) var).etreExclu();
			((Neuneu) this).etreExclu();
		}
		else if (var.quantiteEnergetique >= 50 && this.quantiteEnergetique < 50)
			((Neuneu) this).etreExclu();
		else if (var.quantiteEnergetique < 50 && this.quantiteEnergetique >= 50)
			((Neuneu) var).etreExclu();
	}

	public void vivre() {
		this.seDeplacer();

		if (this.quantiteEnergetique == 0) {
			this.etreExclu();
			return;
		}
		
		Object legume;
		if (this.loft.cases[this.position[0]][this.position[1]].size() != 0)
			legume = this.loft.cases[this.position[0]][this.position[1]].getFirst();
		else
			legume = null;
		if (legume != null) {
			if (legume instanceof Neuneu)
				if ((this.genre.nom != ((Neuneu)legume).genre.nom) && !(this instanceof Cannibale))
					this.seReproduire();
				else if (this instanceof Cannibale)
					this.manger((Aliment)legume);
				else
					this.etreExclu();
			else {
				boolean aime = false;
				for (Aliment hab : this.habitudesAlimentaires) {
					if (legume.getClass() == hab.getClass()) {
						aime = true;
					}
				}
				if (aime) {
					this.manger((Aliment)legume);
				}
			}
		}
	}

	public void etreExclu(){
		super.estDetruit();
		this.loft.retirer(this.identifiant);	
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Aliment[] getHabitudesAlimentaires() {
		return habitudesAlimentaires;
	}
	public void setHabitudesAlimentaires(Aliment[] habitudesAlimentaires) {
		this.habitudesAlimentaires = habitudesAlimentaires;
	}
}
