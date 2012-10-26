/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class PowerRanger extends Neuneu{
	private int toursRestants;
	public PowerRanger(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom, prenom, genre, qteEnerg, pos);
		this.setToursRestants((int) (Math.random() * 10));
	}

	/* (non-Javadoc)
	 * @see Neuneu#seDeplacer()
	 */
	@Override
	public void seDeplacer() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see Neuneu#manger(Aliment)
	 */
	@Override
	public void manger(Aliment bouffe) {
		// TODO Auto-generated method stub
		
	}

	public MorganMagnin seTranformer(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		return new MorganMagnin(nom, prenom, genre, qteEnerg, pos);
	}

	/**
	 * @return the toursRestants
	 */
	public int getToursRestants() {
		return toursRestants;
	}

	/**
	 * @param toursRestants the toursRestants to set
	 */
	public void setToursRestants(int toursRestants) {
		this.toursRestants = toursRestants;
	}
}
