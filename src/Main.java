import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejercicios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ejercicio a realizar (1-20)"));
        /*-------------------------------------------------EJERCICIO 1-----------------------------------------------*/
        if (ejercicios == 1) {
            System.out.print("Ingrese un numero decimal");
            double num1 = sc.nextDouble();
            String numstring;
            numstring = String.valueOf(num1);
            System.out.println("El numero ingresado de tipo String es " + numstring);
            Short numshort = (short) num1;
            System.out.println("El numero ingresado de tipo Short es " + numshort);
            Integer numint = (int) num1;
            System.out.println("El numero ingresado de tipo Integer es " + numint);
            Long numlong = (long) num1;
            System.out.println("El numero ingresado de tipo Long es " + numlong);
            Float numfloat = (float) num1;
            System.out.println("El numero ingresado de tipo Float es " + numfloat);
        }
        /*-------------------------------------------------EJERCICIO 2-----------------------------------------------*/
        if (ejercicios == 2) {
            System.out.println("Ingrese un numero para saber si puede ser o no un byte");
            int a1 = sc.nextInt();
            if (a1 >= Byte.MIN_VALUE && a1 <= Byte.MAX_VALUE) {
                byte a2 = (byte) a1;
                System.out.println("El numero " + a2 + " esta dentro del rango de un byte");
            } else {
                System.out.println("El numero " + a1 + " esta fuera del rango para ser un byte");
            }
        }
        /*-------------------------------------------------EJERCICIO 3-----------------------------------------------*/
        if (ejercicios == 3) {
            int a;
            do {
                System.out.print("Ingresa un número de 3 dígitos (100 - 999): ");
                a = sc.nextInt();
                if (a < 100 || a > 999) {
                    System.out.println("El número no es válido. Debe estar entre 100 y 999.");
                }
            } while (a < 100 || a > 999);
            int u = a % 10;
            int d = (a / 10) % 10;
            int c = a / 100;
            int suma = u + d + c;
            System.out.println("La suma de los 3 digitos es " + suma);
        }
            /*-------------------------------------------------EJERCICIO 4-----------------------------------------------*/
        if (ejercicios == 4){}
            /*-------------------------------------------------EJERCICIO 5-----------------------------------------------*/
        if (ejercicios == 5) {
            System.out.print("Ingrese un numero");
            int numero = sc.nextInt();
            String numerostring = String.valueOf(numero);
            System.out.println(numerostring);
                }
        /*-------------------------------------------------EJERCICIO 6-----------------------------------------------*/
        if (ejercicios == 6){
            String mza = "La lluvia en Mendoza es escasa";
            int longitudmza = mza.length();
            System.out.println("La longitud de la frase:La lluvia en Mendoza es escasa es " +longitudmza);
        }
        /*-------------------------------------------------EJERCICIO 7-----------------------------------------------*/
       // Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
       //vocales tiene en total (recorre el String con charAt
        if (ejercicios == 7)
            System.out.println("Ingrese una cadena, se determinara el tamaño de esta y cuantas vocales tendra");
            String cad= sc.nextLine();
            int tam = cad.length();
            System.out.println("El tamaño de la cadena es de "+ tam);
        //no terminado
    }
    }
