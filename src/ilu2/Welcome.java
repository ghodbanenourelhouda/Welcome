package ilu2;

public class Welcome {
    public static String welcome(String nom) {
        StringBuilder chaine = new StringBuilder();
        if (nom.equals(nom.toUpperCase())) {
        	chaine.append("HELLO, ");
        	chaine.append(nom.toUpperCase());
        	chaine.append(" !");
        } else {
	        chaine.append("Hello, ");
	        chaine.append(Character.toUpperCase(nom.charAt(0))); 
	        chaine.append(nom.substring(1)); 
       }
        
        return chaine.toString();
    }
}

