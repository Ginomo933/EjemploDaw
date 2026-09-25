package Ampliacion;
import java.util.Scanner;

public class LuckyNumber {
    static void main() {
        int dia;
        int mes;
        int año;
        int numerosuerte;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.println("Introduce tu año: ");
        año = sc.nextInt();

        //Progrmaa
        int d1=(dia/10) % 10;
        int d2=dia % 10;
        int m1=(mes/10) % 10;
        int m2=mes % 10;
        int a1=(año/1000) % 10;
        int a2=(año/100) %10;
        int a3=(año/10) % 10;
        int a4= año % 10;

        numerosuerte = d1 + d2 + m1 + m2 + a1 + a2 + a3 + a4;

        int ns1 = (numerosuerte/100);
        int ns2 = (numerosuerte/10);
        int ns3 = numerosuerte % 10;
        System.out.println("Tu numero de la suerte es: " + ns1 + ns2 + ns3);
    }
}
