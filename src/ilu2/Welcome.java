package ilu2;

public class Welcome {
    public static String welcome(String nom) {
        StringBuilder chaine = new StringBuilder();
        String name = nom.trim();
        if (name == null || name.length() == 0) {
        	chaine.append("Hello, my friend");
        } else {
        if (name.equals(name.toUpperCase())) {
        	chaine.append("HELLO, ");
        	chaine.append(name.toUpperCase());
        	chaine.append(" !");
        } else {
	        chaine.append("Hello, ");
	        chaine.append(Character.toUpperCase(name.charAt(0))); 
	        chaine.append(name.substring(1)); 
       }
       }
        return chaine.toString();
    }
}

