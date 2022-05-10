/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * @author nrk
 */
public class Interpretadora {
    private HashSet<String> palavrasChave;
    private SuporteTecnico solucao; 
    
    public Interpretadora(){
        this.solucao = new SuporteTecnico();
        this.palavrasChave = new HashSet<>();
    }
    
    public void separaProblema(String problema){
        
        this.palavrasChave = new HashSet<>();
        
        StringTokenizer separaProblema = new StringTokenizer(problema);
        while(separaProblema.hasMoreTokens()){
            this.palavrasChave.add(separaProblema.nextToken());
        }
        retornaSolucao();
    }
    
    public boolean retornaSolucao(){
        
        for(String descricao: this.getPalavrasChave()){
           if(descricao!=null){
               if(solucao.buscaSolucao(descricao) == true){  
                   return true;
               }
           }  
        }
        solucao.buscaSolucaoPadrao();
        return true;
    }

    public HashSet<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(HashSet<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public SuporteTecnico getSolucao() {
        return solucao;
    }

    public void setSolucao(SuporteTecnico solucao) {
        this.solucao = solucao;
    }
    
}
