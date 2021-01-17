package model;

public class modeltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Presents geschenke = new Presents("mustername","musterstrasse","99","testgeschenk");
		System.out.println(geschenke.getArr().length);
		
		geschenke.getArr()[0] = geschenke;
		
		System.out.println(geschenke.getArr().length);
		
		geschenke.erweitern();
		
		System.out.println("erweitern " + geschenke.getArr().length);
		System.out.println(geschenke.getArr()[0]);
	}

}
