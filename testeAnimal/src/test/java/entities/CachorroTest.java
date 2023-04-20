package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CachorroTest {

    @Test
    public void testarGetRaca() {
        // Cenário
        Cachorro dog = new Cachorro("Toto", 10, "Hotdog");
        // Verificando
        Assertions.assertEquals("Hotdog", dog.getRaca());
    }

    @Test
    public void testarSetRaca() {
        Cachorro dog = new Cachorro();
        dog.setRaca("Rotvailwer");
        assertEquals("Rotvailwer", dog.getRaca());
    }

    @Test
    public void testarBarulho() {
        Cachorro dog = new Cachorro();
        Assertions.assertEquals("Au au", dog.fazerBarulho());

    }
}
