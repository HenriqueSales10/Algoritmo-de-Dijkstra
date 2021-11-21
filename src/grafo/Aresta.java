/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author Ana Gonçalo
 */
public class Aresta {
    private Vertice verticeInicial;          //inicial
    private Vertice verticeFinal;          //final
    private boolean orientado;
    private String valor;
    private int custo;
    
    public Aresta(Vertice v, Vertice w){
        this.verticeInicial = v;
        this.verticeFinal = w;
        orientado = false;
    }
    public Aresta(Vertice v, Vertice w, boolean orientado){
        this.verticeInicial = v;
        this.verticeFinal = w;
        this.orientado = orientado;
    }

    public Vertice getV() {
        return verticeInicial;
    }

    public void setV(Vertice v) {
        this.verticeInicial = v;
    }

    public Vertice getW() {
        return verticeFinal;
    }

    public void setW(Vertice w) {
        this.verticeFinal = w;
    }

    public boolean isOrientado() {
        return orientado;
    }

    public void setOrientado(boolean orientado) {
        this.orientado = orientado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public Boolean hasVertice(Vertice x){
        return verticeInicial == x || verticeFinal == x;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
    
}
