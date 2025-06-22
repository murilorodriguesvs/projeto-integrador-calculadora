package br.pucgoias.projetointegrador;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Deve somar dois números positivos corretamente")
    void testSomarDoisNumerosPositivos() {
        assertEquals(10, calc.somar(5, 5), "A soma de 5 + 5 deve ser 10");
    }

    @Test
    @DisplayName("Deve somar dois números negativos corretamente")
    void testSomarDoisNumerosNegativos() {
        assertEquals(-10, calc.somar(-5, -5), "A soma de -5 + -5 deve ser -10");
    }

    @Test
    @DisplayName("Deve somar um número positivo e um zero")
    void testSomarNumeroPositivoComZero() {
        assertEquals(7, calc.somar(7, 0), "A soma de 7 + 0 deve ser 7");
    }
}