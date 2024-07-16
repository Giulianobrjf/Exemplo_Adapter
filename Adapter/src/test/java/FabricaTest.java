import org.example.Fabrica;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FabricaTest {


    @Test
    public void deveRetornarDescricaoRiscoFabrica() {
        Fabrica fabrica = new Fabrica();
        fabrica.setRisco("Muito Alto");

        assertEquals("Muito Alto", fabrica.getRisco());
    }

    @Test
    public void deveRetornarEscalaRiscoFabrica() {
        Fabrica fabrica = new Fabrica();
        fabrica.setRisco("Muito Alto");

        assertEquals(9, fabrica.getEscala());
    }

}
