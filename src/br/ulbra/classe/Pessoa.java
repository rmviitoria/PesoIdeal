/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classe;

/**
 *
 * @author s.lucas
 */
public class Pessoa{
    private double altura;
    private int sexo;
    private double pesoAtual;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    public double calcularPesoIdeal(){
        double pesoIdeal = 0;
        if(this.sexo ==1){
            pesoIdeal = (72.7 * altura)-58;
        }else{
            pesoIdeal=(62.1 * altura)-44.7;
        }
                return pesoIdeal;
    }
    public String verificarPeso(){
        String resp = "VERIFICAÇÃO DO PESO IDEAL\n";
        if(this.pesoAtual < (this.calcularPesoIdeal()-2)){
            resp = resp + "Abaixo do Peso!";
        }else if(this.pesoAtual >(this.calcularPesoIdeal()+2)){
            resp = resp + "Acima do peso";
        }else{
            resp = resp + "Peso Ideal";
        }
        return resp;
        
        
    }


    public String toString(){
        String resp, sex;
        if(sexo ==1){
            sex = "Masculino";
        }else{
            sex = "Feminino";
        }
        resp = "Sistema Dra \n"
                +"peso Atual:"+ pesoAtual
                +"\nAltura:"+ altura
                +"\nSexo:" +sex
                +"\n--------------\n"
                +verificarPeso();
        
        return resp;
    }

    
    
}
