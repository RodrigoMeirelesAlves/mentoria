package rodrigo.notaIndeterminada;

import java.util.Scanner;

public class notaIndeterminada {

    public static void main(String[] args) {

      //  Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja
        //inválido e continue pedindo até que o usuário informe um valor válido.

        Scanner entrada = new Scanner(System.in);
         int nota = entrada.nextInt();

        do {
            System.out.println("Digite uma nota: ");
            System.out.println("Nota Invàlida");
            nota = entrada.nextInt();
        } while (nota > 0 ^ nota <= 10 );

        entrada.close();

        System.out.println("Obrigado");

    }

}
