import java.util.LinkedList;


public class CycleDeVie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] dimensions = {20, 20};
		int[] position = new int[2];
		int limiteNbTours = 100;
		LinkedList<Aliment> population = new LinkedList<Aliment>();
		Loft loftMain = new Loft("Essai", dimensions, population, limiteNbTours);
		
		Genre masc = new Genre();
		masc.nom = "Masculin";
		
		Genre fem = new Genre();
		fem.nom = "Feminin";

		position[0] = 0;
		position[1] = 19;
		Banane banana = new Banane(50, position);
		
		position[0] = 19;
		position[1] = 0;
		Biere biere = new Biere(150, position);
		
		position[0] = 19;
		position[1] = 19;
		Eau eau = new Eau(1000, position);
		
		position[0] = 15;
		position[1] = 15;
		CordonBleu cordonbleu = new CordonBleu(150, position);
		
		position[0] = 5;
		position[1] = 5;
		Pates pate = new Pates(10, position);
		
		position[0] = 0;
		position[1] = 0;
		Erratique erratique1 = new Erratique("Truc", "Machin", masc, 100, position);
		
		position[0] = 18;
		position[1] = 18;
		Erratique erratique2 = new Erratique("Sainte", "Maria", fem, 100, position);
		
		position[0] = 1;
		position[1] = 8;
		Cannibale cannibale1 = new Cannibale("Von", "Pierre", masc, 10, position);
		
		position[0] = 18;
		position[1] = 14;
		Cannibale cannibale2 = new Cannibale("Lady", "Eleonore", fem, 10, position);
		
		position[0] = 10;
		position[1] = 4;
		Vorace vorace = new Vorace("Lagrange", "Hubert", masc, 100, position);
		
		position[0] = 1;
		position[1] = 1;
		Lapin lapinne = new Lapin("Luth", "Diana", fem, 1, position);
		
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
		
		loftMain.ajouter(erratique1);
		loftMain.ajouter(erratique2);
		loftMain.ajouter(cannibale1);
		loftMain.ajouter(cannibale2);
		loftMain.ajouter(vorace);
		loftMain.ajouter(lapinne);
		
		while (limiteNbTours != 0 && loftMain.population.size() != 1) {
			loftMain.lancerTour();
			//loftMain.dessiner();
			limiteNbTours--;
		}
		
		if (loftMain.population.size() == 1) {
			System.out.println("Et le vainqueur est ... " + ((Neuneu)loftMain.population.getFirst()).nom);
		}
		else if (limiteNbTours == 0){
			System.out.println("Nombre de vainqueurs: " + String.valueOf(loftMain.population.size()));
			for (int i = 0; i<loftMain.population.size(); i++) {
				System.out.println("Vainqueur " + String.valueOf(i+1) + ": " + ((Neuneu)loftMain.population.get(i)).nom);
			}
		}
		
		System.out.println("Tout est ok !");
	}
}
