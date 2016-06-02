package pl.ankiety;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Przedmiot implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int idp;
	String nazwa;
	Wykladowca wykladowca;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getIdp() {
		return idp;
	}
	
	public void setIdp(int idp) {
		this.idp = idp;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public Wykladowca getWykladowca() {
		return wykladowca;
	}
	
	public void setWykladowca(Wykladowca wykladowca) {
		this.wykladowca = wykladowca;
	}
}
