package Estructuras_de_decisión;

import java.util.Scanner;
public class Ejemplo24Est {
    static void main() {
        //VARIABLE
        float descuento;
        boolean clientecheck = false;
        float compra;
        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres cliente: (si/no) ");
        String cliente = sc.nextLine();
        System.out.println("Introduce la compra: ");
        compra = sc.nextFloat();

        //PROGRAMA
        if (cliente.equalsIgnoreCase("si")){
            clientecheck = true;
        } else if (cliente.equalsIgnoreCase("no")) {
            clientecheck = false;
        }
        if (compra >= 50 && clientecheck == false){
            descuento = 0.05F;
            System.out.println("El importe es:" + (compra - (compra * descuento)));

        } else if (compra >= 50 && clientecheck == true) {
            descuento = 0.10F;
            System.out.println("El importe es:" + (compra - (compra * descuento)));
        }else {
            descuento = 0.15F;
            System.out.println("El importe es:" + (compra - (compra * descuento)));
        }


    }
}
