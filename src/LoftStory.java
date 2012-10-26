import java.util.LinkedList;
import java.util.Scanner;

/**
 * 1 oct. 2012 by  maxime
 * LoftStory
 */

/**
 * @author maxime
 *
 */
public class LoftStory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Benjamin Castaldi : 'Ahahahah, bienvenue dans le Loft !'");
		System.out.println("Benjamin Castaldi : 'Je vous laisse saisir les informations basiques'");
		System.out.println("Nombre de tours à jouer :");
		
		// Création d'un scanner pour récupérer les informations de l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du Loft :");
		
		// La valeur tapée sera le nom du Loft
		String nomLoft = sc.nextLine();
		
		// La valeur tapée sera le nombre de tours à jouer au maximum
		int nbTours = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre de Lofteurs au départ :");
		
		// La valeur tapée sera le nombre de Lofteurs au départ
		int nbLofteurs = Integer.parseInt(sc.nextLine());
		System.out.println("Dimensions du Loft (largeur) :");
		
		// La valeur tapée sera la largeur de la salle
		int tailleLargeur = Integer.parseInt(sc.nextLine());
		System.out.println("Dimensions du Loft (hauteur) :");
		
		// La valeur tapée sera la hauteur de la salle
		int tailleHauteur = Integer.parseInt(sc.nextLine());
		
		LinkedList<Aliment> population = null;
		//Génération des premiers Lofteurs
		
		Loft loft;
		int[] tableauTaille = new int[2];
		tableauTaille[0] = tailleHauteur;
		tableauTaille[1] = tailleLargeur;
		
		loft = new Loft(nomLoft, tableauTaille, population, nbTours);
	}

}
