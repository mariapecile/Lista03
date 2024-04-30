package br.edu.up.modelos;

import java.util.Scanner;

public class ContadorPessoas {
    public void contarHomensEMulheres(int totalPessoas) {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido.");
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close();
    }
}
