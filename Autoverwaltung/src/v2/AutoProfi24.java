package v2;

class AutoProfi24
{
  public static void main(String args[])
  {
    // Erzeugen der Fahrzeuge
    Transporter fahrzeug1 = new Transporter("Ford", "Transit Express Line", 18776, 86,
                          136, 2002, "blau", 4, "Diesel", 24440.00f, 410, 176, 187, "Holz");
    Cabriolet fahrzeug2 = new Cabriolet("Smart", "Roadster", 5000, 82,
                          175, 2003, "schwarz", 3, "Benzin", 14780.00f, "manuell", "Stahl", 160);

    // Ausgabe der Attributwerte des Transporters
    fahrzeug1.ausgabe();

    // Ausgabe der Attributwerte des Cabriolet
    fahrzeug2.ausgabe();
  }
}
