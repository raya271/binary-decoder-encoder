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
        //WHEN
        int dezimalZahl1 = umrechner.decode(binaerZahl1);
        int dezimalZahl2 = umrechner.decode(binaerZahl2);
        //THEN
        assertEquals(4, dezimalZahl1);
        assertEquals(33, dezimalZahl2);
    }
}