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
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        
        Produto cooler = new Produto("Watercooler CoolerMaster", 149.00, 1);
        Produto mouse = new Produto("Mouse Razer 7200DPI sem fio", 270.00, 2);
        Produto teclado = new Produto("Teclado mecanico Redragon Mitra brown switch", 325.00, 3);
        Produto monitor = new Produto("Monitor Samsung CRG50 27´´ 240Hz", 2999.00, 4);
        Produto placaDeVideo = new Produto("Placa de vídeo Nvidia RTX 3080 8Gb", 8499.00, 5);
        Produto memoriaRam = new Produto("2x Memoria RAM DDR4 Corsair 1800MHz 8GB", 449.00, 6);
        Produto gabinete = new Produto("Gabinete RGB", 229.00, 7);
        
        System.out.println("\nSeja bem-vindo à NRKTech, os melhores preços do mercado!");
        System.out.println("\nConfira nossos produtos:\n");
        System.out.println("Produto\t\t\t\t\t\t  Preço\t\tCodigo\n");
        System.out.println(cooler.getNome() + "\t\t\t R$ " + cooler.getPreco() + "\t  " + cooler.getCodigo() );
        System.out.println(mouse.getNome() + "\t\t\t R$ " + mouse.getPreco() + "\t  " + mouse.getCodigo());
        System.out.println(teclado.getNome() + "\t R$ " + teclado.getPreco() + "\t  " + teclado.getCodigo() );
        System.out.println(monitor.getNome() + "\t\t R$ " + monitor.getPreco() + "\t  " + monitor.getCodigo() );
        System.out.println(placaDeVideo.getNome() + "\t\t R$ " + placaDeVideo.getPreco() + "\t  " + placaDeVideo.getCodigo() );
        System.out.println(memoriaRam.getNome() + "\t\t R$ " + memoriaRam.getPreco() + "\t  " + memoriaRam.getCodigo() );
        System.out.println(gabinete.getNome() + "\t\t\t\t\t R$ " + gabinete.getPreco() + "\t  " + gabinete.getCodigo() );
        
        Produto[] vetorProdutos =  {cooler,mouse,teclado,monitor,placaDeVideo,memoriaRam,gabinete};
        
        System.out.println("\nQuantos produtos você deseja comprar?");
        int tamanhoVetorProdutos = input.nextInt();
        Fatura fatura = new Fatura(tamanhoVetorProdutos);
        int tamanhoCarrinho = 0;
        int codigo;
        
        do{
            System.out.println("Informe o codigo do produto desejado ou '0' para sair : ");
            codigo = input.nextInt();
           
            for(int i=0;i<vetorProdutos.length;i++){
                if(vetorProdutos[i].getCodigo() == codigo){
                    
                    Item item = new Item();
                    System.out.println("Quantos(as) " + "'" + vetorProdutos[i].getNome() + "'" + " que você deseja comprar: ");
                    item.setItem(vetorProdutos[i]);
                    item.setQuantidade(input.nextInt());
                    fatura.addItem(item);
                    tamanhoCarrinho++;
                }
            }
            if(tamanhoCarrinho == tamanhoVetorProdutos){
                System.out.println("\nLimite do carrinho atingido! Fim da Compra!");
                break;
            }
            
        }while(codigo != 0);
        fatura.faturaTotal();
        System.out.println("\nValor total:\t\tR$" + fatura.valorDaFatura());
    }
}
