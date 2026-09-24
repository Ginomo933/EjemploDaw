package Estructuras_de_decisión;

import java.util.Scanner;
public class Ejemplo25Est {
    static void main() {
        //VARIABLE
        boolean practicasentregadas = false;
        double nota;
        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Has entregado todas las practicas (si/no)");
        String practicas = sc.nextLine();
        System.out.println("Introduce tu nota: ");
        nota = sc.nextDouble();

        //PROGRAMA
        if (practicas.equalsIgnoreCase("si")){
            practicasentregadas = true;
        } else if (practicas.equalsIgnoreCase("no")) {
            practicasentregadas = false;

        }
        if (nota < 5){
            System.out.println("Estas: Suspenso");
        }else if (nota >= 5 && practicasentregadas == false){
            System.out.println("Suspenso por practicas pendientes");
        } else if (nota >= 5 && nota < 6 && practicasentregadas == true){
            System.out.println("Aprobado");
        }else if (nota >= 7 && nota < 8 && practicasentregadas == true){
        System.out.println("Notable");
        }else if (nota >= 9 && practicasentregadas == true){
            System.out.println("Sobresaliente");
        }
    }
}
