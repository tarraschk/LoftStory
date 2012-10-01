import java.util.LinkedList;


public class Loft {

	protected String nom;
	protected int[] dimensions;
	protected LinkedList<Aliment> population;
	protected Aliment[][] cases;
	protected int limiteNbTours;

	public Loft(String nom, int[] dim, LinkedList<Aliment> pop, int limTours){
		this.nom = nom;
		this.dimensions = dim;
		this.population = pop;
		this.limiteNbTours = limTours;
	}

	public void dessiner(){

	}

	public void ajouter(Aliment objet){
		int idMax = 0;
		for (Aliment obj : population){
			if (obj.identifiant>idMax)
				idMax = obj.identifiant;
		}
		objet.identifiant = idMax+1;
		this.population.add(objet);
	}
	
	public void retirer (int id){
		for (Aliment obj : population) {
			if (obj.identifiant == id) {
				this.population.remove(obj);
			}
		}
	}
	
	public void lancerTour(){
		for (Aliment obj : population) {
			((Neuneu)obj).vivre();
			}
		}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int[] getDimensions() {
		return dimensions;
	}
	public void setDimensions(int[] dimensions) {
		this.dimensions = dimensions;
	}
	public LinkedList<Aliment> getPopulation() {
		return population;
	}
	public void setPopulation(LinkedList<Aliment> population) {
		this.population = population;
	}
	public Aliment[][] getCases() {
		return cases;
	}
	public void setCases(Aliment[][] cases) {
		this.cases = cases;
	}
	public int getLimiteNbTours() {
		return limiteNbTours;
	}
	public void setLimiteNbTours(int limiteNbTours) {
		this.limiteNbTours = limiteNbTours;
	}
}
