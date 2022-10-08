import java.util.Scanner;

public class Desafio {
    public static Boolean palindromo(String palavra){
        Boolean palindromo = true;
        int i = 0;
        int j = palavra.length() - 1;
        while (palindromo==true && i<j){
            if(palavra.charAt(i) != palavra.charAt(j)){
                palindromo = false;

            }
            i++;
            j--;
        }
        return palindromo;


    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
         String palavra = sc.nextLine();
        //System.out.println(palavra.length());

        System.out.println(palindromo(palavra).toString().toUpperCase());
    }
}
