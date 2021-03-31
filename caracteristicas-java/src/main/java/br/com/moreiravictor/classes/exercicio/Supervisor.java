package br.com.moreiravictor.classes.exercicio;

public class Supervisor extends Funcionario{
    
    public Supervisor(Double salario){
        super();
    }

    public Supervisor(){
    }
    
    public Double calculaImposto(){
        return this.getSalario()*0.05;
    }
}