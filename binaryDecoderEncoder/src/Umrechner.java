public class Umrechner {
    public int decode(String binaerZahl) {
        int ergebnis = 0;

        int length = binaerZahl.length();
        int zaehler = 0;

        while (length > 0) {
            if (binaerZahl.charAt(zaehler) == '1') {
                ergebnis += Math.pow(2, length-1);
            }
            length--;
            zaehler++;
        }

        return ergebnis;
    }

    public long encode(int dezimalZahl) {
        StringBuilder builder = new StringBuilder();
        while (dezimalZahl > 0) {
            String rest =  "" + (dezimalZahl % 2);
            builder.insert(0, rest);
            dezimalZahl = dezimalZahl/2;
        }
        return Long.parseLong(builder.toString());
    }
}
