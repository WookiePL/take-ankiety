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
	int idw;
	String tresc;
	Integer typ;
	
	@Id
	@GeneratedValue
	@XmlAttribute
	public int getIdw() {
		return idw;
	}
	
	public void setIdw(int idw) {
		this.idw = idw;
	}
	
	public String getTresc() {
		return tresc;
	}
	
	public void setTresc(String tresc) {
		this.tresc = tresc;
	}
	
	public Integer getTyp() {
		return typ;
	}
	
	public void setTyp(Integer typ) {
		this.typ = typ;
	}
	
}
