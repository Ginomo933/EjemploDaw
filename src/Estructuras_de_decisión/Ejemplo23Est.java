package Estructuras_de_decisión;

import java.util.Scanner;
public class Ejemplo23Est {
    static void main() {
        //VARIABLES
        float lado1;
        float lado2;
        float lado3;

        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los lados del triangulo: ");
        lado1 = sc.nextFloat();
        lado2 = sc.nextFloat();
        lado3 = sc.nextFloat();

        if (lado1 + lado2 > lado3) {
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
                System.out.println("El triangulo es equilatero, todros sus lados son iguales");
            }else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triangulo es isosceles, dos lados iguales y uno diferente");
            }else{
                System.out.println("El triangulo es escaleno, todos sus lados son diferentes");
            }

        }else {
            System.out.println("El triangulo no es válido");
        }
    }
}
