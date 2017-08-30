package v1;

class Cabriolet extends Fahrzeug
{
  // Objektattribute
  String verdeckMechanismus;
  String verdeckMaterial;
  int schliessZeit;

  // Methoden
  void initCabriolet(String verdeckMechanismus, String verdeckMaterial,
                     int schliesszeit)
  {
      this.verdeckMechanismus=verdeckMechanismus;
      this.verdeckMaterial=verdeckMaterial;
      this.schliessZeit=schliessZeit;
  }

  void ausgabeCabriolet()
  {
    System.out.println("Verdeckmechanismus    : " + this.verdeckMechanismus);
    System.out.println("Verdeckmaterial       : " + this.verdeckMaterial);
    System.out.println("Verdeckschliesszeit   : " + this.schliessZeit);
  }

}
