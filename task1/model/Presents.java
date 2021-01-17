package model;

import view.Console;
public class Presents extends Child{
	
	private String geschenk;
	private Object[] arr = new Object[100];


	public Presents(String name, String strasse, String hausnr,String geschenk) {
		super(name, strasse, hausnr);
		this.geschenk = geschenk;
	}
	

	/*
	 	public void erweitern(int zaeler){
	 	
		Object[] subarr = new Object[getArr().length + zaeler];
		System.arraycopy(getArr(), 0, subarr, 0, getArr().length);
		setArr(subarr);
		System.out.println(getArr().length);
	}
	*/
	
	public Object[] getArr() {
		
		return arr;
	}


	public void setArr(Object[] arr) {
		this.arr = arr;
	}

	
	
	@Override
	public String toString() {
		return "Presents [geschenk=" + geschenk + "]";
	}

	
}
