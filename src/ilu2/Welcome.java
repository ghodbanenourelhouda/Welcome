package ilu2;

public class Welcome {
    public static String welcome(String nom) {
        StringBuilder chaine = new StringBuilder();
        chaine.append("Hello, ");
        chaine.append(Character.toUpperCase(nom.charAt(0))); // Convertir la première lettre en majuscule
        chaine.append(nom.substring(1)); // Ajouter le reste du nom sans modification
        return chaine.toString();
    }
}

