/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public abstract class Aliment {
	
	protected int identifiant;
	protected String nom;
	protected int quantiteEnergetique;
	protected int[] position;
	protected int[] representationGraphique;
	protected Loft loft;
	
	public Aliment(String nom, int qteEnerg, int[] pos) {
		this.nom = nom;
		this.quantiteEnergetique = qteEnerg;
		this.position = pos;
	}
	
	void afficher() {
		
	}
	
	void estDetruit() {
		
	}
	
	/**
	 * @return the identifiant
	 */
	public int getIdentifiant() {
		return identifiant;
	}
	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the quantiteEnergetique
	 */
	public int getQuantiteEnergetique() {
		return quantiteEnergetique;
	}
	/**
	 * @param quantiteEnergetique the quantiteEnergetique to set
	 */
	public void setQuantiteEnergetique(int quantiteEnergetique) {
		this.quantiteEnergetique = quantiteEnergetique;
	}
	/**
	 * @return the position
	 */
	public int[] getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int[] position) {
		this.position = position;
	}
	/**
	 * @return the representationGraphique
	 */
	public int[] getRepresentationGraphique() {
		return representationGraphique;
	}
	/**
	 * @param representationGraphique the representationGraphique to set
	 */
	public void setRepresentationGraphique(int[] representationGraphique) {
		this.representationGraphique = representationGraphique;
	}
	/**
	 * @return the loft
	 */
	public Loft getLoft() {
		return loft;
	}
	/**
	 * @param loft the loft to set
	 */
	public void setLoft(Loft loft) {
		this.loft = loft;
	}
	
	
}
