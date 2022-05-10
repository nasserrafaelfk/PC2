/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author nrk
 */
public class Fatura {
    private Item[] itens;
    private double valorTotal;
    private int posicao = 0;
    
    public Fatura(int tamanho){
        this.itens = new Item[tamanho];
        this.valorTotal = 0.0;
    }
    
    public Fatura (){
        this.itens = null;
        this.posicao = 0;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double valorDaFatura(){
        
        for(int i=0; i< itens.length; i++){
           
            if(itens[i]!= null){
                valorTotal = valorTotal + (itens[i].getItem().getPreco() * itens[i].getQuantidade());   
            }
        }
        return valorTotal;
    }
    
    public void addItem(Item itens){
        if(this.posicao < this.itens.length){
            this.itens[posicao] = itens;
            posicao++;   
        }
    }
    
    public void faturaTotal(){
        
        System.out.println("\nFatura total\n");
        System.out.println("Produto \t\t\t\t  Quantidade");
        
        for(int i = 0; i<this.itens.length; i++){
             if(this.itens[i]!= null){
                System.out.print(String.format("%1s",this.itens[i].getItem().getNome()));
                System.out.print(String.format("%25s",this.itens[i].getQuantidade() + "x R$" + this.itens[i].getItem().getPreco())+"\n"); 
            }          
        }    
    }
}
