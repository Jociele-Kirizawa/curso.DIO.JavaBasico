import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Difite um numero");
        int numero = leitor.nextInt();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int posicao = -1;
        for ( int i =0; i < elementos.length; i++){
            if (numero == elementos[i]){
                posicao = i;
           }
        }
        if (posicao == -1) {
            System.out.println("Numero " + numero + "não encontrado");
        }
        else {
            System.out.println("Achei " + numero + "na posição"+ posicao);
        }
    }
}
