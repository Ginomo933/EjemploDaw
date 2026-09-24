package Ejercicios;

import java.util.Scanner;
public class Ejemplo19 {
    static void main(String[] args) {
        //DATOS
        float PrecioHora;
        int NumHoras;
        double Bruto;
        int NumHorasExtra;
        double Impuestos;
        double Neto;

        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuanto cobra por hora");
        PrecioHora = sc.nextFloat();
        System.out.println("Introduce la cantidad de horas");
        NumHoras = sc.nextInt();

        //PROGRAMA
        if (NumHoras >= 35){
            NumHorasExtra = NumHoras - 35;
            Bruto = (PrecioHora * NumHoras) + (NumHorasExtra * PrecioHora * 1.5);
        }else{
            Bruto = PrecioHora * NumHoras;
        }

        if (Bruto <= 500){
            Impuestos = 0;
            Neto = Bruto - Impuestos;
            System.out.println("El Pago Bruto serán: " + Bruto + "€");
            System.out.println("El Pago neto serán: " + Neto + "€");
            System.out.println("Retenidos: -" + Impuestos + "€");
        }else if (Bruto <= 900) {
            Impuestos = (Bruto - 500) * 0.25;
            Neto = Bruto - Impuestos;
            System.out.println("El Pago Bruto serán: " + Bruto + "€");
            System.out.println("El Pago neto serán: " + Neto + "€");
            System.out.println("Retenidos: -" + Impuestos + "€");
        }else{
            Impuestos = (400*0.25) + (Bruto - 900) * 0.45;
            Neto = Bruto - Impuestos;
            System.out.println("El Pago Bruto serán: " + Bruto + "€");
            System.out.println("El Pago neto serán: " + Neto  + "€");
            System.out.println("Retenidos: -" + Impuestos + "€");

        }

    }
}
