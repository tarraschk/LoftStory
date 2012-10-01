
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
	
	public abstract void manger();
	
	public void seReproduire(){
		
	}
	
	public void etreExclu(){
		
	}
	
	public void vivre(){
		
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
