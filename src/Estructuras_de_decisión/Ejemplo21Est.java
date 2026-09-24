package Estructuras_de_decisión;

import java.util.Scanner;
public class Ejemplo21Est {
    static void main() {
        //DATOS
        double peso;
        double altura;
        double IMC;

        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu peso:");
        peso = sc.nextDouble();
        System.out.println("Introduce tu altura");
        altura = sc.nextDouble();

        //PROGRAMA
        IMC = peso/(altura * altura) ;
        if (IMC < 18.5) {
            System.out.println("Tu IMC es de:" + IMC + "BAJO PESO");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Tu IMC es de:" + IMC + "NORMAL");
        }else if (IMC >= 25 && IMC < 29.9) {
            System.out.println("Tu IMC es de:" + IMC + "SOBREPESO");
        }else {
            System.out.println("Tu IMC es de: " + IMC + " OBESIDAD");
        }
    }
}
