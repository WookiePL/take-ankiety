package pl.ankiety;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pytania {
	
	private List<Pytanie> pytania = new ArrayList<Pytanie>();
	
	public Pytania() { }
	
	public Pytania(List<Pytanie> pytania) {
		super();
		this.pytania = pytania;
	}
	
	public List<Pytanie> getPytania() {
		return pytania;
	}
	
	public void setPytania(List<Pytanie> pytania) {
		this.pytania = pytania;
	}
	
}
