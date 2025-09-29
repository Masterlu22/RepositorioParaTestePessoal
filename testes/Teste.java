import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    //qualquer entrada retorne false

    @Test
    public void verifica(){
        assertFalse(Calculadora.verificaValor(5));
    }

    //retorn true quando o número for positivo
    @Test
    public void verificaSinal(){
        assertTrue(Calculadora.verificaValor(5));
        assertFalse(Calculadora.verificaValor(-2));
    }

    //retorna true se o número for par
    @Test
    public void verificaPar(){
        assertTrue(Calculadora.verificaValor(4));
        assertFalse(Calculadora.verificaValor(3));
    }

}
