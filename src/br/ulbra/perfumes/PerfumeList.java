package br.ulbra.perfumes;

import java.util.ArrayList;
import java.util.Collections;

// Classe da lista de perfume
public class PerfumeList {

    // Criando a a lista perfumes
    private ArrayList<String> perfumes;

    // Construtor importando a lista
    public PerfumeList() {
        this.perfumes = new ArrayList<>();
    }

    // Metodo para adicionar um novo perfume
    public void adicionarPerfume(String nome) {
        perfumes.add(nome);
        System.out.println("Perfume " + nome + " adicionado com sucesso!");
    }

    // Metodo para alterar um perfume existente na lista
    public void alterarPerfume(String nomeAntigo, String nomeNovo) {
        int ind = perfumes.indexOf(nomeAntigo);
        if (ind >= 0) {
            perfumes.set(ind, nomeNovo);
            System.out.println("Perfume " + nomeAntigo + " alterado para " + nomeNovo + " com sucesso!");
        } else {
            System.out.println("Perfume nao encontrado!");
        }
    }

    // Metodo para remover um perfume da lista
    public void removerPerfume(String nome) {
        if (perfumes.remove(nome)) {
            System.out.println("Perfume " + nome + " removido com sucesso!");
        } else {
            System.out.println("Perfume nao encontrado!");
        }
    }

    // Metodo para listar todos os perfumes, pode ser usado apos algum metodo que ordena a lista
    public void listarPerfumes() {
        if (perfumes.isEmpty()) {
            System.out.println("Nenhum perfume cadastrado.");
        } else {
            System.out.println("Lista de Perfumes:");
            for (int i = 0; i < perfumes.size(); i++) {
                System.out.println("- " + perfumes.get(i));
            }
        }
    }

    // Metodo para procurar um perfume em especifico
    public void buscarPerfume(String nome) {
        if (perfumes.contains(nome)) {
            System.out.println("O perfume " + nome + " esta cadastrado na posicao " + (1 + perfumes.indexOf(nome)));
        } else {
            System.out.println("Perfume nao encontrado.");
        }
    }

    // Metodo para mostrar quantos perfumes existe na lista
    public void quantidadePerfumes() {
        System.out.println("Quantidade total de perfumes: " + perfumes.size());
    }

    // Metodo para ordenar a lista em ordem alfabetica crescente
    public void ordenarPerfumesA() {
        Collections.sort(perfumes);
        System.out.println("Perfumes ordenados em ordem crescente com sucesso!");
    }

    // Metodo para ordenar a lista em ordem alfabetica decrescente
    public void ordenarPerfumesZ() {
        Collections.sort(perfumes, Collections.reverseOrder());
        System.out.println("Perfumes ordenados em ordem decrescente com sucesso!");
    }
}
