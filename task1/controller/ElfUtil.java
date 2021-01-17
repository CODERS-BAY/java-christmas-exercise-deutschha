package controller;

import java.util.Arrays;

import model.Sledge;
import view.Console;

public class ElfUtil {

	private boolean sortcount = false;
	public boolean beladen;
	Sledge lader;
	Console geschenke;	
	
	public ElfUtil() {
		laden();
		sortieren();
	}

	public void laden() {
		if (sortcount = false) {
			sortieren();
			System.out.println("Geschke waren nicht sortiert - erledigt \n bitte erneut laden.");
		}
		else {
			for (Object i : geschenke.arr) {
				lader.laderaum = i;
			}
		}
	}

	public boolean sortieren() {
		Arrays.sort(geschenke.arr);
		sortcount = true;
		return sortcount;
	}
	/*
	 * sledge should be prepared here
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((geschenke == null) ? 0 : geschenke.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElfUtil other = (ElfUtil) obj;
		if (geschenke == null) {
			if (other.geschenke != null)
				return false;
		} else if (!geschenke.equals(other.geschenke))
			return false;
		return true;
	}
	
}
