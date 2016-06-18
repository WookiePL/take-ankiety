# TAKE ankiety

### Pytania do prowadzącego
* Jak wysyłać/odbierać JSON zamiast XML?
* Klient nie działa, dlaczego wpisując jako adres w przeglądarce dostajemyn dane w XML ale jak pobieramy AJAXem to odpowiedź jest pusta?
* Jak dokładnie mają działać pytania i odpowiedzi

### Odpowiedzi od prowadzącego :P
* Trzeba użyć adnotacji `@Produces("application/json")` więcej info http://stackoverflow.com/questions/13594945/how-correctly-produce-json-by-restful-web-service
  Możemy użyć JSON zamiast XML
* -
* pytanie może OTWARTE albo ZAMKNIĘTE, OTWARTE ma tylko ODPOWIEDŹ, ZAMKNIĘTE ma LISTĘ ODPOWIEDZI
    
    **więcej info**:
    * Klient może być JSowy (a nie Javowy)
    * Trzeba przygotować jakąś dokumentację - lista URLi (czyli dokumentacja API)

## Jak se poustawiać
1. Sklonuj repo do ścieżki bez spacji !!!
1. Sciągnij paczke z platofrmy z przedmiotu TAKE.
1. Skopiuj zawartość folderu `take` po rozpakowaniu z platofrmy do `take` w `take-ankiety` z repo oprócz folderu `workspace`
1. Do `workspace/take` w `take-ankiety` skopiuj zawartość `workspace/take` z platofrmy ale bez folderu `src`.
1. Odpal eklipsa skryptem `start_eclipse.bat` i zamień se ścieżkę w pliku `build.xml` u góry:
	`property name="jboss.home" value="< TU WPISZ SCIEZKE >/take-ankiety/take/jboss-6.0.0.Final"`
	
Tera możesz już se opalić jbossa i deplojować i gitara
### Kodzimy !

### Inne info
ankiety.EAP - diagram klas dla naszego projektu



