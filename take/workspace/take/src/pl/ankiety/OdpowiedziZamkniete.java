package pl.ankiety;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wookie on 2016-09-26.
 */
@XmlRootElement
public class OdpowiedziZamkniete {

    private List<OdpowiedzZamknieta> odpowiedziZamkniete = new ArrayList<OdpowiedzZamknieta>();

    public OdpowiedziZamkniete(List<OdpowiedzZamknieta> odpowiedziZamkniete) {
        super();
        this.odpowiedziZamkniete = odpowiedziZamkniete;
    }

    public List<OdpowiedzZamknieta> getOdpowiedziZamkniete() {
        return odpowiedziZamkniete;
    }

    public void setOdpowiedziZamkniete(List<OdpowiedzZamknieta> odpowiedziZamkniete) {
        this.odpowiedziZamkniete = odpowiedziZamkniete;
    }
}
