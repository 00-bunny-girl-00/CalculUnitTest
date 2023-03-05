import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTest {
    @Test
    void calc(){
        Calcul calcul1 = new Calcul(2,2);
        Calcul calcul2 = new Calcul(10,5);
        Calcul calcul3 = new Calcul(3,3);
        Calcul calcul4 = new Calcul(10,5);
        
        assertEquals(4,calcul1.sum());
        assertEquals(5,calcul2.subtraction());
        assertEquals(9,calcul3.multiplication());
        assertEquals(2,calcul4.division());
    }
}