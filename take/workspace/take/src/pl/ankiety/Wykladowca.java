package pl.ankiety;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Wykladowca implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	int idw;
	String imieNazwisko;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getIdw() {
		return idw;
	}
	
	public void setIdw(int idw) {
		this.idw = idw;
	}
	
	public String getImieNazwisko() {
		return imieNazwisko;
	}
	
	public void setImieNazwisko(String imieNazwisko) {
		this.imieNazwisko = imieNazwisko;
	}
	
}
