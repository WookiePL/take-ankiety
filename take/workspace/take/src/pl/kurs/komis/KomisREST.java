package pl.kurs.komis;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

@Path("/komis")
@Stateless
public class KomisREST implements Komis {

	@EJB
	KomisEJB bean;

	@Override
	@POST
	@Path("/create")
	public String create(InputStream is) {
		Car car = JAXB.unmarshal(is,Car.class);
		bean.create(car);
		return "car created!";
	}

	@Override
	@GET
	@Path("/find/{idc}")
	public String find(@PathParam("idc") int idc) {
		Car car = bean.find(idc);
		StringWriter sw = new StringWriter();
		JAXB.marshal(car, sw);
		return sw.toString();
	}

	@Override
	@GET
	@Path("/get")
	public String get() {
		List<Car> lcars = bean.get();
		StringWriter sw = new StringWriter();
		Cars cars = new Cars(lcars);
		JAXB.marshal(cars, sw);
		return sw.toString();
	}

	@Override
	@POST
	@Path("/update")
	public String update(InputStream is) {
		System.out.println(is);
		try {
			Car newcar = (Car) JAXB.unmarshal(is,Car.class);
			bean.update(newcar);
			return "car updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "car not updated :(";
		}
	}


	@Override
	@GET
	@Path("/delete/{idc}")
	public void delete(@PathParam("idc") int idc) {
		bean.delete(idc);
	}


}
