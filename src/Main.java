import java.util.Locale;
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
        if (ejercicios == 4) {
            System.out.println("Ingrese la cantidad a devolver");
            float dev = sc.nextInt();
            float doscientos = dev / 200;
            float res1 = dev - (200 * doscientos);
            float cien = res1 / 100;
            float res2 = res1 - (100 * cien);
            float cinc = res2 / 50;
            float res3 = res2 - (50 * cinc);
            float veinte = res3 / 20;
            float res4 = res3 - (20 * veinte);
            float cinco = res4 / 5;
            float res5 = res4 - (cinco * 5);
            float dos = res5 / 2;
            float res6 = res5 - (dos * 2);
            float uno = res6 / 1;
            float res7 = res6 - (uno * 1);
            double cent = res7 / 0.05;
            double res8 = res7 - (cent * 0.05);
            System.out.println("necesitas " + doscientos + " billetes de doscientos," + "necesitas" + cien + "billete de cien," + "necesitas " + cinc + " billete de cincuenta," + " necesitas" + veinte + " billetes de veinte," + " necesitas" + cinc + " billetes de cinco," + "necesitas" + dos + " billetes de 2" + " necesitas " + uno + " billetes de uno," + "y tambien necesitas " + cent + " monedas de 5 centavos");
        }
        /*-------------------------------------------------EJERCICIO 5-----1------------------------------------------*/
        if (ejercicios == 5) {
            System.out.print("Ingrese un numero");
            int numero = sc.nextInt();
            String numerostring = String.valueOf(numero);
            System.out.println(numerostring);
        }
        /*-------------------------------------------------EJERCICIO 6 & 9-----------------------------------------------*/
        if (ejercicios == 6 || ejercicios== 9) {
            String mza = "La lluvia en Mendoza es escasa";
            int longitudmza = mza.length();
            if (ejercicios == 6){
            System.out.println("La longitud de la frase: La lluvia en Mendoza es escasa es " + longitudmza);}
            if (ejercicios == 9){
                int code= 0;
                for (int i = 0; i<longitudmza; i++){
                code = mza.codePointAt(i);
                System.out.print(code+ " ");
            }
            }
        }
        /*-------------------------------------------------EJERCICIO 7 & 8-----------------------------------------------*/
        // Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
        //vocales tiene en total (recorre el String con charAt
        if (ejercicios == 7 || ejercicios == 8)
            System.out.println("Ingrese una cadena, se determinara el tamaño de esta y cuantas vocales tendra");
        String cad = sc.nextLine().toLowerCase();
        if (ejercicios == 7) {
            int tam = cad.length();
            System.out.println("El tamaño de la cadena es de " + tam);
            int i;
            int vocales = 0;
            for (i = 0; i < tam; i++) {

                char a = cad.charAt(i);
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    vocales++;
                }
                ;
            }
            System.out.println("La cantidad de vocales es de " + vocales);
        } else if (ejercicios == 8) {
            String frase = cad;
            for (int i = 0; i < cad.length(); i++) {
            frase = cad.replace('a','e' );

            }
            System.out.println("ahora la frase quedaria como " + frase);
        }
        /*-------------------------------------------------EJERCICIO 10-----------------------------------------------*/
    if (ejercicios== 10) {
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        int opcion = 0;
        while (opcion < 1 || opcion > 2) {
            System.out.println("Ingrese si quiere convertir su frase en mayusculas o minusculas con 1 o 2");
            opcion = Integer.parseInt(sc.nextLine());
        }
        ;
        if (opcion == 1) {
            System.out.println("Su frase en mayuscula es " + frase.toUpperCase());
        }
        if (opcion == 2) {
            System.out.println("Su frase en mayuscula es " + frase.toLowerCase());
        }
    }
        /*-------------------------------------------------EJERCICIO 11-----------------------------------------------*/

        if (ejercicios==11)
        {System.out.println("Ingrese dos frases");
            System.out.println("Primera frase");
            String primera= sc.nextLine();
            System.out.println("Segunda frase");
            String segunda= sc.nextLine();
            int a = primera.compareTo(segunda);
            if (a>0){
            System.out.println("Las frases son distintas" );
            }
            if(a==0) {
                System.out.println("Las frases son iguales" );
            }

        }
        }













    }
