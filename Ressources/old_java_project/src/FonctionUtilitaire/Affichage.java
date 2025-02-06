package FonctionUtilitaire;

public class Affichage {
	public static void affTab(int[] tab) {
		for(int i=0; i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	public static void affTab(double[] tab) {
		for(int i=0; i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	public static void affTab(String[] tab) {
		for(int i=0; i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	public static void affTab(char[] tab) {
		for(int i=0; i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	public static void affTab(boolean[] tab) {
		for(int i=0; i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	public static void affTab2D(String[][] tab) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				System.out.print(tab[i][x]+" ");
			}
			System.out.println();
		}
	}
	public static void affTab2D(boolean[][] tab) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				System.out.print(tab[i][x]+" ");
			}
			System.out.println();
		}
	}
	public static void affTab2D(int[][] tab) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				System.out.print(tab[i][x]+" ");
			}
			System.out.println();
		}
	}
	public static void affTab2DEsp(String[][] tab) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				System.out.print(tab[i][x]+"\t");
			}
			System.out.println();
		}
	}
	public static void affTab2DEsp(boolean[][] tab) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				System.out.print(tab[i][x]+"\t");
			}
			System.out.println();
		}
	}
	public static void affTab2DEsp(int[][] tab) {
		for(int i=0; i<tab.length;i++) {
			for(int x=0;x<tab[0].length;x++) {
				System.out.print(tab[i][x]+"\t");
			}
			System.out.println();
		}
	}
}
