package view;
import java.io.*;
import java.util.Scanner;
import model.Santa;
import sun.jvm.hotspot.gc.parallel.PSYoungGen;
import model.Child;
import model.Elf;
import model.Presents;
public class Console {
	private String pwdSanta;
	private static String pwdChild;
	private String pwdelf;
	public int zaehler;
	
	
	
	
	public Console(String pwdSanta, String pwdChild, String pwdelf, int zaehler) {
		super();
		this.pwdSanta = pwdSanta;
		this.pwdChild = pwdChild;
		this.pwdelf = pwdelf;
		this.zaehler = zaehler;
		
		zaehler ++;
	}
	public Console() {
		// TODO Auto-generated constructor stub
	}
	public void dialog() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Passwort eingeben, für Wünsche -'kind'- eingeben: ");
		String pwd = scan.next();
		switch (pwd) {
		case "kind":
			System.out.println(zaehler);
			Presents liste = new Presents();
			
			break;
		case "Santa":
			Santa eingabeS = new Santa();
			break;
		case "Elf":
			Elf eingabeE = new Elf();
			break;
		}

	}
		
	/*
	 * the console dialog comes here
	 */

	}

