import java.util.TimerTask;

public class LoftTimerTask extends TimerTask {
	protected Loft loftMain;
	protected int limiteNbTours;
	protected boolean fin;

	@Override
	public void run() {
		if (limiteNbTours != 0 && loftMain.population.size() != 1) {
			loftMain.lancerTour();
			loftMain.dessiner();
			limiteNbTours--;
		}

		if (loftMain.population.size() == 1) {
			fin = true;
			System.out.println("Et le vainqueur est ... " + ((Neuneu)loftMain.population.getFirst()).nom);
		}
		else if (limiteNbTours == 0){
			fin = true;
			System.out.println("Nombre de vainqueurs: " + String.valueOf(loftMain.population.size()));
			for (int i = 0; i<loftMain.population.size(); i++) {
				System.out.println("Vainqueur " + String.valueOf(i+1) + ": " + ((Neuneu)loftMain.population.get(i)).nom);
			}
		}
		
		if (fin)
			this.cancel();
	}
}