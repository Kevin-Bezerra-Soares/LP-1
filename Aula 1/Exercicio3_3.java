import java.util.Scanner;

public class Exercicio3_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet [],i;
        vet = new int [5];
        int maior = vet[0];

        for (i=0; i<5; i++){

            System.out.println("Digite um número: ");
            vet [i] = sc.nextInt();
            if (vet[i] > maior){
                maior = vet[i];
            }
        }
        System.out.println(" O maio número é:" + maior);

    }
}
