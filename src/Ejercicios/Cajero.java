package Ejercicios;
import java.util.Scanner;
public class Cajero {
    static void main() {

        double dineroInicial = 500;
        double introducido;
        double retirado;
        int escrito;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu saldo incial");
        dineroInicial = sc.nextDouble();

        do {
            System.out.println("1-Ingresar 2-Retirar 0-Salir");
            escrito = sc.nextInt();
            if (escrito == 1){
                System.out.println("Cuanto dinero quieres introducir: ");
                introducido = sc.nextInt();
                dineroInicial = dineroInicial + introducido;
                System.out.println("Tu dinero actual: " + dineroInicial);
            }
            if (escrito == 2 ){
                System.out.println("Cuanto dinero deseas retirar: ");
                retirado = sc.nextInt();
                dineroInicial = dineroInicial - retirado;
                System.out.println("Tu dinero actual: " + dineroInicial);
            }
        }while (escrito != 0);
            System.out.println("Has salido del cajero, tu credito final: " + dineroInicial);
        }
    }

