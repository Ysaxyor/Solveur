package solveur;

public class Main {
	public static void main(String[] args){

			Grille g1=new Grille(16,16); //choix de taille de la grille
			//test des murs pour éviter les conflits tout en commentaire pour le moment
			
			//Portal fin = new Portal(14,1,"blue",g1); // choix de la position et couleur du portail
			//Bot botBlue = new Bot(1,1,"blue",g1); //Création du bot et ajout automatique à une grille existante (position, couleur, grille)
			g1.afficher();
			
			/*

			Move goDroiteBlue = new Move(botBlue,"droite"); //On détermine le mouvement d'un bot, peut-être réutiliser pour un même robot avec une même direction
			//On pourra plus tard lister tout les move possibles
			Move goBasBlue = new Move(botBlue,"bas");
			Move goHautBlue = new Move(botBlue,"haut");
			Move goGaucheBlue = new Move(botBlue,"gauche");

			State state1 = new State(g1,goDroiteBlue); //Calcul de la prochaine carte avec un move donné
			state1.getGrille().afficher();

			State state2 = new State(state1.getGrille(),goBasBlue);
			state2.getGrille().afficher();

			State state3 = new State(state2.getGrille(),goGaucheBlue);
			state3.getGrille().afficher();
			*/
			
	}

	}
