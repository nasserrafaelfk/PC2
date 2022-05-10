/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author nrk
 */
public class SuporteTecnico {
    private HashMap<String,String> bancoSolucoes;
    private ArrayList<String> respostaPadrao;
    
    public SuporteTecnico(){
        this.bancoSolucoes = new HashMap<>();
        this.respostaPadrao = new ArrayList<>();
        preencheBancoSolucoes();
        preencheRepostaPadrao();
    }
    private void preencheBancoSolucoes(){
        
        this.bancoSolucoes.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\ndo seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?" );
        this.bancoSolucoes.put("performance",  "A performance está próxima do esperado nos testes que realizamos. Você está\nexecutando algum outro processo em paralelo?");
        this.bancoSolucoes.put("bug","Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\njá estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
        this.bancoSolucoes.put("windows", "Este é um problema do sistema operacional Windows. Por favor,\nentre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
        this.bancoSolucoes.put("macintosh","Este é um problema do sistema operacional Mac. Por favor,\nentre em contato com a Apple. Não há nada que possamos fazer neste caso." );
        this.bancoSolucoes.put("caro","O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\ne comparou todas as características do nosso software com outras ofertas de mercado?");
        this.bancoSolucoes.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\nque farão todo o trabalho para você. Você já leu as instruções\n de instalação?" );
        this.bancoSolucoes.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\na memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
        this.bancoSolucoes.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\nMuitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?" );
        this.bancoSolucoes.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\nno seu sistema. Diga-me sobre sua configuração.");
        this.bancoSolucoes.put("danificou","Bom, nosso software não danificaria seu sistema. Deve ser algo específico\nno seu sistema. Diga-me sobre sua configuração." );

    }
    
    private void preencheRepostaPadrao(){
        
        this.respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
        this.respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \nQual é a sua configuração de sistema?");
        this.respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
        this.respostaPadrao.add("Preciso de maiores informações a respeito.");
        this.respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
        this.respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
        this.respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\nque poderia detalhar melhor este problema?");
        this.respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
        this.respostaPadrao.add("Você poderia explicar melhor?");
    } 
    
    public boolean buscaSolucao(String problema){
        
        Set <String> chaves = this.getBancoSolucoes().keySet();
        Iterator <String> it = chaves.iterator();
        
        while(it.hasNext()){
            String aux = it.next();
            if(aux != null){
                if(aux.equals(problema)){
                    System.out.println(this.getBancoSolucoes().get(aux)); 
                    return true;
                }
            }  
        }
        return false;
    }
    
    public void buscaSolucaoPadrao(){
        String solucaoAleatoria = this.getRespostaPadrao().get(new Random().nextInt(this.respostaPadrao.size()));
        System.out.println(solucaoAleatoria);   
    }
    
    public HashMap<String, String> getBancoSolucoes() {
        return bancoSolucoes;
    }

    public void setBancoSolucoes(HashMap<String, String> bancoSolucoes) {
        this.bancoSolucoes = bancoSolucoes;
    }

    public ArrayList<String> getRespostaPadrao() {
        return respostaPadrao;
    }

    public void setRespostaPadrao(ArrayList<String> respostaPadrao) {
        this.respostaPadrao = respostaPadrao;
    }
}
