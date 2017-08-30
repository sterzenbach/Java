package v2;

class Transporter extends Fahrzeug
{
  // Objektattribute
  int ladeBreite;
  int ladeLaenge;
  int ladeHoehe;
  String bodenMaterial;

  // Methoden
  Transporter(String hersteller, String typ, int kilometer, int ps,
              int hoechstgeschwindigkeit, int baujahr, String farbe,
              int anzahlTueren, String kraftstoffart, float preisint,
              int ladeBreite, int ladeLaenge, int ladeHoehe, String bodenMaterial)
  {
      super(hersteller, typ, kilometer, ps, hoechstgeschwindigkeit, baujahr,
            farbe, anzahlTueren, kraftstoffart, preisint);
      this.ladeBreite=ladeBreite;
      this.ladeLaenge=ladeLaenge;
      this.ladeHoehe=ladeHoehe;
      this.bodenMaterial=bodenMaterial;
  }

  void ausgabe()
{
  super.ausgabe();
  System.out.println("Ladebreite            : " + this.ladeBreite);
  System.out.println("Ladelaenge            : " + this.ladeLaenge);
  System.out.println("Ladehoehe             : " + this.ladeHoehe);
  System.out.println("Bodenmaterial         : " + this.bodenMaterial);
}


}
