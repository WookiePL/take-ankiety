package pl.ankiety;

import java.io.StringWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXB;


@Path("/ankiety")
@Stateless
public class AnkietyREST implements Ankiety {

	@EJB
	AnkietyEJB bean;
	
/*****************************************************************************************	
 * Wykladowca
 ****************************************************************************************/
 
	@Override
	@GET
	@Path("/createWykladowca/{imieNazwisko}")
	public String createWykladowca(@PathParam("imieNazwisko") String imieNazwisko) {
		Wykladowca wykladowca = new Wykladowca();
		wykladowca.setImieNazwisko(imieNazwisko);
		bean.createWykladowca(wykladowca);
		return "dodano wykladowce";
	}
	
	@Override
	@GET
	@Path("/findWykladowca/{idw}")
	@Produces("application/json")
	public Wykladowca findWykladowca(@PathParam("idw") int idw) {
		Wykladowca wykladowca = bean.findWykladowca(idw);
		return wykladowca;
	}
	
	@Override
	@GET
	@Path("/getWykladowcy")
	@Produces("application/json")
	public Wykladowcy getWykladowcy() {
		List<Wykladowca> lWykladowca = bean.getWykladowca();
		Wykladowcy wykladowcy = new Wykladowcy(lWykladowca);
		return wykladowcy;
	}
	
	@Override
	@GET
	@Path("/deleteWykladowca/{idw}")
	public void deleteWykladowca(@PathParam("idw") int idw) {
		bean.deleteWykladowca(idw);
	}
	
/*****************************************************************************************	
 * Przedmiot
 ****************************************************************************************/
	
	@Override
	@GET
	@Path("/createPrzedmiot/{nazwa}/{idw}")
	public String createPrzedmiot(@PathParam("nazwa") String nazwa, @PathParam("idw") int idw) {
		Przedmiot przedmiot = new Przedmiot();
		przedmiot.setNazwa(nazwa);
		Wykladowca wykladowca = bean.findWykladowca(idw);
		przedmiot.setWykladowca(wykladowca);
		bean.createPrzedmiot(przedmiot);
		return "dodano przedmiot";
	}
	
	@Override
	@GET
	@Path("/getPrzedmioty")
	@Produces("application/json")
	public Przedmioty getPrzedmioty() {
		List<Przedmiot> lPrzedmiot = bean.getPrzedmiot();
		Przedmioty przedmioty = new Przedmioty(lPrzedmiot);
		return przedmioty;
	}
	
	@Override
	@GET
	@Path("/findPrzedmiot/{idp}")
	@Produces("application/json")
	public Przedmiot findPrzedmiot(@PathParam("idp") int idp) {
		Przedmiot przedmiot = bean.findPrzedmiot(idp);
		return przedmiot;
	}
	
	@Override
	@GET
	@Path("/deletePrzedmiot/{idp}")
	public void deletePrzedmiot(@PathParam("idp") int idp) {
		bean.deletePrzedmiot(idp);
	}
	
/*****************************************************************************************	
 * MozliwaOdpowiedz
 ****************************************************************************************/
	
	
	@Override
	@GET
	@Path("/createMozliwaOdpowiedz/{tresc}")
	public String createMozliwaOdpowiedz(@PathParam("tresc") String tresc) {
		MozliwaOdpowiedz mozliwaOdpowiedz = new MozliwaOdpowiedz();
		mozliwaOdpowiedz.setTresc(tresc);
		bean.createMozliwaOdpowiedz(mozliwaOdpowiedz);
		return "dodano mozliwa odpowiedz";
	}
	
	@Override
	@GET
	@Path("/getMozliweOdpowiedzi")
	@Produces("application/json")
	public MozliweOdpowiedzi getMozliweOdpowiedzi() {
		List<MozliwaOdpowiedz> lMozliwaOdpowiedz = bean.getMozliwaOdpowiedz();
		MozliweOdpowiedzi mozliweOdpowiedzi = new MozliweOdpowiedzi(lMozliwaOdpowiedz);
		return mozliweOdpowiedzi;
	}
	
	@Override
	@GET
	@Path("/findMozliwaOdpowiedz/{idm}")
	@Produces("application/json")
	public MozliwaOdpowiedz findMozliwaOdpowiedz(@PathParam("idm") int idm) {
		MozliwaOdpowiedz mozliwaOdpowiedz = bean.findMozliwaOdpowiedz(idm);
		return mozliwaOdpowiedz;
	}
	
	@Override
	@GET
	@Path("/deleteMozliwaOdpowiedz/{idm}")
	public void deleteMozliwaOdpowiedz(@PathParam("idm") int idm) {
		bean.deleteMozliwaOdpowiedz(idm);
	}
}
