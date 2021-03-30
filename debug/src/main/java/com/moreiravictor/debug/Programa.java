package com.moreiravictor.debug;

import com.moreiravictor.debug.imc.CalculadorIMC;
import com.moreiravictor.debug.pessoa.Pessoa;


public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa ("Victor", 1.75, 70.0);

        final var CalculadoraIMC = new CalculadorIMC();
        final var imc = CalculadoraIMC.calcula(pessoa);
        
        System.out.printf("IMC = %.2f", imc);
    }

}