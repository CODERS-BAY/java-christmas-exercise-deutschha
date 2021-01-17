package view;


import java.util.Arrays;
import java.util.Scanner;

import controller.ElfUtil;
import model.Santa;
import model.Elf;
import model.Presents;
public class Console {
	private String pwdSanta;
	private String pwdChild;
	private String pwdelf;
	private int countgeschnek = 0;
	public Object[] arr = new Object[1];
	
	Scanner scan = new Scanner(System.in);
	

	public Console(String pwdSanta, String pwdChild, String pwdelf) {
		super();
		this.pwdSanta = pwdSanta;
		this.pwdChild = pwdChild;
		this.pwdelf = pwdelf;	
		
	}
	public Console() {
		// falls ein weiterer Afuruf benötigt wird
	}
	
	public void dialog() {
		boolean programm = true;
		do {
		System.out.println("Bitte Passwort eingeben, für Wünsche -'kind'- eingeben: ");
		String pwd = scan.next();
		switch (pwd) {
		case "kind":
			geschWunsch();
			break;
		case "Santa":
			abfrage();
			break;
		case "Elf":
			elfarbeit();
			Elf eingabeE = new Elf();
			break;
		default:
			System.out.println("Das Passowrt ist nicht korrket");
		}
		}
		while(programm);
	}
		
		
	public void geschWunsch() {
		String name;
		String strasse;
		String hausnr;
		String geschenk;

		// 
		System.out.println("Bitte Namen eingeben");
		name = scan.next();
		System.out.println("Strasse in der du wohnst");
		strasse = scan.next();
		System.out.println("Nummer deines Hauses");
		hausnr = scan.next();
		System.out.println("Was wünscht du dir?");
		geschenk = scan.next();
		Presents present = new Presents(name,strasse,hausnr,geschenk);
		arr[countgeschnek] = present; 
		System.out.println("Dein Wunsch" + arr[countgeschnek]);
		erweitern();
		System.out.println("Speicher erweitert" + arr.length);
		System.out.println("Zähler" + countgeschnek);
		countgeschnek ++;
		
	}

	public void erweitern(){
		Object [] subarr = new Object[arr.length + 1];
		System.arraycopy(arr, 0, subarr, 0, arr.length);
		arr = subarr;
	}
	
	public void abfrage() {
		System.out.println(" Hallo Santa, suchen oder abrfragen? ");
		System.out.println(" Suchen = 1;");
		System.out.println(" Abfragen = 2;");
		System.err.println(" Alles andere = ENDE!!");
		int eingabe = scan.nextInt();
		if (eingabe == 2) {
			try {
				System.out.println("Anzahl der bestellten geschenkt Geschenke: " );
				System.out.println(countgeschnek);
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			}
			catch(NullPointerException e) {
				System.out.println("Noch keine Geschenke bestellt!");
			}

		}
		else if (eingabe == 1) {
			
			suche();
		}
		else {
			System.out.println("Programm beendet!");
		}
	}
	
	public void suche() {
		System.out.println("Name des Kindes");
		String ein = scan.next();
		System.out.println(ein);	
	}

	@Override
	public String toString() {
		return "Console [arr=" + Arrays.toString(arr) + "]";
	}
	
	public void elfarbeit() {
		if(countgeschnek == 0) {
			System.out.println("Derzeit keine Arbeit!");
		}
		else {
			System.out.println("Hallo willst du beladen = 1 oder sortieren = 2");
			int ein = scan.nextInt();
			ElfUtil laden = new ElfUtil();
			if(ein == 1) {
				laden.laden();
			}
			else if(ein == 2) {
				laden.sortieren();
			}
			else {
				System.out.println("falsche Eingabe!");
			}
		}
	}

}

