package br.edu.up;

import java.util.Scanner;

import br.edu.up.modelos.ContadorPessoas;

public class AvaliadorPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContadorPessoas contador = new ContadorPessoas();

        System.out.println("Digite o número de pessoas a serem avaliadas: ");
        int totalPessoas = scanner.nextInt();

        contador.contarHomensEMulheres(totalPessoas);

        scanner.close();
    }
}
