import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UmrechnerTest {

    Umrechner umrechner;

    @BeforeEach
    void setUp() {
        umrechner = new Umrechner();
    }

    @Test
    void kannDecoden() {
        //GIVEN
        String binaerZahl1 = "100";
        String binaerZahl2 = "100001";
        String binaerZahl3 = "0001";
        //WHEN
        int dezimalZahl1 = umrechner.decode(binaerZahl1);
        int dezimalZahl2 = umrechner.decode(binaerZahl2);
        int dezimalZahl3 = umrechner.decode(binaerZahl3);
        //THEN
        assertEquals(4, dezimalZahl1);
        assertEquals(33, dezimalZahl2);
        assertEquals(1, dezimalZahl3);
    }

    @Test
    void kannEnconden() {
        // GIVEN
        int dezimalZahl1 = 10; // 10/2 = 5R0, 5/2 = 2R1, 2/2 = 1R0 1/2 = 0R1
        int dezimalZahl2 = 35;
        int dezimalZahl3 = 1024;
        // WHEN
        long binaerZahl1 = umrechner.encode(dezimalZahl1);
        long binaerZahl2 = umrechner.encode(dezimalZahl2);
        long binaerZahl3 = umrechner.encode(dezimalZahl3);
        //THEN
        assertEquals(1010, binaerZahl1);
        assertEquals(100011, binaerZahl2);
        assertEquals(10000000000L, binaerZahl3); //2^10 = 1024
    }
}