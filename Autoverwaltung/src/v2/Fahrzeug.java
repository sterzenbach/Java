package v2;

class Fahrzeug
{
  // Objektattribute
  String hersteller;
  String typ;
  int kilometerleisung;
  int ps;
  int hoechstgeschwindigkeit;
  int baujahr;
  String farbe;
  int anzahlTueren;
  String kraftstoffart;
  float preis;

  // Methoden
  Fahrzeug(String hersteller, String typ, int kilometer, int ps,
                    int hoechstgeschwindigkeit, int baujahr, String farbe,
                    int anzahlTueren, String kraftstoffart, float preis)
  {
    this.hersteller=hersteller;
    this.typ=typ;
    this.kilometerleisung=kilometer;
    this.ps=ps;
    this.hoechstgeschwindigkeit=hoechstgeschwindigkeit;
    this.baujahr=baujahr;
    this.farbe=farbe;
    this.anzahlTueren=anzahlTueren;
    this.kraftstoffart=kraftstoffart;
    this.preis=preis;
  }

  void ausgabe()
  {
    System.out.println("\nFahrzeugdaten:");
    System.out.println("==============");
    System.out.println("Hersteller            : " + this.hersteller);
    System.out.println("Typ                   : " + this.typ);
    System.out.println("Kilometerleistung     : " + this.kilometerleisung);
    System.out.println("PS                    : " + this.ps);
    System.out.println("Hoechstgeschwindigkeit: " + this.hoechstgeschwindigkeit);
    System.out.println("Baujahr               : " + this.baujahr);
    System.out.println("Farbe                 : " + this.farbe);
    System.out.println("Anzahl Tueren         : " + this.anzahlTueren);
    System.out.println("Kraftstoffart         : " + this.kraftstoffart);
    System.out.println("Preis                 : " + this.preis);
  }
}
