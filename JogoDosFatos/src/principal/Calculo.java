/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;

/**
 *
 * @author nrk
 */
public class Calculo {
    private int operando1;
    private int operando2;
    private int resultado;
    
    public Calculo(int operando1, int operando2, int resultado){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = resultado;
    }

    public void calcula(){
        Random gerador = new Random();
        
        this.operando1 = gerador.nextInt(98) + 1;
        this.operando2 = gerador.nextInt(98) + 1;
        int operador = gerador.nextInt(4);
        
        switch(operador){
            case 0: this.resultado = this.operando1 + this.operando2;
                break;
            case 1: this.resultado = this.operando1 - this.operando2;
                break;
            case 2: this.resultado = this.operando1 * this.operando2;
                break;
            case 3: this.resultado = this.operando1 / this.operando2;
                break;
        }
    }
    
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
     
}
