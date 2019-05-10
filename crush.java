package com.Orientshahin;

import java.util.Scanner;

public class Crush {



		public void runReponse() {

		this.presentation();
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		this.selectionReponse(nb);
		this.choixQuestions(nb);
		this.rencontre();
		this.rencontreShahin();
	}

		public void presentation() {

			System.out.println("Bonjour et bienvenue à toi !");
			System.out.println("");
			System.out.println("Je suis Seeleha, la créatrice du jeu 'Orient' !");
			System.out.println("");
			System.out.println("Je vais aujourd'hui te donner la possibilité de faire la connaissance de l'un des garçons que tu auras l'occasion de séduire.");
			System.out.println("");
			System.out.println("Mais avant ça, je souhaiterai te poser une question :");
			System.out.println("");
			System.out.println("Sais tu ce qu'est un 'Otome-game' ?");
			System.out.println("1 - Oui");
			System.out.println("2 - Non");
		}

		public void selectionReponse(int nb) {

			if(nb == 1) {
				System.out.println("Oh je vois que j'ai affaire à une personne qui s'y connait ! Parfait ;)");

			} else {
				System.out.println("Je vais t'expliquer tout ça alors ! L'Otome-game est une variante du 'Visual Novel'.");
				System.out.println("Il s'agit d'une histoire intéractive où les choix que tu fais ont un impact sur celle-ci. Dans le cadre d'un otome-game, ton but principal va être de séduire des personnages fictifs.");
			}

		}


		public void choixQuestions(int nb) {
			if (nb == 1) {
				System.out.println("");
				System.out.println("Bon, puisque je n'ai rien à t'apprendre, on peut passer à la suite !");

			} else {
				System.out.println("");
				System.out.println("Bon, maintenant que tu sais tout sur les otome-games, on peut passer à la suite !");
			}
		}

		public void rencontre() {
			System.out.println("");
			System.out.println("Je vais dès à présent te laisser en compagnie de Shahin, l'un des 4 garçons que tu pourras séduire au cours de ton aventure.");
			System.out.println("Tu vas avoir la possibilité de lui poser des questions, auxquelles il te répondra.");
			System.out.println("Fait bien attention cependant, tu ne pourras lui en poser que 3 et pas une de plus.");
			System.out.println("Je m'en vais donc, je te laisse dans les bras du beau Shahin ! A tout à l'heure ;)");
		}


		public void rencontreShahin() {
			System.out.println("");
			System.out.println("Salut, je suis Shahin, mais je crois que tu as déjà eu l'occasion d'entendre parler de moi...");
			System.out.println("Comme te l'a indiqué Seele', tu vas avoir l'occasion de me poser 3 questions parmis celles qui te seront proposées.");
			System.out.println("On m'a défendu de répondre à plus de questions, désolé ;)");
			System.out.println("On y va ?");
			System.out.println("1 - Oui");
			System.out.println("2 - Non");
		}

}
