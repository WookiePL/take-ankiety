package pl.ankiety;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MozliweOdpowiedzi {

	private List<MozliwaOdpowiedz> mozliweOdpowiedzi = new ArrayList<MozliwaOdpowiedz>();
	
	public MozliweOdpowiedzi() { }
	 
	public MozliweOdpowiedzi(List<MozliwaOdpowiedz> mozliweOdpowiedzi) {
		super();
		this.mozliweOdpowiedzi = mozliweOdpowiedzi;
	}
	
	public List<MozliwaOdpowiedz> getMozliweOdpowiedzi() {
		return mozliweOdpowiedzi;
	}
	
	public void setMozliweOdpowiedzi(List<MozliwaOdpowiedz> mozliweOdpowiedzi) {
		this.mozliweOdpowiedzi = mozliweOdpowiedzi;
	}
}
