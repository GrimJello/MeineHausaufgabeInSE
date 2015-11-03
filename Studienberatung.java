import java.util.*;

public class Studienberatung {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hast du Abitur?");
		String antwort = scanner.nextLine();
		
		if(antwort.equalsIgnoreCase("Ja")) {
			
		} else if (antwort.equalsIgnoreCase("Nein")) {
			System.out.println("Bist du wissbegierig?");

		} else {
			System.out.println("ERROR");

		}
	}


}