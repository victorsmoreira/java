package br.com.moreiravictor.classes.exercicio;

public class Gerente extends Funcionario{

    public Gerente(Double salario) {
        super();
    }
    
    public Gerente() {
    }

    public Double calculaImposto(){
        return this.getSalario()*0.1;
    }
}
