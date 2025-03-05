package br.ulbra.perfumes;

import java.util.Scanner;

// Classe principal
public class Main {

    public static void main(String[] args) {
        // Imports
        Scanner ler = new Scanner(System.in);
        PerfumeList perfumeList = new PerfumeList();
        // Variavel para o loop
        int op = 1;
        // Loop para rodar o Gerenciador de Perfumes, interrompido ao selecionar Sair
        while (op != 0) {
            // Opcoes
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Bem-vindo ao Gerenciador de Perfumes!");
            System.out.println("1 - Adicionar Perfume");
            System.out.println("2 - Alterar Perfume");
            System.out.println("3 - Remover Perfume");
            System.out.println("4 - Listar Perfumes");
            System.out.println("5 - Buscar Perfume");
            System.out.println("6 - Exibir Quantidade de Perfumes");
            System.out.println("7 - Ordenar Perfumes em Ordem Crescente");
            System.out.println("8 - Ordenar Perfumes em Ordem Decrescente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            // Codigos da opcao que o usuario ira selecionar
            switch (ler.nextInt()) {
                // Adicionar Perfume
                case 1:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.print("Digite o nome do perfume: ");
                    String nome = ler.next();
                    perfumeList.adicionarPerfume(nome);
                    break;
                // Alterar Perfume
                case 2:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.print("Digite o nome do perfume a ser alterado: ");
                    String nomeAntigo = ler.next();
                    System.out.print("Digite o novo nome do perfume: ");
                    String nomeNovo = ler.next();
                    perfumeList.alterarPerfume(nomeAntigo, nomeNovo);
                    break;
                // Remover Perfume
                case 3:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.print("Digite o nome do perfume a ser removido: ");
                    String remover = ler.next();
                    perfumeList.removerPerfume(remover);
                    break;
                // Listar Perfumes
                case 4:
                    System.out.println("--------------------------------------------------------------------------------------");
                    perfumeList.listarPerfumes();
                    break;
                // Buscar Perfumes
                case 5:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.print("Digite o nome do perfume para buscar: ");
                    String perfume = ler.next();
                    perfumeList.buscarPerfume(perfume);
                    break;
                // Exibir Quantidade de Perfumes
                case 6:
                    System.out.println("--------------------------------------------------------------------------------------");
                    perfumeList.quantidadePerfumes();
                    break;
                // Ordenar Perfumes em Ordem Crescente
                case 7:
                    System.out.println("--------------------------------------------------------------------------------------");
                    perfumeList.ordenarPerfumesA();
                    break;
                // Ordenar Perfumes em Ordem Decrescente
                case 8:
                    System.out.println("--------------------------------------------------------------------------------------");
                    perfumeList.ordenarPerfumesZ();
                    break;
                // Sair
                case 0:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Voce saiu, volte sempre!!!");
                    op = 0;
                    break;
                // Caso o xiru erre a opcao
                default:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Opcao invalida, tente novamente!");
            }
        }
    }
}
