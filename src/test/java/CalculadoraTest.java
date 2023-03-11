import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculadoraTest {

    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.soma(10,20);
        assertEquals(0,30,soma);
        // System.out.println(soma);
    }

    @Test
    public void verificaSeEPar(){
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificaPar(2);
        assertTrue(verifica);
    }
}