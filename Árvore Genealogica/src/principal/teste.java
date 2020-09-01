/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
/**
 *
 * @author nrk
 */
public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao;
        
        System.out.println("Seu nome:");
        Pessoa pessoa1 = new Pessoa(input.next());
        
        System.out.println("Nome da mãe:");
        Pessoa mae = new Pessoa(input.next());
        pessoa1.setMae(mae);
        
        System.out.println("Nome do pai:");
        Pessoa pai = new Pessoa(input.next());
        pessoa1.setPai(pai);
        
        System.out.println("Nome do seu avô materno:");
        Pessoa paiDaMae = new Pessoa(input.next());
        mae.setPai(paiDaMae);
        
        System.out.println("Nome do seu avô paterno:");
        Pessoa paiDoPai = new Pessoa(input.next());
        pai.setPai(paiDoPai);
        
        System.out.println("Nome da sua avó materna:");
        Pessoa maeDaMae = new Pessoa(input.next());
        mae.setMae(maeDaMae);
        
        System.out.println("Nome da sua avó paterna:");
        Pessoa maeDoPai = new Pessoa(input.next());
        pai.setMae(maeDoPai);
        
        System.out.println("Quem você deseja analisar na árvore genealógica?");
        Pessoa pessoa2 = new Pessoa(input.next());
        
        System.out.println("Nome da mãe:");
        Pessoa mae2 = new Pessoa(input.next());
        pessoa2.setMae(mae2);
        
        System.out.println("Nome do pai:");
        Pessoa pai2 = new Pessoa(input.next());
        pessoa2.setPai(pai2);
        
        System.out.println("Comandos do programa:\nPara analisar se os nomes das "
                + "duas pessoas inseridas são semânticamente iguais: 'iguais'\n"
                + "Para analisar de os dois são irmãos: 'irmaos'\n"
                + "Para analisar se a segunda pessoa é ancestral da primeira: 'ancestral'\n"
                + "Fechar programa: 'exit'");
        
        do{
            opcao = input.next();
             
            if(opcao.toLowerCase().equals("iguais")){
                
                if(pessoa1.checkSemanticamenteIgual(pessoa2) == true){
                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " são a mesma pessoa!");
                }
                else{
                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " não são a mesma pessoa!");
                }              
            }
            
            if(opcao.toLowerCase().equals("irmaos")){
                
                if(pessoa1.checkIrma(pessoa2).toLowerCase().equals("pm")){
                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " são irmãos por parte de mãe!");
                }
                else if(pessoa1.checkIrma(pessoa2).toLowerCase().equals("pp")){
                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " são irmãos por parte de pai!");
                }      
                else if(pessoa1.checkIrma(pessoa2).toLowerCase().equals("pem")){
                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " são irmãos!");
                }
                else if(pessoa1.checkIrma(pessoa2).toLowerCase().equals("n")){
                    System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " não são irmãos!");
                }
            }
            if(opcao.toLowerCase().equals("ancestral")){
                
                if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("p")){
                    System.out.println(pessoa2.getNome() + " é pai de " + pessoa1.getNome() + "!");
                }
                else if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("m")){
                    System.out.println(pessoa2.getNome() + " é mãe de " + pessoa1.getNome() + "!");
                }
                else if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("vm")){
                    System.out.println(pessoa2.getNome() + " é avó materna de " + pessoa1.getNome() + "!");
                }
                else if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("vp")){
                    System.out.println(pessoa2.getNome() + " é avó paterna de " + pessoa1.getNome() + "!");
                }
                else if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("am")){
                    System.out.println(pessoa2.getNome() + " é avô materno de " + pessoa1.getNome() + "!");
                }
                else if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("ap")){
                    System.out.println(pessoa2.getNome() + " é avô paterno de " + pessoa1.getNome() + "!");
                }
                else if(pessoa1.checkAncestral(pessoa2).toLowerCase().equals("n")){
                    System.out.println(pessoa2.getNome() + " não é ancestral a " + pessoa1.getNome() + "!");
                }
            }
        }while(!opcao.toLowerCase().equals("exit"));
    }
}
