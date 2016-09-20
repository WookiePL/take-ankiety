package pl.ankiety;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Pytanie implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	int idq;
	String tresc;
	String typ;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getIdq() {
		return idq;
	}
	
	public void setIdq(int idq) {
		this.idq = idq;
	}
	
	public String getTresc() {
		return tresc;
	}
	
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
}
