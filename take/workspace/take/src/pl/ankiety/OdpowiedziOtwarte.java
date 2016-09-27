package pl.ankiety;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OdpowiedziOtwarte {

	private List<OdpowiedzOtwarta> odpowiedziOtwarte = new ArrayList<OdpowiedzOtwarta>();
	
	public OdpowiedziOtwarte() { }
	 
	public OdpowiedziOtwarte(List<OdpowiedzOtwarta> odpowiedziOtwarte) {
		super();
		this.odpowiedziOtwarte = odpowiedziOtwarte;
	}
	
	public List<OdpowiedzOtwarta> getOdpowiedziOtwarte() {
		return odpowiedziOtwarte;
	}
	
	public void setOdpowiedziOtwarte(List<OdpowiedzOtwarta> odpowiedziOtwarte) {
		this.odpowiedziOtwarte = odpowiedziOtwarte;
	}
}
