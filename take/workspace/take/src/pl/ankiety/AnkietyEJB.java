package pl.ankiety;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class AnkietyEJB {

	@PersistenceContext(name="ankiety")
	EntityManager manager;
	
/*****************************************************************************************	
 * Wykladowca
 ****************************************************************************************/
	
	public void createWykladowca(Wykladowca wykladowca) {
		manager.persist(wykladowca);
		System.out.println("Utworzono wykladowce");
	}
	
	public Wykladowca findWykladowca(int idw) {
		System.out.println("Wyszukano wykladowce");
		return manager.find(Wykladowca.class, idw);
	}
	
	public List<Wykladowca> getWykladowca() {
		Query q = manager.createQuery("select w from Wykladowca w");
		@SuppressWarnings("unchecked")
		List<Wykladowca> list = q.getResultList();
		System.out.println("Zwrocono wykladowcow");
		return list;
	}
	
	public void updateWykladowca(Wykladowca wykladowca) {
		wykladowca = manager.merge(wykladowca);
		System.out.println("Aktualizowano wykladowce");
	}
	
	public void deleteWykladowca(int idw) {
		Wykladowca wykladowca = manager.find(Wykladowca.class, idw);
		manager.remove(wykladowca);
		System.out.println("Usunieto wykladowce");
	}
	
/*****************************************************************************************	
 * Przedmiot
 ****************************************************************************************/
	
	public void createPrzedmiot(Przedmiot przedmiot) {
		manager.persist(przedmiot);
		System.out.println("Utworzono przedmiot");
	}
	
	public Przedmiot findPrzedmiot(int idp) {
		System.out.println("Wyszukano przedmiot");
		return manager.find(Przedmiot.class, idp);
	}
	
	public List<Przedmiot> getPrzedmiot() {
		Query q = manager.createQuery("select p from Przedmiot p");
		@SuppressWarnings("unchecked")
		List<Przedmiot> list = q.getResultList();
		System.out.println("Zwrocono przedmioty");
		return list;
	}
	
	public void updatePrzedmiot(Przedmiot przedmiot) {
		przedmiot = manager.merge(przedmiot);
		System.out.println("Aktualizowano przedmiot");
	}
	
	public void deletePrzedmiot(int idp) {
		Przedmiot przedmiot = manager.find(Przedmiot.class, idp);
		manager.remove(przedmiot);
		System.out.println("Usunieto przedmiot");
	}
	
/*****************************************************************************************	
 * OdpowiedzOtwarta
 ****************************************************************************************/
	
	public void createOdpowiedzOtwarta(OdpowiedzOtwarta odpowiedzOtwarta) {
		manager.persist(odpowiedzOtwarta);
		System.out.println("Utworzono mozliwa odpowiedz");
	}
	
	public OdpowiedzOtwarta findOdpowiedzOtwarta(int idm) {
		System.out.println("Wyszukano mozliwa odpowiedz");
		return manager.find(OdpowiedzOtwarta.class, idm);
	}
	
	public List<OdpowiedzOtwarta> getOdpowiedzOtwarta() {
		Query q = manager.createQuery("select m from OdpowiedzOtwarta m");
		@SuppressWarnings("unchecked")
		List<OdpowiedzOtwarta> list = q.getResultList();
		System.out.println("Zwrocono mozliwe odpowiedzi");
		return list;
	}
	
	public void updateOdpowiedzOtwarta(OdpowiedzOtwarta odpowiedzOtwarta) {
		odpowiedzOtwarta = manager.merge(odpowiedzOtwarta);
		System.out.println("Aktualizowano mozliwa odpowiedz");
	}
	
	public void deleteOdpowiedzOtwarta(int idm) {
		OdpowiedzOtwarta odpowiedzOtwarta = manager.find(OdpowiedzOtwarta.class, idm);
		manager.remove(odpowiedzOtwarta);
		System.out.println("Usunieto mozliwa odpowiedz");
	}
	
/*****************************************************************************************	
 * Pytanie
 ****************************************************************************************/
	
	public void createPytanie(Pytanie pytanie) {
		manager.persist(pytanie);
		System.out.println("Utworzono pytanie");
	}
	
	public Pytanie findPytanie(int idque) {
		System.out.println("Wyszukano pytanie");
		return manager.find(Pytanie.class, idque);
	}
	
	public List<Pytanie> getPytanie() {
		Query q = manager.createQuery("select p from Pytanie p");
		@SuppressWarnings("unchecked")
		List<Pytanie> list = q.getResultList();
		System.out.println("Zwrocono mozliwe pytania");
		return list;
	}
	
	public void updatePytanie(Pytanie pytanie) {
		pytanie = manager.merge(pytanie);
		System.out.println("Aktualizowano pytanie");
	}
	
	public void deletePytanie(int idque) {
		Pytanie pytanie = manager.find(Pytanie.class, idque);
		manager.remove(pytanie);
		System.out.println("Usunieto pytanie");
	}

/*****************************************************************************************	
 * ListaOdpowiedziZamknietych
 ****************************************************************************************/

	public void createListaOdpowiedziZamknietych(ListaOdpowiedziZamknietych listaOdpowiedziZamknietych) {
		manager.persist(listaOdpowiedziZamknietych);
		System.out.println("Utworzono listaOdpowiedziZamknietych");
	}

	public ListaOdpowiedziZamknietych findListaOdpowiedziZamknietych(int idque) {
		System.out.println("Wyszukano listaOdpowiedziZamknietych");
		return manager.find(ListaOdpowiedziZamknietych.class, idque);
	}

	public List<ListaOdpowiedziZamknietych> getListaOdpowiedziZamknietych() {
		Query q = manager.createQuery("select l from ListaOdpowiedziZamknietych l");
		@SuppressWarnings("unchecked")
		List<ListaOdpowiedziZamknietych> list = q.getResultList();
		System.out.println("Zwrocono mozliwe listy odpowiedzi zamknietych");
		return list;
	}

	public void updateListaOdpowiedziZamknietych(ListaOdpowiedziZamknietych listaOdpowiedziZamknietych) {
		listaOdpowiedziZamknietych = manager.merge(listaOdpowiedziZamknietych);
		System.out.println("Aktualizowano listaOdpowiedziZamknietych");
	}

	public void deleteListaOdpowiedziZamknietych(int idque) {
		ListaOdpowiedziZamknietych listaOdpowiedziZamknietych = manager.find(ListaOdpowiedziZamknietych.class, idque);
		manager.remove(listaOdpowiedziZamknietych);
		System.out.println("Usunieto listaOdpowiedziZamknietych");
	}

/*****************************************************************************************	
 * OdpowiedzZamknieta
 ****************************************************************************************/

	public void createOdpowiedzZamknieta(OdpowiedzZamknieta odpowiedzZamknieta) {
		manager.persist(odpowiedzZamknieta);
		System.out.println("Utworzono odpowiedzZamknieta");
	}

	public OdpowiedzZamknieta findOdpowiedzZamknieta(int idque) {
		System.out.println("Wyszukano odpowiedzZamknieta");
		return manager.find(OdpowiedzZamknieta.class, idque);
	}

	public List<OdpowiedzZamknieta> getOdpowiedzZamknieta() {
		Query q = manager.createQuery("select z from OdpowiedzZamknieta z");
		@SuppressWarnings("unchecked")
		List<OdpowiedzZamknieta> list = q.getResultList();
		System.out.println("Zwrocono odpowiedzi zamkniete");
		return list;
	}

	public void updateOdpowiedzZamknieta(OdpowiedzZamknieta odpowiedzZamknieta) {
		odpowiedzZamknieta = manager.merge(odpowiedzZamknieta);
		System.out.println("Aktualizowano odpowiedzZamknieta");
	}

	public void deleteOdpowiedzZamknieta(int idque) {
		OdpowiedzZamknieta odpowiedzZamknieta = manager.find(OdpowiedzZamknieta.class, idque);
		manager.remove(odpowiedzZamknieta);
		System.out.println("Usunieto odpowiedzZamknieta");
	}

	
}
