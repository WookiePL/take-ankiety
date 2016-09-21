package pl.ankiety;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Pytania2 {

	private List<Pytanie2> pytania2 = new ArrayList<Pytanie2>();

	public Pytania2() { }

	public Pytania2(List<Pytanie2> pytania2) {
		super();
		this.pytania2 = pytania2;
	}
	
	public List<Pytanie2> getPytania2() {
		return pytania2;
	}
	
	public void setPytania(List<Pytanie> pytania) {
		this.pytania2 = pytania2;
	}
	
}
