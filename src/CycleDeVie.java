import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class CycleDeVie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] dimensions = {20, 20};
		int limiteNbTours = 100;
		LinkedList<Aliment> population = new LinkedList<Aliment>();
		Loft loftMain = new Loft("Essai", dimensions, population, limiteNbTours);

		Genre masc = new Genre();
		masc.nom = "Masculin";

		Genre fem = new Genre();
		fem.nom = "Feminin";

		int[] position = new int[2];
		position[0] = 0;
		position[1] = 19;
		Banane banana = new Banane(50, position);

		int[] position1 = new int[2];
		position1[0] = 19;
		position1[1] = 0;
		Biere biere = new Biere(150, position1);

		int[] position2 = new int[2];
		position2[0] = 19;
		position2[1] = 19;
		Eau eau = new Eau(1000, position2);

		int[] position3 = new int[2];
		position3[0] = 15;
		position3[1] = 15;
		CordonBleu cordonbleu = new CordonBleu(150, position3);

		int[] position4 = new int[2];
		position4[0] = 5;
		position4[1] = 5;
		Pates pate = new Pates(10, position4);

		int[] position5 = new int[2];
		position5[0] = 0;
		position5[1] = 0;
		Erratique erratique1 = new Erratique("Truc", "Machin", masc, 100, position5);

		int[] position6 = new int[2];
		position6[0] = 18;
		position6[1] = 18;
		Erratique erratique2 = new Erratique("Sainte", "Maria", fem, 100, position6);

		int[] position7 = new int[2];
		position7[0] = 1;
		position7[1] = 8;
		Cannibale cannibale1 = new Cannibale("Von", "Pierre", masc, 10, position7);

		int[] position8 = new int[2];
		position8[0] = 18;
		position8[1] = 14;
		Cannibale cannibale2 = new Cannibale("Lady", "Eleonore", fem, 10, position8);

		int[] position9 = new int[2];
		position9[0] = 10;
		position9[1] = 4;
		Vorace vorace = new Vorace("Lagrange", "Hubert", masc, 100, position9);

		int[] position10 = new int[2];
		position10[0] = 1;
		position10[1] = 1;
		Lapin lapinne = new Lapin("Luth", "Diana", fem, 1, position10);

		erratique1.loft = loftMain;
		erratique2.loft = loftMain;
		cannibale1.loft = loftMain;
		cannibale2.loft = loftMain;
		vorace.loft = loftMain;
		lapinne.loft = loftMain;

		erratique1.habitudesAlimentaires = new Aliment[2];
		erratique1.habitudesAlimentaires[0] = banana;
		erratique1.habitudesAlimentaires[1] = eau;

		erratique2.habitudesAlimentaires = new Aliment[1];
		erratique2.habitudesAlimentaires[0] = banana;

		cannibale1.habitudesAlimentaires = new Aliment[1];
		cannibale1.habitudesAlimentaires[0] = cordonbleu;

		cannibale2.habitudesAlimentaires = new Aliment[1];
		cannibale2.habitudesAlimentaires[0] = pate;

		vorace.habitudesAlimentaires = new Aliment[1];
		vorace.habitudesAlimentaires[0] = biere;

		lapinne.habitudesAlimentaires = new Aliment[1];
		lapinne.habitudesAlimentaires[0] = eau;

		loftMain.ajouter(banana);
		loftMain.ajouter(biere);
		loftMain.ajouter(eau);
		loftMain.ajouter(cordonbleu);
		loftMain.ajouter(pate);
		
		loftMain.ajouter(erratique1);
		loftMain.ajouter(erratique2);
//		loftMain.ajouter(cannibale1);
//		loftMain.ajouter(cannibale2);
//		loftMain.ajouter(vorace);
//		loftMain.ajouter(lapinne);
		
		Timer refreshTimer = new Timer();
		LoftTimerTask refreshTask = new LoftTimerTask();
		refreshTask.limiteNbTours = limiteNbTours;
		refreshTask.loftMain = loftMain;
		refreshTimer.scheduleAtFixedRate(refreshTask, 0, 5000);
		
		System.out.println("Tout est ok !");
	}
}
