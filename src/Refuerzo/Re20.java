package Refuerzo;
import java.util.Scanner;

public class Re20 {
    static void main() {
        //VARIABLE
        double ingresos;
        double gastos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los ingresos y los gastos estimados: ");
        ingresos = sc.nextDouble();
        gastos = sc.nextDouble();

        if (ingresos >= gastos){
            System.out.println("SI, pasas fin de mes");
        }else {
            System.out.println("NO, no pasas fin de mes");
        }
    }
}
