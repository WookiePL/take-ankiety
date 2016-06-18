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
 * MozliwaOdpowiedz
 ****************************************************************************************/
	
	public void createMozliwaOdpowiedz(MozliwaOdpowiedz mozliwaOdpowiedz) {
		manager.persist(mozliwaOdpowiedz);
		System.out.println("Utworzono mozliwa odpowiedz");
	}
	
	public MozliwaOdpowiedz findMozliwaOdpowiedz(int idm) {
		System.out.println("Wyszukano mozliwa odpowiedz");
		return manager.find(MozliwaOdpowiedz.class, idm);
	}
	
	public List<MozliwaOdpowiedz> getMozliwaOdpowiedz() {
		Query q = manager.createQuery("select m from MozliwaOdpowiedz m");
		@SuppressWarnings("unchecked")
		List<MozliwaOdpowiedz> list = q.getResultList();
		System.out.println("Zwrocono mozliwe odpowiedzi");
		return list;
	}
	
	public void updateMozliwaOdpowiedz(MozliwaOdpowiedz mozliwaOdpowiedz) {
		mozliwaOdpowiedz = manager.merge(mozliwaOdpowiedz);
		System.out.println("Aktualizowano mozliwa odpowiedz");
	}
	
	public void deleteMozliwaOdpowiedz(int idm) {
		MozliwaOdpowiedz mozliwaOdpowiedz = manager.find(MozliwaOdpowiedz.class, idm);
		manager.remove(mozliwaOdpowiedz);
		System.out.println("Usunieto mozliwa odpowiedz");
	}
	
/*****************************************************************************************	
 * Pytanie
 ****************************************************************************************/
	
	public void createPytanie(Pytanie pytanie) {
		manager.persist(pytanie);
		System.out.println("Utworzono pytanie");
	}
	
	public Pytanie findPytanie(int idm) {
		System.out.println("Wyszukano pytanie");
		return manager.find(Pytanie.class, idm);
	}
	
	public List<Pytanie> getPytanie() {
		Query q = manager.createQuery("select m from Pytanie m");
		@SuppressWarnings("unchecked")
		List<Pytanie> list = q.getResultList();
		System.out.println("Zwrocono mozliwe odpowiedzi");
		return list;
	}
	
	public void updatePytanie(Pytanie pytanie) {
		pytanie = manager.merge(pytanie);
		System.out.println("Aktualizowano pytanie");
	}
	
	public void deletePytanie(int idm) {
		Pytanie pytanie = manager.find(Pytanie.class, idm);
		manager.remove(pytanie);
		System.out.println("Usunieto pytanie");
	}
	
}
