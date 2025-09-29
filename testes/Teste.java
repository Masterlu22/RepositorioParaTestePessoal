import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    //qualquer entrada retorne false

    @Test
    public void verificaSoma(){
        assertFalse(Calculadora.verificaValor(5));
    }
}
