package model;
import view.Console;
import java.util.Scanner;
public class Santa {
	private String santaview;
	public Presents geschenke;
	public Console console;
	Scanner scan = new Scanner(System.in);

	public Santa(String santaview) {
		this.santaview = santaview;
		
	}
	
	public void suche() {
		System.out.println("Name des Kindes");
		String ein = scan.next();
		try {
			for (int i= 0; i < geschenke.liste.length; i++) {
				if (geschenke.liste[i].equalsIgnoreCase(ein)) {
					System.out.println("Das Kind "+ geschenke.liste[i] + " wünscht sich \n" + geschenke.liste[i + 3]);
				}
				else {
					System.out.println("Das Kind "+ ein + " hat noch nichts eingetragen.");
				}
			}
		}
		catch (NullPointerException e){
			System.out.println("noch kein Wunsch eingetroffen.");
			new Console().dialog();
		}

		
	}
	
	public Santa() {
		System.out.println(" Hallo Santa, suchen oder abrfragen? ");
		System.out.println(" Suchen = 1;");
		System.out.println(" Abfragen = 2;");
		System.err.println(" Alles andere = ENDE!!");
		int eingabe = scan.nextInt();
		if (eingabe == 2) {
			try {
				System.out.println("Anzahl der bestellten geschenkt Geschenke: " );
				System.out.println(geschenke.liste);
			}
			catch(NullPointerException e) {
				System.out.println("Noch keine Geschenke bestellt!");
				new Console().dialog();
			}

		}
		else if (eingabe == 1) {
			suche();
		}
		else {
			System.out.println("Programm beendet!");
			new Console().dialog();
			
		}

	}

}
