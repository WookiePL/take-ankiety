package pl.ankiety;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface Ankiety {
	
/*****************************************************************************************	
 * Wykladowca
 ****************************************************************************************/
	
	public abstract String createWykladowca(String imieNazwisko);

	public abstract Wykladowca findWykladowca(int idw);

	public abstract Wykladowcy getWykladowcy();

	public abstract void deleteWykladowca(int idw);
	
	//TODO: Obczaic o co chodzi z tym inputSream i zrobic te metody jako post
	//public abstract String updateWykladowca(InputStream is);
	//public abstract String createWykladowca(InputStream is);
	
/*****************************************************************************************	
 * Przedmiot
 ****************************************************************************************/
	
	public abstract String createPrzedmiot(String nazwa, int idw);

	public abstract Przedmiot findPrzedmiot(int idp);

	public abstract Przedmioty getPrzedmioty();

	public abstract void deletePrzedmiot(int idp);
	
	
/*****************************************************************************************	
 * MozliwaOdpowiedz
 ****************************************************************************************/
	
	public abstract String createMozliwaOdpowiedz(String tresc);

	public abstract MozliwaOdpowiedz findMozliwaOdpowiedz(int idm);

	public abstract MozliweOdpowiedzi getMozliweOdpowiedzi();

	public abstract void deleteMozliwaOdpowiedz(int idm);
	
	
/*****************************************************************************************	
 * Pytanie
 ****************************************************************************************/
	
	public abstract String createPytanie(String typ, String tresc);

	public abstract Pytanie findPytanie(int idq);

	public abstract Pytania getPytania();

	public abstract void deletePytanie(int idq);

}
