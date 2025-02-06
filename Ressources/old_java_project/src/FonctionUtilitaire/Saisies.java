package FonctionUtilitaire;

import java.util.Scanner;

public class Saisies {
	public static String saisieString(String texte) {
		String p;
		System.out.println(texte);
		p=new Scanner(System.in).nextLine();
		return p;
	}
	public static void remplissageTab1d(char[] tab, char fill) {
		for(int i=0; i<tab.length;i++) {
			tab[i]=fill;
		}
	}
	public static void remplissageTab2d(String[][] tab, String fill) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				tab[i][x]=fill;
			}
		}
	}
	public static void remplissageTab2d(boolean[][] tab, boolean fill) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				tab[i][x]=fill;
			}
		}
	}
	public static char saisieChar(String texte) {
		char p;
		String s;
		do {
			System.out.println(texte);
			s=new Scanner(System.in).nextLine();
		}while(s.length()==0);
		p=s.charAt(0);
		return p;
	}
	public static boolean encore() {
		String rep;
		do {
			System.out.println("Voulez vous recommencer ? (oui/non)");
			rep=new Scanner(System.in).nextLine();
		}while(!rep.equalsIgnoreCase("oui")&&!rep.equalsIgnoreCase("non"));
		if(rep.equalsIgnoreCase("oui")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static char saisieCharPendu(String texte) {
		char lettre=' ';
		boolean ok;
		do{
			ok=true;
			try{
				System.out.println(texte);
				lettre=(new Scanner(System.in)).nextLine().toLowerCase().charAt(0);
			}
			catch (java.lang.StringIndexOutOfBoundsException e) {  // si String vide débordement de tableau
				System.out.println("on vous a demandé au moins un lettre");
				ok=false;

			}
			if(lettre<61 || lettre>122) { // code ascii de a et de z
				System.out.println("ce n'est pas une lettre");
				ok=false;
			}
		}while (!ok);
		return lettre;
	}
	public static int saisieInt(String texte) {
		int nb=0;
		boolean ok;
		do {
			ok=true;
			try {
				System.out.println(texte);
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("Eh m'fieu, cesteu nein un entier dis");
				ok=false;
			}
		}while(!ok);
		return nb;
	}
}
