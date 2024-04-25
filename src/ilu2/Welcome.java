package ilu2;

public class Welcome {
	public static String welcome (String nom) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Hello, ");
		chaine.append(nom);
		return chaine.toString();
	}
}
