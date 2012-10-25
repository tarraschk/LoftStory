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
	protected int quantiteEnergetique;
	protected int[] position;
	protected int[] representationGraphique;
	protected Loft loft;
	
	public Aliment(int qteEnerg, int[] pos) {
		this.quantiteEnergetique = qteEnerg;
		this.position = pos;
	}
	
	void afficher() {
		
	}
	
	void estDetruit() {
		this.loft.cases[this.position[0]][this.position[1]]=null;
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
