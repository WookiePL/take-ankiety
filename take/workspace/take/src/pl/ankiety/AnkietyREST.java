package pl.ankiety;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


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
	public String deleteWykladowca(@PathParam("idw") int idw) {
		bean.deleteWykladowca(idw);
		return "usunieto wykladowce";
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
	public String deletePrzedmiot(@PathParam("idp") int idp) {
		bean.deletePrzedmiot(idp);
		return "usunieto przedmiot";
	}
	
/*****************************************************************************************	
 * MozliwaOdpowiedz
 ****************************************************************************************/
	
	
	@Override
	@GET
	@Path("/createMozliwaOdpowiedz/{tresc}/{idque}")
	public String createMozliwaOdpowiedz(@PathParam("tresc") String tresc, @PathParam("idque") int idque) {
		MozliwaOdpowiedz mozliwaOdpowiedz = new MozliwaOdpowiedz();
		mozliwaOdpowiedz.setTresc(tresc);
		Pytanie pytanie = bean.findPytanie(idque);
		mozliwaOdpowiedz.setPytanie(pytanie);
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
	public String deleteMozliwaOdpowiedz(@PathParam("idm") int idm) {
		bean.deleteMozliwaOdpowiedz(idm);
		return "usunieto odpowiedz";
	}

	
/*****************************************************************************************	
 * Pytanie
 ****************************************************************************************/
	

	@Override
	@GET
	@Path("/createPytanie/{typ}/{tresc}/{idp}")
	public String createPytanie(@PathParam("typ") String typ, @PathParam("tresc") String tresc, @PathParam("idp") int idp) {
		Pytanie pytanie = new Pytanie();
		pytanie.setTyp(typ);
		pytanie.setTresc(tresc);
        Przedmiot przedmiot = bean.findPrzedmiot(idp);
        pytanie.setPrzedmiot(przedmiot);
		bean.createPytanie(pytanie);
		return "dodano pytanie";
	}

	@Override
	@GET
	@Path("/getPytania")
	@Produces("application/json")
	public Pytania getPytania() {
		List<Pytanie> lPytanie = bean.getPytanie();
		Pytania pytania = new Pytania(lPytanie);
		return pytania;
	}

	@Override
	@GET
	@Path("/findPytanie/{idque}")
	@Produces("application/json")
	public Pytanie findPytanie(@PathParam("idque") int idque) {
		Pytanie pytanie = bean.findPytanie(idque);
		return pytanie;
	}

	@Override
	@GET
	@Path("/deletePytanie/{idque}")
	@Produces("application/json")
	public String deletePytanie(@PathParam("idque") int idque) {
		bean.deletePytanie(idque);
		return "usunieto pytanie";
	}

/*****************************************************************************************	
 * ListaOdpowiedziZamknietych
 ****************************************************************************************/


    @Override
    @GET
    @Path("/createListaOdpowiedziZamknietych/{idl}")
    public String createListaOdpowiedziZamknietych(@PathParam("idl") int idl) {
        ListaOdpowiedziZamknietych listaOdpowiedziZamknietych = new ListaOdpowiedziZamknietych();
        Pytanie pytanie = bean.findPytanie(idl);
        listaOdpowiedziZamknietych.setPytanie(pytanie);
        bean.createListaOdpowiedziZamknietych(listaOdpowiedziZamknietych);
        return "dodano listaOdpowiedziZamknietych";
    }

    @Override
    @GET
    @Path("/getListyOdpowiedziZamknietych")
    @Produces("application/json")
    public ListyOdpowiedziZamknietych getListyOdpowiedziZamknietych() {
        List<ListaOdpowiedziZamknietych> lListaOdpowiedziZamknietych = bean.getListaOdpowiedziZamknietych();
        ListyOdpowiedziZamknietych listyOdpowiedziZamknietych = new ListyOdpowiedziZamknietych(lListaOdpowiedziZamknietych);
        return listyOdpowiedziZamknietych;
    }

    @Override
    @GET
    @Path("/findListaOdpowiedziZamknietych/{idl}")
    @Produces("application/json")
    public ListaOdpowiedziZamknietych findListaOdpowiedziZamknietych(@PathParam("idl") int idl) {
        ListaOdpowiedziZamknietych listaOdpowiedziZamknietych = bean.findListaOdpowiedziZamknietych(idl);
        return listaOdpowiedziZamknietych;
    }

    @Override
    @GET
    @Path("/deleteListaOdpowiedziZamknietych/{idl}")
    @Produces("application/json")
    public String deleteListaOdpowiedziZamknietych(@PathParam("idl") int idl) {
        bean.deleteListaOdpowiedziZamknietych(idl);
		return "usunieto liste odpowiedzi zamknietych";
    }

/*****************************************************************************************	
 * OdpowiedzZamknieta
 ****************************************************************************************/


    @Override
    @GET
    @Path("/createOdpowiedzZamknieta/{tresc}/{idl}")
    public String createOdpowiedzZamknieta(@PathParam("tresc") String tresc, @PathParam("idl") int idl) {
        OdpowiedzZamknieta odpowiedzZamknieta = new OdpowiedzZamknieta();
        ListaOdpowiedziZamknietych listaOdpowiedziZamknietych = new ListaOdpowiedziZamknietych();
        odpowiedzZamknieta.setListaOdpowiedziZamknietych(listaOdpowiedziZamknietych);
        bean.createOdpowiedzZamknieta(odpowiedzZamknieta);
        return "dodano odpowiedzZamknieta";
    }

    @Override
    @GET
    @Path("/getOdpowiedziZamkniete")
    @Produces("application/json")
    public OdpowiedziZamkniete getOdpowiedziZamkniete() {
        List<OdpowiedzZamknieta> lOdpowiedzZamknieta = bean.getOdpowiedzZamknieta();
        OdpowiedziZamkniete OdpowiedziZamkniete = new OdpowiedziZamkniete(lOdpowiedzZamknieta);
        return OdpowiedziZamkniete;
    }

    @Override
    @GET
    @Path("/findOdpowiedzZamknieta/{idz}")
    @Produces("application/json")
    public OdpowiedzZamknieta findOdpowiedzZamknieta(@PathParam("idz") int idz) {
        OdpowiedzZamknieta odpowiedzZamknieta = bean.findOdpowiedzZamknieta(idz);
        return odpowiedzZamknieta;
    }

    @Override
    @GET
    @Path("/deleteOdpowiedzZamknieta/{idz}")
    @Produces("application/json")
    public String deleteOdpowiedzZamknieta(@PathParam("idz") int idz) {
        bean.deleteOdpowiedzZamknieta(idz);
		return "usunieto odpowiedzZamknieta";
    }


}
