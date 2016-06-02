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
	@Path("/findWykladowca/{imieNazwisko}")
	public String findWykladowca(@PathParam("idw") int idw) {
		Wykladowca wykladowca = bean.findWykladowca(idw);
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
	
}
