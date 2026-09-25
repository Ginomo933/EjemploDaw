package Ampliacion;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class RadarJava{
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
        if (velocidadmedia*3.6 > velocidadmax){
            System.out.println("Estas multado");
        }else {
            System.out.println("Estas libre de multas");
        }
    }
}