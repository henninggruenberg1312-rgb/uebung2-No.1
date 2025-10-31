package h3;

public class H3_main {
    public static void main(String[] args) {
        // Deklaration der Variablen
        int i = 201;
        int j = 101;
        int k = -10;

        // Ausdruck 1: i > j
        // Ausdruck 2: i > 200
        // Ausdruck 3: j > 100

        if (i > j) { // Ausdruck 1 wahr
            if (i > 200) { // Ausdruck 2 wahr
                if (j > 100) { // Ausdruck 3 wahr
                    k = 3;
                } else { // Ausdruck 3 nicht wahr
                    k = 2;
                }
            } else { // Ausdruck 2 nicht wahr
                if (!(j > 100)) { // Ausdruck 3 nicht wahr
                    k = 1;
                }
            }
        } else { // Ausdruck 1 nicht wahr
            if (!(i > 200) && !(j > 100)) {
                k = 4;
            }
        }

        // Ausgabe
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
    }
}
