package br.pucgoias.projetointegrador;
public class Calculadora {
      // Método para adição
    public double somar(double a, double b) {
        
        return a + b;
    }

    // Método para subtração
    public double subtrair(double a, double b) {

        return a - b;
    }

    // Método para multiplicação
    public double multiplicar(double a, double b) {

        return a * b;
    }

    // Método para divisão
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }
}
