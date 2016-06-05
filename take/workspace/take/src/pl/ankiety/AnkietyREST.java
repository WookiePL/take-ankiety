package pl.ankiety;

import java.io.StringWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	public String findWykladowca(@PathParam("idw") int idw) {
		Wykladowca wykladowca = bean.findWykladowca(idw);
		StringWriter sw = new StringWriter();
		JAXB.marshal(wykladowca, sw);
		return sw.toString();
	}
	
	@Override
	@GET
	@Path("/getWykladowca")
	public String getWykladowca() {
		List<Wykladowca> lWykladowca = bean.getWykladowca();
		StringWriter sw = new StringWriter();
		Wykladowcy wykladowcy = new Wykladowcy(lWykladowca);
		JAXB.marshal(wykladowcy, sw);
		return sw.toString();
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
	@Path("/getPrzedmiot")
	public String getPrzedmiot() {
		List<Przedmiot> lPrzedmiot = bean.getPrzedmiot();
		StringWriter sw = new StringWriter();
		Przedmioty przedmioty = new Przedmioty(lPrzedmiot);
		JAXB.marshal(przedmioty, sw);
		return sw.toString();
	}
	
	@Override
	@GET
	@Path("/findPrzedmiot/{idp}")
	public String findPrzedmiot(@PathParam("idp") int idp) {
		Przedmiot przedmiot = bean.findPrzedmiot(idp);
		StringWriter sw = new StringWriter();
		JAXB.marshal(przedmiot, sw);
		return sw.toString();
	}
	
	@Override
	@GET
	@Path("/deletePrzedmiot/{idp}")
	public void deletePrzedmiot(@PathParam("idp") int idp) {
		bean.deletePrzedmiot(idp);
	}
}
