// Crie um programa em Java que tendo como dados
// de entrada a altura (h) e o sexo de uma pessoa (1
// - Masculino e 2 - Feminino), calcular seu peso
// ideal, utilizando as seguintes fórmulas:
// – Para masculino
// PesoIdeal = (72.7*h) – 58;
// – Para feminino
// PesoIdeal = (62.1*h) – 44.7;

// Aula 2

import java.util.Scanner;

public class Exercicio4_2 {

    public static void main (String args[]){
        clear.limpar();
        
        double h, pesoIdeal;
        int opt;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print(" Se você é homem digite [1], se é mulher digite [2]. ");
        opt = entrada.nextInt();

        System.out.print(" Informe sua altura: ");
        h = entrada.nextDouble();

        if (opt == 1){

            pesoIdeal = (72.7*h) - 58;
            System.out.println (" Seu peso ideal é: " + pesoIdeal);

        }
        else{

            pesoIdeal = (62.1*h) - 44.7;
            System.out.println (" Seu peso ideal é: " + pesoIdeal);
        }
        entrada.close();

    }
    
}