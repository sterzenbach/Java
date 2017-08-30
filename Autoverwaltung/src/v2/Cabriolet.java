package v2;

class Cabriolet extends Fahrzeug
{
  // Objektattribute
  String verdeckMechanismus;
  String verdeckMaterial;
  int schliessZeit;

  // Methoden
  Cabriolet(String hersteller, String typ, int kilometer, int ps,
              int hoechstgeschwindigkeit, int baujahr, String farbe,
              int anzahlTueren, String kraftstoffart, float preisint,
              String verdeckMechanismus, String verdeckMaterial,
              int schliesszeit)
  {
      super(hersteller, typ, kilometer, ps, hoechstgeschwindigkeit, baujahr,
            farbe, anzahlTueren, kraftstoffart, preisint);
      this.verdeckMechanismus=verdeckMechanismus;
      this.verdeckMaterial=verdeckMaterial;
      this.schliessZeit=schliessZeit;
  }

  void ausgabe()
  {
    super.ausgabe();
    System.out.println("Verdeckmechanismus    : " + this.verdeckMechanismus);
    System.out.println("Verdeckmaterial       : " + this.verdeckMaterial);
    System.out.println("Verdeckschliesszeit   : " + this.schliessZeit);
  }

}
