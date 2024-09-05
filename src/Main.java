import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejercicios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ejercicio a realizar (1-20)"));
        if (ejercicios == 1)
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
    }
