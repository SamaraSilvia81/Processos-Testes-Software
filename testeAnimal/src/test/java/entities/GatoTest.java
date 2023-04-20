package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GatoTest {

    @Test
    public void testarGetCor() {
        // Cenário
        Gato cat = new Gato("Mia", 10, "Malhado");
        // Verificando
        Assertions.assertEquals("Malhado", cat.getCor());
    }

    @Test
    public void testarSetCor() {
        Gato cat = new Gato();
        cat.setCor("Laranja");
        Assertions.assertEquals("Laranja", cat.getCor());
    }

    @Test
    public void testarBarulho() {
        Gato cat = new Gato();
        Assertions.assertEquals("Miau miau", cat.fazerBarulho());

    }
}
