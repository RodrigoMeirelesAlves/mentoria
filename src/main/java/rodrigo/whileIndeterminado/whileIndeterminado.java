package rodrigo.whileIndeterminado;

import java.util.Scanner;

public class whileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palavra = "";
        while (!palavra.equalsIgnoreCase( "sair")){
            System.out.print("Você Diz: ");
            palavra = entrada.nextLine();
        }
        entrada.close();
    }
}
