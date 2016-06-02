package pl.ankiety;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Przedmioty {

	private List<Przedmiot> przedmioty = new ArrayList<Przedmiot>();
	
	public Przedmioty() { }
	
	public Przedmioty(List<Przedmiot> przedmioty) {
		super();
		this.przedmioty = przedmioty;
	}
	
	public List<Przedmiot> getPrzedmioty() {
		return przedmioty;
	}
	
	public void setPrzedmioty(List<Przedmiot> przedmioty) {
		this.przedmioty = przedmioty;
	}
}
