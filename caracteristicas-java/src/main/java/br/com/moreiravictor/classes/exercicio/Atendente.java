package br.com.moreiravictor.classes.exercicio;

public class Atendente extends Funcionario{

    public Atendente(Double salario){
        super();
    }
    
    public Atendente(){
    }

    public Double calculaImposto(){
        return this.getSalario()*0.01;
    }
}
