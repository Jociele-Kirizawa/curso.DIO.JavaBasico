import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {


        Scanner number= new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = number.nextInt();

           if (num%3==0 && num%5==0){
               System.out.println("FizzBuzz");
           }
           else if (num%3==0) {
               System.out.println("Fizz");
           }
           else if (num % 5 == 0){
               System.out.println("Buzz");
           }
           else if (num%3!=0 || num%5!= 0){
               System.out.println(num);

        }
    }
}
