/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;


public class Estoque {

    private String nome;
    private int qntAtual;
    private int qntMinima;

    public Estoque(String nome, int qntAtual, int qntMinima) {
        this.nome = nome;
        this.qntAtual = qntAtual;
        this.qntMinima = qntMinima;
    }

    
    
    
    public void alterarQntMinima(int qntMinima){
        
        this.qntMinima = qntMinima;
        
    }
    
    public void reporEstoque(int addQnt){
        
        this.qntAtual += addQnt;
        
    }
    
    public void baixaEstoque(int tirarQnt){
        
        this.qntAtual -= tirarQnt;
        
    }
    
    public void mostrarDados(){
        
        System.out.println("Nome do Produto: " + this.nome );
        System.out.println("Quantidade no Estoque: " + this.qntAtual);
        System.out.println("Quantidade Minima: " + this.qntMinima);
        
    }
    
    public void precisaRepor(){
        
        if (this.qntAtual < this.qntMinima)
            System.out.println("Necessario repor");
        
    }
    
    
    
}
