package h1;


public class H1_main {
    public static void main(String[] args) {
        // Deklaration der int-Variable z und Zuweisung eines beliebigen Werts
        int z = 25;

        // Ausgabe des Startwerts
        System.out.println("Startwert von z: " + z);

        // Prüfung, ob z echt größer als 10 ist
        if (z > 10) {
            // Wenn ja, z um 10 verkleinern
            z = z - 10;
        }

        // Ausgabe des (neuen) Werts von z
        System.out.println("Neuer Wert von z: " + z);
    }
}
    	
