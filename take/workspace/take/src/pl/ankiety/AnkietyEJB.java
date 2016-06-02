package pl.ankiety;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pl.kurs.komis.Car;

@Stateless
public class AnkietyEJB {

	@PersistenceContext(name="ankiety")
	EntityManager manager;
	
	public void createWykladowca(Wykladowca wykladowca) {
		manager.persist(wykladowca);
		System.out.println("Utworzono wykladowce");
	}
	
	public Wykladowca findWykladowca(int idw) {
		return manager.find(Wykladowca.class, idw);
	}
	
	public void deleteWykladowca(int idw) {
		Wykladowca wykladowca = manager.find(Wykladowca.class, idw);
		manager.remove(wykladowca);
		System.out.println("Usunieto wykladowce");
	}
	
	public List<Wykladowca> getWykladowca() {
		Query q = manager.createQuery("select w from Wykladowca w");
		@SuppressWarnings("unchecked")
		List<Wykladowca> list = q.getResultList();
		return list;
	}
	
	public void updateWykladowca(Wykladowca wykladowca) {
		wykladowca = manager.merge(wykladowca);
	}
}