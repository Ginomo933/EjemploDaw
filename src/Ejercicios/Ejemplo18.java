package Ejercicios;

import java.util.Scanner;

public class Ejemplo18 {
    static void main() {
        //DATOS
        int horas;
        int minutos;
        int segundos;
        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cantidad de horas");
        horas = sc.nextInt();
        System.out.println("Introduce una cantidad de minutos");
        minutos = sc.nextInt();
        System.out.println("Introduce una cantidad de segundos");
        segundos = sc.nextInt();

        //PROGRAMA
        segundos = segundos + 1;

        if (segundos >= 60){
           minutos = minutos + (segundos/60);
           segundos = segundos % 60;
        }else if (segundos == 60 ) {
            segundos = 0;
            minutos++;
        }
        if (minutos >= 60){
            horas = horas + (minutos/60);
            minutos = minutos % 60;
        }else if (minutos == 60 ) {
            minutos = 0;
            horas++;
        }

        //IMPRIMIR
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
