package Ampliacion;
import java.util.Scanner;

public class Armstrong {
    static void main() {
        int armst;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce unm número para comprobar si es Armstrong: ");
        armst = sc.nextInt();

        int arm1 = (armst/100) % 10;
        int arm2 = (armst/10) % 10;
        int arm3 = armst % 10;

        //System.out.println(arm1);
        //System.out.println(arm2);
        // System.out.println(arm3);

       if (arm1*arm1*arm1 + arm2*arm2*arm2 + arm3*arm3*arm3 == armst){
           System.out.println("El numero: " + armst + " es Armstrong");
       }else {
           System.out.println("El numero: " + armst + " no es Armstrong");
       }
    }
}
