package br.com.moreiravictor.classes.datas;

import java.util.Calendar;

public class ExercicioDatas {
    public static void main(String[] args){

        Calendar agora = Calendar.getInstance();
        System.out.println("A data corrente é "+agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: "+agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: "+agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: "+agora.getTime().toInstant());

        System.out.println("Outras formatações:");
        System.out.printf("%tc\n", agora);
        System.out.printf("%tF\n", agora);
        System.out.printf("%tD\n", agora);
        System.out.printf("%tr\n", agora);
        System.out.printf("%tT\n", agora);
    }
}