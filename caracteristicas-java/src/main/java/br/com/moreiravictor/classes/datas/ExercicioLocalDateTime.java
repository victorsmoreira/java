package br.com.moreiravictor.classes.datas;

import java.time.LocalDateTime;

public class ExercicioLocalDateTime {

    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
