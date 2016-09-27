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

	public abstract String deleteWykladowca(int idw);
	
	//TODO: Obczaic o co chodzi z tym inputSream i zrobic te metody jako post
	//public abstract String updateWykladowca(InputStream is);
	//public abstract String createWykladowca(InputStream is);
	
/*****************************************************************************************	
 * Przedmiot
 ****************************************************************************************/
	
	public abstract String createPrzedmiot(String nazwa, int idw);

	public abstract Przedmiot findPrzedmiot(int idp);

	public abstract Przedmioty getPrzedmioty();

	public abstract String deletePrzedmiot(int idp);
	
	
/*****************************************************************************************	
 * OdpowiedzOtwarta
 ****************************************************************************************/
	
	public abstract String createOdpowiedzOtwarta(String tresc, int ideque);

	public abstract OdpowiedzOtwarta findOdpowiedzOtwarta(int idm);

	public abstract OdpowiedziOtwarte getOdpowiedziOtwarte();

	public abstract String deleteOdpowiedzOtwarta(int idm);
	
	
/*****************************************************************************************	
 * Pytanie
 ****************************************************************************************/
	
	public abstract String createPytanie(String typ, String tresc, int idp);

	public abstract Pytanie findPytanie(int idque);

	public abstract Pytania getPytania();

	public abstract String deletePytanie(int idque);

	
/*****************************************************************************************	
 * ListaOdpowiedziZamknietych
 ****************************************************************************************/

	public abstract String createListaOdpowiedziZamknietych(int idque);

	public abstract ListaOdpowiedziZamknietych findListaOdpowiedziZamknietych(int idl);

	public abstract ListyOdpowiedziZamknietych getListyOdpowiedziZamknietych();

	public abstract String deleteListaOdpowiedziZamknietych(int idl);

	
/*****************************************************************************************	
 * OdpowiedzZamknieta
 ****************************************************************************************/

	public abstract String createOdpowiedzZamknieta(String tresc, int idl);

	public abstract OdpowiedzZamknieta findOdpowiedzZamknieta(int idz);

	public abstract OdpowiedziZamkniete getOdpowiedziZamkniete();

	public abstract String deleteOdpowiedzZamknieta(int idz);

}
