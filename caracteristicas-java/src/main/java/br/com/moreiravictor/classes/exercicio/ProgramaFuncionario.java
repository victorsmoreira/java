package br.com.moreiravictor.classes.exercicio;

public class ProgramaFuncionario {
    

    public static void main(String[] args){

        Gerente gerente = new Gerente();
        gerente.setSalario(1000.00);
        System.out.println(gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(1000.00);
        System.out.println(supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setSalario(1000.00);
        System.out.println(atendente.calculaImposto());
    }
}
