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
	
	public abstract String updateWykladowca(int idw, String imieNazwisko);
	
/*****************************************************************************************	
 * Przedmiot
 ****************************************************************************************/
	
	public abstract String createPrzedmiot(String nazwa, int idw);

	public abstract Przedmiot findPrzedmiot(int idp);

	public abstract Przedmioty getPrzedmioty();

	public abstract String deletePrzedmiot(int idp);

	public abstract String updatePrzedmiot(int idp, String nazwa, int idw);

	
/*****************************************************************************************	
 * OdpowiedzOtwarta
 ****************************************************************************************/
	
	public abstract String createOdpowiedzOtwarta(String tresc, int idque);

	public abstract OdpowiedzOtwarta findOdpowiedzOtwarta(int idm);

	public abstract OdpowiedziOtwarte getOdpowiedziOtwarte();

	public abstract String deleteOdpowiedzOtwarta(int idm);

	public abstract String updateOdpowiedzOtwarta(int idm, String tresc, int idque);
	
	
/*****************************************************************************************	
 * Pytanie
 ****************************************************************************************/
	
	public abstract String createPytanie(String typ, String tresc, int idp);

	public abstract Pytanie findPytanie(int idque);

	public abstract Pytania getPytania();

	public abstract String deletePytanie(int idque);

	public abstract String updatePytanie(int idque, String typ, String tresc, int idp);

	
/*****************************************************************************************	
 * ListaOdpowiedziZamknietych
 ****************************************************************************************/

	public abstract String createListaOdpowiedziZamknietych(int idque);

	public abstract ListaOdpowiedziZamknietych findListaOdpowiedziZamknietych(int idl);

	public abstract ListyOdpowiedziZamknietych getListyOdpowiedziZamknietych();

	public abstract String deleteListaOdpowiedziZamknietych(int idl);

	public abstract String updateListaOdpowiedziZamknietych(int idl, int idque);

	
/*****************************************************************************************	
 * OdpowiedzZamknieta
 ****************************************************************************************/

	public abstract String createOdpowiedzZamknieta(String tresc, int idl);

	public abstract OdpowiedzZamknieta findOdpowiedzZamknieta(int idz);

	public abstract OdpowiedziZamkniete getOdpowiedziZamkniete();

	public abstract String deleteOdpowiedzZamknieta(int idz);

	public abstract String updateOdpowiedzZamknieta(int idz, String tresc, int idl);

}
