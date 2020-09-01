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
public class Pessoa {
    private String nome;
    private Pessoa mae;
    private Pessoa pai;
    
    public Pessoa(String nome){
        this.nome = nome;
        this.mae = null;
        this.pai = null;
    }

    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }
    
    public boolean checkSemanticamenteIgual(Pessoa pessoa){
        boolean flag;
        flag = this.nome.equals(pessoa.getNome()) && this.mae.nome.equals(pessoa.getMae().getNome());
        return flag;
    }
    
    public String checkIrma(Pessoa pessoa){
        String flag = "n";
        if(this.mae.nome.equals(pessoa.getMae().getNome())){
            flag = "pm";
        } 
        if(this.pai.nome.equals(pessoa.getPai().getNome())){
            flag = "pp";
        }
        if(this.mae.nome.equals(pessoa.getMae().getNome()) && this.pai.nome.equals(pessoa.getPai().getNome())) {
            flag = "pem";
        }
        return flag;
    }
    
    public String checkAncestral(Pessoa pessoa){
        String flag = "n";
        if(pessoa.getNome().equals(this.mae.nome)){
            flag = "m";
        } 
        else if(pessoa.getNome().equals(this.pai.nome)){
            flag = "p";
        }
        else if(pessoa.getNome().equals(this.mae.mae.nome)){
            flag = "vm";
        }
        else if(pessoa.getNome().equals(this.pai.mae.nome)){
            flag = "vp";
        }
        else if(pessoa.getNome().equals(this.mae.pai.nome)){
            flag = "am";
        }
        else if(pessoa.getNome().equals(this.pai.pai.nome)){
            flag = "ap";
        }
        return flag;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    
}
