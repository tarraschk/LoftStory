
public class MorganMagnin extends Neuneu{
	
	public MorganMagnin(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		super(nom,prenom, genre, qteEnerg, pos);
	}

	@Override
	public void seDeplacer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manger(Aliment bouffe) {
		// TODO Auto-generated method stub
		
	}
	
	public PowerRanger seTranformer(String nom, String prenom, Genre genre, int qteEnerg, int[] pos){
		return new PowerRanger(nom, prenom, genre, qteEnerg, pos);
	}

}
