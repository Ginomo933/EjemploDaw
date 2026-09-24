package Estructuras_de_decisión;

import java.util.Scanner;
public class Ejemplo22Est {
    static void main() {
        //DATOS
        double Consumo;
        double PrecioporKwh;
        double Importe;

        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu consumo mensual:");
        Consumo = sc.nextDouble();

        //PROGRAMA
        if (Consumo < 100) {
            PrecioporKwh = 0.10;
            Importe = Consumo * PrecioporKwh;
            System.out.println("Deberás pagar: " + Importe);
        } else if (Consumo >= 101 && Consumo < 300) {
            PrecioporKwh = 0.15;
            Importe =  (Consumo - 100 * 0.10) + (Consumo * PrecioporKwh);
            System.out.println("Deberás pagar:" + Importe);
        }else {
            PrecioporKwh = 0.20;
            Importe = (Consumo - 100 * 0.10) + (Consumo - 199 * 0.15) + (Consumo * PrecioporKwh);
            System.out.println("Deberás pagar:" + Importe);

        }
    }
}
