package pl.ankiety;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Wookie on 2016-09-26.
 */
@Entity
@XmlRootElement
public class OdpowiedzZamknieta implements Serializable{

    private static final long serialVersionUID = 1L;
    int idz;
    String tresc;
    ListaOdpowiedziZamknietych listaOdpowiedziZamknietych;

    @Id
    @GeneratedValue
    @XmlAttribute
    public int getIdz() {
        return idz;
    }

    public void setIdz(int idz) {
        this.idz = idz;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public ListaOdpowiedziZamknietych getListaOdpowiedziZamknietych() {
        return listaOdpowiedziZamknietych;
    }

    public void setListaOdpowiedziZamknietych(ListaOdpowiedziZamknietych listaOdpowiedziZamknietych) {
        this.listaOdpowiedziZamknietych = listaOdpowiedziZamknietych;
    }
}
