package pl.ankiety;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wykladowcy {
	
	private List<Wykladowca> wykladowcy = new ArrayList<Wykladowca>();
	
	public Wykladowcy() { }
	
	public Wykladowcy(List<Wykladowca> wykladowcy) {
		super();
		this.wykladowcy = wykladowcy;
	}
	
	public List<Wykladowca> getWykladowcy() {
		return wykladowcy;
	}
	
	public void setWykladowcy(List<Wykladowca> wykladowcy) {
		this.wykladowcy = wykladowcy;
	}
	
}
