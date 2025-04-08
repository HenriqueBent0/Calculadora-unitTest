
package test;


import model.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestCalculadora {
Calculadora calculadora;

@BeforeAll
void init(){
    calculadora = new Calculadora(4.0, 2.0);
}
    public TestCalculadora() {
    }


    @Test
    void testGetSomaConstrutorVazio() {

        Calculadora calculadora = new Calculadora();

        double retornoEsperado = 0.0;

        double retornoFeito = calculadora.getSoma();

        assertEquals(retornoEsperado, retornoFeito, 2);
   }
    @Test
    void testGetSoma() {

        double retornoEsperado = 5.0;

        double retornoFeito = calculadora.getSoma();

        assertEquals(retornoEsperado, retornoFeito, 2);
    }

    
    @Test
    void testGetDiferenca() {

        

        double retornoEsperado = 2.0;

        double retornoFeito = calculadora.getDiferenca();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    
    @Test
    void testGetProduto() {

        

        double retornoEsperado = 8.0;

        double retornoFeito = calculadora.getProduto();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    
    @Test
    void testGetQuociente() {

        

        double retornoEsperado = 2.0;

        double retornoFeito = calculadora.getQuociente();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}

