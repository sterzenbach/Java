package v1;

class Transporter extends Fahrzeug
{
  // Objektattribute
  int ladeBreite;
  int ladeLaenge;
  int ladeHoehe;
  String bodenMaterial;

  // Methoden
  void initTransporter(int ladeBreite, int ladeLaenge, int ladeHoehe,
                       String bodenMaterial)
  {
      this.ladeBreite=ladeBreite;
      this.ladeLaenge=ladeLaenge;
      this.ladeHoehe=ladeHoehe;
      this.bodenMaterial=bodenMaterial;
  }

  void ausgabeTransporter()
{
  System.out.println("Ladebreite            : " + this.ladeBreite);
  System.out.println("Ladelaenge            : " + this.ladeLaenge);
  System.out.println("Ladehoehe             : " + this.ladeHoehe);
  System.out.println("Bodenmaterial         : " + this.bodenMaterial);
}


}
