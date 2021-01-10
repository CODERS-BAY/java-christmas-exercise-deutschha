package model;
import java.util.Scanner;
import view.Console;

public class Presents{
	public int zaehleralt;
	public String[] liste  = new String[4];
	//public int zaehler;
	public int zaehlen;
	
	
	public Presents() {
		this.zaehlen = zaehlen +1;
		Child eingabe = new Child();
		System.out.println(zaehlen + "neu - alt "+ zaehleralt);
		liste();
		liste[liste.length -4] = eingabe.name;
		liste[liste.length -3] = eingabe.strasse;
		liste[liste.length -2] = eingabe.hausnr;
		liste[liste.length -1] = eingabe.geschenk;
		System.out.println(liste.length);
		System.out.println(zaehlen + "neu - alt "+ zaehleralt);
		ausgabe();
		new Console().dialog();
	}


	private void liste() {
		if (zaehleralt != zaehlen) {
			String[] backup = new String[liste.length + 4] ;
			System.arraycopy(liste, 0, backup, 0, liste.length);
			liste = backup;
			zaehleralt = zaehlen;
		}
	}
	
	private void ausgabe() {
		for (String i : liste) {
			System.out.print(i + " " + "\n");
		}
	}
	
	

}
