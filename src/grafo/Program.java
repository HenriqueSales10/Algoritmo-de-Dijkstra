/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.Scanner;

/**
 *
 * @author Ana Gonçalo
 */
public class Program {

    public static void main(String args[]) {
        Scanner leitorScanner = new Scanner(System.in);

        Grafo grafo = new Grafo();

        //Inserindo Vertices
        grafo.inserirVertice("v1");
        grafo.inserirVertice("v2");
        grafo.inserirVertice("v3");
        grafo.inserirVertice("v4");
        grafo.inserirVertice("v5");
        grafo.inserirVertice("v6");
        grafo.inserirVertice("v7");
        grafo.inserirVertice("v8");
        grafo.inserirVertice("v9");

        //Inserindo Arestas
        grafo.inserirArestaOrientada("v1", "v2", 2);
        grafo.inserirArestaOrientada("v1", "v4", 2);
        grafo.inserirArestaOrientada("v1", "v3", 5);

        grafo.inserirArestaOrientada("v2", "v5", 1);
        grafo.inserirArestaOrientada("v2", "v3", 3);
        grafo.inserirArestaOrientada("v2", "v1", 2);

        grafo.inserirArestaOrientada("v3", "v8", 1);
        grafo.inserirArestaOrientada("v3", "v6", 1);
        grafo.inserirArestaOrientada("v3", "v4", 3);

        grafo.inserirArestaOrientada("v4", "v1", 2);
        grafo.inserirArestaOrientada("v4", "v3", 3);
        grafo.inserirArestaOrientada("v4", "v7", 2);

        grafo.inserirArestaOrientada("v5", "v2", 1);
        grafo.inserirArestaOrientada("v5", "v9", 7);
        grafo.inserirArestaOrientada("v5", "v3", 1);

        grafo.inserirArestaOrientada("v6", "v7", 2);
        grafo.inserirArestaOrientada("v6", "v3", 1);
        grafo.inserirArestaOrientada("v6", "v8", 3);

        grafo.inserirArestaOrientada("v7", "v4", 2);
        grafo.inserirArestaOrientada("v7", "v6", 2);

        grafo.inserirArestaOrientada("v8", "v9", 1);
        grafo.inserirArestaOrientada("v8", "v6", 3);
        grafo.inserirArestaOrientada("v8", "v3", 1);

        //Mostrando Matriz de Adjacência
        grafo.MatrizAdjacencia();

        System.out.println("Qual o Vertice final?");
        String fim = leitorScanner.next();

        while (!fim.equalsIgnoreCase("v9")) {
            System.out.println("Digite um vértice válido");
            System.out.println("Os vértices válidos são:");
            for (Vertice a : grafo.getVertices()) {
                System.out.println(a.getValor());
            }
            System.out.println("Insira novamente o vértice final");
            fim = leitorScanner.next();
        }
        
        

        //Executando o Algoritmo
        AlgotimoDijkstra teste = new AlgotimoDijkstra(grafo);
        teste.Algoritmo();

        teste.findCaminho(fim);

    }
}
