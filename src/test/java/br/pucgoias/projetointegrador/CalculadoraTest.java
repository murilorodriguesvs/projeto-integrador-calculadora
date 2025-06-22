package br.pucgoias.projetointegrador;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("Deve subtrair dois números corretamente")
    void testSubtrairDoisNumeros() {
        assertEquals(5, calc.subtrair(10, 5), "A subtração de 10 - 5 deve ser 5");
    }

    @Test
    @DisplayName("Deve subtrair um número de zero")
    void testSubtrairDeZero() {
        assertEquals(-5, calc.subtrair(0, 5), "A subtração de 0 - 5 deve ser -5");
    }

    @Test
    @DisplayName("Deve multiplicar dois números corretamente")
    void testMultiplicarDoisNumeros() {
        assertEquals(25, calc.multiplicar(5, 5), "A multiplicação de 5 * 5 deve ser 25");
    }

    @Test
    @DisplayName("Deve multiplicar qualquer número por zero e resultar em zero")
    void testMultiplicarPorZero() {
        assertEquals(0, calc.multiplicar(123, 0), "A multiplicação por 0 deve ser 0");
    }


    @Test
    @DisplayName("Deve dividir dois números corretamente")
    void testDividirDoisNumeros() {
        assertEquals(2, calc.dividir(10, 5), "A divisão de 10 / 5 deve ser 2");
    }

    @Test
    @DisplayName("Deve lançar uma exceção ao tentar dividir por zero")
    void testDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        }, "Deve lançar IllegalArgumentException ao dividir por zero");
    }


}