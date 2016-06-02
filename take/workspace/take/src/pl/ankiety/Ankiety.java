package pl.ankiety;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Ankiety {
	
/*****************************************************************************************	
 * Wykladowca
 ****************************************************************************************/
	
	public abstract String createWykladowca(String imieNazwisko);

	public abstract String findWykladowca(int idw);

	public abstract String getWykladowca();

	public abstract void deleteWykladowca(int idw);
	
	//TODO: Obczaic o co chodzi z tym inputSream i zrobic te metody jako post
	//public abstract String updateWykladowca(InputStream is);
	//public abstract String createWykladowca(InputStream is);
	
/*****************************************************************************************	
 * Przedmiot
 ****************************************************************************************/
	
	public abstract String createPrzedmiot(String nazwa, int idw);

//	public abstract String findPrzedmiot(int idp);
//
	public abstract String getPrzedmiot();
//
//	public abstract void deletePrzedmiot(int idp);
	
	
}
