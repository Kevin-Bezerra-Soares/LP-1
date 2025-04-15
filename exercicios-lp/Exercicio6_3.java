// Faça um programa em linguagem Java para inserir
// dados em dois vetores de 20 posições de inteiros.
// A seguir, troque o 1º elemento de A com o 20º de
// B, o 2º de A com o 19º de B, e assim por diante, até
// trocar o 20º de A com o 1º de B. Mostre os vetores
// antes e depois da troca.

import java.util.Scanner;

public class Exercicio6_3 {
    public static void main(String[] args) {
        clear.limpar();
        int A[], B[], i,j, aux;
        A = new int[20];
        B = new int[20];
        Scanner sc = new Scanner(System.in);

        for (i=0; i<20; i++){
            System.out.println(" Informe um valor para o vetor A: ");
            A[i] = sc.nextInt();
        }
        i = 0;
        for (i=0; i<20; i++){
            System.out.println(" Informe um valor para o vetor B: ");
            B[i] = sc.nextInt();
        }

        j = 20;
        for (i=0; i<20; i++){
            aux = A[i];
            A[i] = B[j];
            B[j] = aux;
            j--;
        }

        for (i=0; i<20; i++){
            System.out.println(" Valores do vetor A: " + A[i]);
        }
        for (i=0; i<20; i++){
            System.out.println(" Valores do vetor B: " + B[i]);
        }
        
    }
}
