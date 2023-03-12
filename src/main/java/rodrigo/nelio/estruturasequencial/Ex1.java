package rodrigo.nelio.estruturasequencial;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {


// Faça um programa para ler dois valores inteiros,e depois mostrar na tela a
// soma desses números com uma mensagem explicativa, conforme exemplos


            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite 1º número");
             int numero1 = entrada.nextInt();

            System.out.println("Digite 2º número");
                int numero2 = entrada.nextInt();

            System.out.println(" A soma = " + (numero1 + numero2));

            entrada.close();

        }
    }

