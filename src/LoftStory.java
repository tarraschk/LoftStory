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
		System.out.println("Nombre de tours � jouer :");
		
		// Cr�ation d'un scanner pour r�cup�rer les informations de l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du Loft :");
		
		// La valeur tap�e sera le nom du Loft
		String nomLoft = sc.nextLine();
		
		// La valeur tap�e sera le nombre de tours � jouer au maximum
		int nbTours = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre de Lofteurs au d�part :");
		
		// La valeur tap�e sera le nombre de Lofteurs au d�part
		int nbLofteurs = Integer.parseInt(sc.nextLine());
		System.out.println("Dimensions du Loft (largeur) :");
		
		// La valeur tap�e sera la largeur de la salle
		int tailleLargeur = Integer.parseInt(sc.nextLine());
		System.out.println("Dimensions du Loft (hauteur) :");
		
		// La valeur tap�e sera la hauteur de la salle
		int tailleHauteur = Integer.parseInt(sc.nextLine());
		
		LinkedList<Aliment> population = null;
		//G�n�ration des premiers Lofteurs
		
		Loft loft;
		int[] tableauTaille = new int[2];
		tableauTaille[0] = tailleHauteur;
		tableauTaille[1] = tailleLargeur;
		
		loft = new Loft(nomLoft, tableauTaille, population, nbTours);
	}

}
