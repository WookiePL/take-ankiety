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
	
}
