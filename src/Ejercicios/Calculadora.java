package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el número 1");
            double numero1 = Double.valueOf(leer.readLine());
            System.out.println("Ingrese el número 2");
            double numero2 = Double.valueOf(leer.readLine());
            System.out.println("Ingrese la operación\nSuma 1\nResta 2\nMultiplicación 3\nDivisión 4\nModulo 5");
            int op = Integer.parseInt(leer.readLine());
            Operar(numero1, numero2, op);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Operar(double n1, double n2, int operacion) {
        if (operacion == 1) {
            System.out.println("Suma " + Suma(n1, n2));
        } else if (operacion == 2) {
            System.out.println("Resta " + Resta(n1, n2));
        } else if (operacion == 3) {
            System.out.println("Multiplicación " + Multiplicación(n1, n2));
        } else if (operacion == 4) {
            System.out.println("División " + División(n1, n2));
        } else if (operacion == 5) {
            System.out.println("Modulo " + Modulo(n1, n2));

        } else {
            System.out.println("La operación no esta definida");
        }
    }

    public static double Suma(double n1, double n2) {
        return n1 + n2;
    }

    public static double Resta(double n1, double n2) {
        return n1 - n2;
    }

    public static double Multiplicación(double n1, double n2) {
        return n1 * n2;
    }

    public static double División(double n1, double n2) {
        return n1 / n2;
    }

    public static double Modulo(double n1, double n2) {
        return n1 % n2;
    }
}
