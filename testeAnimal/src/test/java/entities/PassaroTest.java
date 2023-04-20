package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassaroTest {

    @Test
    public void testarGetTipo() {
        // Cenário
        Passaro bird = new Passaro("Blue", 10, "Arara");
        // Verificando
        Assertions.assertEquals("Arara", bird.getTipo());
    }

    @Test
    public void testarSetTipo() {
        Passaro bird = new Passaro();
        bird.setTipo("Canario");
        Assertions.assertEquals("Canario", bird.getTipo());
    }

    @Test
    public void testarBarulho() {
        Passaro bird = new Passaro();
        Assertions.assertEquals("Cantando", bird.fazerBarulho());

    }
}
