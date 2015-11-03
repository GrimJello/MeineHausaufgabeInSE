import java.util.*;

public class Studienberatung {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hast du Abitur?");
		String antwort = scanner.nextLine();
		
		if (antwort.equalsIgnoreCase("Ja")) {
			System.out.println("Bist du wissbegierig?");
			String antwort2 = scanner.nextLine();

			if (antwort2.equalsIgnoreCase("Ja")) {
				System.out.println("Auf jeden Fall studieren, Alda!");

			
			} else if (antwort2.equalsIgnoreCase("Nein")) {
				System.out.println("Lieber nicht studieren!");

			
			} else {
				System.out.println("VERTIPPT ERROR ERROR ERROR");

			}
			
			
		} else if(antwort.equalsIgnoreCase("Nein")) {
			System.out.println("Hast du Fachabitur?");
			String antwort3 = scanner.nextLine();

			if (antwort3.equalsIgnoreCase("Ja")) {
			
			
			} else if (antwort3.equalsIgnoreCase("Nein")) {
				System.out.println("Lieber nicht studieren!");

			
			} else {
				System.out.println("VERTIPPT ERROR ERROR ERROR");

			}
			

		} else {
			System.out.println("VERTIPPT ERROR ERROR ERROR");
		
	}


}

}