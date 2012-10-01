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
