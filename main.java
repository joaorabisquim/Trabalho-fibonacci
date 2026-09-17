import java.util.Scanner;

public class main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int n = scanner.nextInt();

        int primeiro = 0;
        int segundo= 1;

        for (int i = 0; i < n; i++){
            
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}