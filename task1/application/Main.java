package application;

import java.util.Scanner;

import model.Elf;
import view.Console;
import model.Presents;
import view.Console;

public class Main {
	
	static Console ablauf = new Console();
	public static void main(String[] args) {
		
	dialog();
	}

	public static void dialog() {
		Scanner scan = new Scanner(System.in);
		boolean programm = true;
		do {
			System.out.println("Bitte Passwort eingeben, für Wünsche -'kind'- eingeben: ");
			String pwd = scan.next();
			switch (pwd) {
			case "kind":
				ablauf.geschWunsch();
				break;
			case "Santa":
				ablauf.abfrage();
				break;
			case "Elf":
				ablauf.elfarbeit();
				Elf eingabeE = new Elf();
				break;
			default:
				System.out.println("Das Passowrt ist nicht korrket");
			}
		} while (programm);
	}

}
