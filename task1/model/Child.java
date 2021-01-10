package model;
import java.util.Scanner;
import view.Console;
public class Child {
	public String name;
	public String strasse;
	public String hausnr;
	public String geschenk;
	public int anzahlGeschenke;
	
	

	public Child(String name, String strasse, String hausnr, String geschenk) {
		this.name = name;
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.geschenk = geschenk;	
	}

	public String getGeschenk() {
		return geschenk;
	}

	public void setGeschenk(String geschenk) {
		this.geschenk = geschenk;
	}

	public Child() {
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Hallo, bitte gib deinen Vornamen ein: ");
		name = scan.next();
		System.out.println("Bitte gib die Strasse ein in der du wohnst: ");
		strasse = scan.next();
		System.out.println("Jetzt noch die Hausnummer: ");
		hausnr = scan.next();
		System.out.println("Was wünscht du dir?: ");
		geschenk = scan.next();	
 	}

	private String[] Child() {
		// TODO Auto-generated method stub
		return null;
	}
}
