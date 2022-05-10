package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import textFileApps.*;


public class Agenda {

    private HashMap<String,Contato> agenda;
    
    public Agenda(){
        
        this.agenda = new HashMap<>();
        lerArquivo();
        
    }
     
    public boolean inserirContato(Contato contato) {
        
        this.agenda.put(contato.getNome(), contato);
        return true;
    }

    public void salvar() {
        
        CreateTextFile.openFile();
        Set <String> chaves = this.agenda.keySet();
        Iterator <String> it = chaves.iterator();
        
        while (it.hasNext()){
            
            String aux = it.next();
            if(aux != null){
                
                CreateTextFile.addRecords((this.agenda.get(aux).getNome()+ ";"),(this.agenda.get(aux).getEndereco()+";"),(this.agenda.get(aux).getTelefone()+";"),(this.agenda.get(aux).getEmail()));   
            }
        }
        
        CreateTextFile.closeFile();
    }
   
    public Contato pesquisar(String nome) {       
        Set <String> chaves = this.agenda.keySet();
        Iterator <String> it = chaves.iterator();
        Contato contato = new Contato();
        
         while (it.hasNext()){ 
            String aux = it.next();
            if(aux != null){
                if(aux.equals(nome)){
                    contato.setNome(this.agenda.get(aux).getNome());
                    contato.setEndereco(this.agenda.get(aux).getEndereco());
                    contato.setTelefone(this.agenda.get(aux).getTelefone());
                    contato.setEmail(this.agenda.get(aux).getEmail());    
                }   
            }    
        }
        return contato;
    }
    
    private void lerArquivo(){
        
        ArrayList<String>contatos = new ArrayList<>();
        ReadTextFile.openFile();
        contatos = ReadTextFile.readRecords();
        ReadTextFile.closeFile();
        
        for(String c: contatos){
        
            String[] linha = c.split(";");
            System.out.println(linha[0]);
            Contato contato = new Contato();
            contato.setNome(linha[0]);
          
            if(linha[1]==null || linha[1].equals(" ")){
                linha[1] = " ";
            }else{
                contato.setEndereco(linha[1]);
            }
            if(linha[2]==null || linha[2].equals(" ")){
                linha[2] = " ";
            }else{
                contato.setTelefone(linha[2]);
            }
            if(linha[3] == null || linha[3].equals(" ")){
                linha[3] = " ";
            }else{
                contato.setEmail(linha[3]);
            }
            this.agenda.put(linha[0], contato);
        }   
    }

    public HashMap<String, Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(HashMap<String, Contato> agenda) {
        this.agenda = agenda;
    }

}
