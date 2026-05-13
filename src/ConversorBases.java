// QUESTÃO 19
// Converter número decimal para base de 2 a 8 usando pilha

import java.util.Stack;
import java.util.Scanner;

public class ConversorBases {

    public static String converter(int numero, int base) {
        Stack<Integer> pilha = new Stack<>();

        while (numero > 0) {
            pilha.push(numero % base);
            numero = numero / base;
        }

        String resultado = "";

        while (!pilha.isEmpty()) {
            resultado += pilha.pop();
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número decimal: ");
        int numero = sc.nextInt();

        System.out.print("Digite a base (2 a 8): ");
        int base = sc.nextInt();

        System.out.println("Resultado: " + converter(numero, base));
    }
}