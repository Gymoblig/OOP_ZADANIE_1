public class VectorUtils {

    /**
     * Fukcia vypocita skalarny sucin vektorov a a b.
     * Z definicie skalarneho sucinu vyplyva, ze vektory a a b musia mat rovnaku dlzku.
     *
     * @param a pole reprezentujuce vektor, nesmie byt null.
     * @param b pole reprezentujuce vektor, nesmie byt null.
     * @return null ak doslo k chybe, alebo su nevhodne parametre. Inak vrati spocitany skalarny sucin.
     */
    public static Integer dotProduct(int[] a, int[] b) {
        // TODO doplnte implementaciu
        if (a == null || b == null || a.length != b.length) {
            System.out.println("Došlo k chybe alebo parametre nie sú vhodné!");
            return null;
        }

        int vysledok = 0;
        for (int i = 0; i < a.length; i++) {
            vysledok += a[i] * b[i];
        }
        return vysledok;
    }
}
