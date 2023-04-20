package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void testarGetNome() {
        // Cenário
        Animal animal = new Animal("Toto", 10);
        // Verificando
        Assertions.assertEquals("Toto", animal.getNome());
    }

    @Test
    public void testarSetNome() {
        Animal animal = new Animal();
        animal.setNome("Louro");
        assertEquals("Louro", animal.getNome());
    }

    @Test
    public void testarGetIdade() {
        Animal animal = new Animal("Toto",10);
        Assertions.assertEquals(10, animal.getIdade());
    }

    @Test
    public void testarSetIdade() {
        Animal animal = new Animal();
        animal.setIdade(17);
        assertEquals(17, animal.getIdade());
    }

    @Test
    public void testarBarulho() {
        Animal animal = new Animal();
        Assertions.assertEquals("Barulho", animal.fazerBarulho());

    }
}