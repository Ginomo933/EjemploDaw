package Refuerzo;
import java.util.Scanner;
public class Re19{
    static void main() {
        //VARIABLE
        double distancia;
        double velocidadmax;
        double segundos;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la distancia entre radares, la velocidad máxima permitida y cuanto tarda el coche: ");
        distancia = sc.nextInt();
        velocidadmax = sc.nextInt();
        segundos = sc.nextInt();


        double velocidadmedia = distancia/segundos;
        if (velocidadmedia * 3.6 > velocidadmax + velocidadmax * 0.2){
            System.out.println("Has perdido puntos");
        }else if(velocidadmedia * 3.6 > velocidadmax)
            System.out.println("Estas multado");
        else{
            System.out.println("Estas libre de multas");
        }
    }
}