package v1;

class AutoProfi24
{
  public static void main(String args[])
  {
    // Erzeugen der Fahrzeugen
    Transporter fahrzeug1 = new Transporter();
    Cabriolet fahrzeug2 = new Cabriolet();

    // Initialisierung des Transporters
    fahrzeug1.initFahrzeug("Ford", "Transit Express Line", 18776, 86,
                          136, 2002, "blau", 4, "Diesel", 24440.00f);
    fahrzeug1.initTransporter(410, 176, 187, "Holz");

    // Initialisierung des Cabriolet
    fahrzeug2.initFahrzeug("Smart", "Roadster", 5000, 82,
                          175, 2003, "schwarz", 3, "Benzin", 14780.00f);
    fahrzeug2.initCabriolet("manuell", "Stahl", 160);

    // Ausgabe der Attributwerte des Transporters
    fahrzeug1.ausgabeFahrzeug();
    fahrzeug1.ausgabeTransporter();

    // Ausgabe der Attributwerte des Cabriolet
    fahrzeug2.ausgabeFahrzeug();
    fahrzeug2.ausgabeCabriolet();
  }
}
