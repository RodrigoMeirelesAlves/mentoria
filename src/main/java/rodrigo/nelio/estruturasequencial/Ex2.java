package rodrigo.nelio.estruturasequencial;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
// com quatro casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
            double raio = entrada.nextDouble();

            final double PI = 3.14159;
            double area = PI * Math.pow(raio,2);

        System.out.printf("A = %.4f\n " , area);

        entrada.close();

    }
}
