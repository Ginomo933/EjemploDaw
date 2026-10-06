package Ejercicios;
import java.util.Scanner;
public class LogIN {
    static void main() {

            String contra = "WP01XL";
        String introducido;
        int maxIntentos = 0;

    for (int i = 0; i < 3; i++){
        System.out.println("Introduce la contraseña: ");
        Scanner sc = new Scanner(System.in);
        introducido = sc.next();
        if (contra.equals(introducido)){
            System.out.println("Contraseña correcta:");
            break;
        }
        if (contra != introducido){
            System.out.println("Contraseña incorrecta ");
            maxIntentos++;
            }
        }
        if (maxIntentos >= 3){
            System.out.println("Maximos intentos alcanzados: ");
        }
    }
}

