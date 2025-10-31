package h2;

public class H2_main {
    public static void main(String[] args) {
        // Deklaration der Variablen und Zuweisung beliebiger Werte
        int i = 12;
        int j = 5;
        int k = 20;
        int min;
        int max;

        // Minimum bestimmen
        if (i < j && i < k) {
            min = i;
        } else if (j < i && j < k) {
            min = j;
        } else {
            min = k;
        }

        // Maximum bestimmen
        if (i > j && i > k) {
            max = i;
        } else if (j > i && j > k) {
            max = j;
        } else {
            max = k;
        }

        // Ausgabe der Ergebnisse
        System.out.println("Werte:");
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}

		 
			 
